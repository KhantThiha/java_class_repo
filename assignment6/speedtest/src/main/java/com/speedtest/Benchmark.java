package com.speedtest;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;


public class Benchmark {
    private static final String JSON_FILE_PATH = "assignment6\\speedtest\\src\\main\\resources\\speed_test_results.json";
    private static final ObjectMapper mapper = new ObjectMapper().enable(SerializationFeature.INDENT_OUTPUT);
    private static final SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
    private static final DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static void hourly(){
        float downloadSpeed = SpeedTest.download_speed();
        float uploadSpeed = SpeedTest.upload_speed();
        float ping = SpeedTest.ping();
        SpeedTest speedTest = new SpeedTest(downloadSpeed, uploadSpeed, ping,timeFormat.format(LocalTime.now()).toString());
        String currentDate = dateFormat.format(new Date());
        
        try {
            SpeedTestData speedTestData = readExistingData();
            speedTestData.addSpeedTest(currentDate,speedTest);
            mapper.writeValue(new File(JSON_FILE_PATH), speedTestData);
            System.out.println("Hourly speed test data saved successfully.");
        } catch (IOException e) {
            System.err.println("Error writing speed test data to JSON file: " + e.getMessage());
        }
    }

    private static SpeedTestData readExistingData() throws IOException {
        File file = new File(JSON_FILE_PATH);
        if (file.exists() && file.length() > 0) {
            return mapper.readValue(file, SpeedTestData.class);
        } else {
            return new SpeedTestData();
        }
    }


    public static float download_average(String date) {
        try {
            SpeedTestData speedTestData = readExistingData();
            Map<String, List<SpeedTest>> dataByDate = speedTestData.getDataByDate();

            if (dataByDate.containsKey(date)) {
                List<SpeedTest> tests = dataByDate.get(date);
                float sum = 0;
                for (SpeedTest test : tests) {
                    sum += test.getDownloadSpeed();
                }
                return sum / tests.size();
            } else {
                System.out.println("No data found for date: " + date);
                return 0; // or throw an exception based on your requirement
            }
        } catch (IOException e) {
            System.err.println("Error reading speed test data from JSON file: " + e.getMessage());
            return 0; // or handle the error as appropriate
        }
    }
    public static float upload_average(String date) {
        try {
            SpeedTestData speedTestData = readExistingData();
            Map<String, List<SpeedTest>> dataByDate = speedTestData.getDataByDate();

            if (dataByDate.containsKey(date)) {
                List<SpeedTest> tests = dataByDate.get(date);
                float sum = 0;
                for (SpeedTest test : tests) {
                    sum += test.getUploadSpeed();
                }
                return sum / tests.size();
            } else {
                System.out.println("No data found for date: " + date);
                return 0; // or throw an exception based on your requirement
            }
        } catch (IOException e) {
            System.err.println("Error reading speed test data from JSON file: " + e.getMessage());
            return 0; // or handle the error as appropriate
        }
    }

    public static float ping_average(String date) {
        try {
            SpeedTestData speedTestData = readExistingData();
            Map<String, List<SpeedTest>> dataByDate = speedTestData.getDataByDate();

            if (dataByDate.containsKey(date)) {
                List<SpeedTest> tests = dataByDate.get(date);
                float sum = 0;
                for (SpeedTest test : tests) {
                    sum += test.getPing();
                }
                return sum / tests.size();
            } else {
                System.out.println("No data found for date: " + date);
                return 0; // or throw an exception based on your requirement
            }
        } catch (IOException e) {
            System.err.println("Error reading speed test data from JSON file: " + e.getMessage());
            return 0; // or handle the error as appropriate
        }
    }
     public static List<Map<String, Object>> downloads(String date) {
        try {
            SpeedTestData speedTestData = readExistingData();
            Map<String, List<SpeedTest>> dataByDate = speedTestData.getDataByDate();

            List<Map<String, Object>> downloads = new ArrayList<>();

            if (date != null && !date.isEmpty()) {
                if (dataByDate.containsKey(date)) {
                    List<SpeedTest> tests = dataByDate.get(date);
                    for (SpeedTest test : tests) {
                        Map<String, Object> downloadData = Map.of(
                                "downloadSpeed", test.getDownloadSpeed(),
                                "timestamp", test.getTimestamp()
                        );
                        downloads.add(downloadData);
                    }
                }
            } else {
                for (Map.Entry<String, List<SpeedTest>> entry : dataByDate.entrySet()) {
                    for (SpeedTest test : entry.getValue()) {
                        Map<String, Object> downloadData = Map.of(
                                "downloadSpeed", test.getDownloadSpeed(),
                                "timestamp", test.getTimestamp()
                        );
                        downloads.add(downloadData);
                    }
                }
            }

            return downloads;
        } catch (IOException e) {
            System.err.println("Error reading speed test data from JSON file: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static List<Map<String, Object>> uploads(String date) {
        try {
            SpeedTestData speedTestData = readExistingData();
            Map<String, List<SpeedTest>> dataByDate = speedTestData.getDataByDate();

            List<Map<String, Object>> uploads = new ArrayList<>();

            if (date != null && !date.isEmpty()) {
                if (dataByDate.containsKey(date)) {
                    List<SpeedTest> tests = dataByDate.get(date);
                    for (SpeedTest test : tests) {
                        Map<String, Object> uploadData = Map.of(
                                "uploadSpeed", test.getUploadSpeed(),
                                "timestamp", test.getTimestamp()
                        );
                        uploads.add(uploadData);
                    }
                }
            } else {
                for (Map.Entry<String, List<SpeedTest>> entry : dataByDate.entrySet()) {
                    for (SpeedTest test : entry.getValue()) {
                        Map<String, Object> uploadData = Map.of(
                                "uploadSpeed", test.getUploadSpeed(),
                                "timestamp", test.getTimestamp()
                        );
                        uploads.add(uploadData);
                    }
                }
            }

            return uploads;
        } catch (IOException e) {
            System.err.println("Error reading speed test data from JSON file: " + e.getMessage());
            return new ArrayList<>();
        }
    }

    public static List<Map<String, Object>> pings(String date) {
        try {
            SpeedTestData speedTestData = readExistingData();
            Map<String, List<SpeedTest>> dataByDate = speedTestData.getDataByDate();

            List<Map<String, Object>> pings = new ArrayList<>();

            if (date != null && !date.isEmpty()) {
                if (dataByDate.containsKey(date)) {
                    List<SpeedTest> tests = dataByDate.get(date);
                    for (SpeedTest test : tests) {
                        Map<String, Object> pingData = Map.of(
                                "ping", test.getPing(),
                                "timestamp", test.getTimestamp()
                        );
                        pings.add(pingData);
                    }
                }
            } else {
                for (Map.Entry<String, List<SpeedTest>> entry : dataByDate.entrySet()) {
                    for (SpeedTest test : entry.getValue()) {
                        Map<String, Object> pingData = Map.of(
                                "ping", test.getPing(),
                                "timestamp", test.getTimestamp()
                        );
                        pings.add(pingData);
                    }
                }
            }

            return pings;
        } catch (IOException e) {
            System.err.println("Error reading speed test data from JSON file: " + e.getMessage());
            return new ArrayList<>();
        }
    }
}
