package com.speedtest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SpeedTestData {
    private Map<String, List<SpeedTest>> dataByDate;
    public SpeedTestData() {
        this.dataByDate = new HashMap<>();
    }
    public Map<String, List<SpeedTest>> getDataByDate() {
        return dataByDate;
    }
    public void addSpeedTest(String date, SpeedTest speedTest) {
        List<SpeedTest> tests = dataByDate.computeIfAbsent(date, k -> new ArrayList<>());
        tests.add(speedTest);
    }
}