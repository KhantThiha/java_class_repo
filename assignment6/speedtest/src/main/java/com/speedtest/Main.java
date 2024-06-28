package com.speedtest;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

public class Main {
    private static final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);
    public static void main(String[] args) {
        RunEveryHour();

        //Test
        // System.out.println(Benchmark.download_average("2024-06-28"));
        // System.out.println(Benchmark.upload_average("2024-06-28"));
        // System.out.println(Benchmark.ping_average("2024-06-28"));
        // System.out.println(Benchmark.downloads("2024-06-28"));
        // System.out.println(Benchmark.uploads("2024-06-28"));
        // System.out.println(Benchmark.pings("2024-06-28"));
    }

    public static void RunEveryHour() {
        final Runnable runner = new Runnable() {
            public void run() { 
                Benchmark.hourly();
            }
        };
        
        // Schedule the task to run every second (change 1 to 3600 for every hour)
        final ScheduledFuture<?> runnerHandle =
            scheduler.scheduleAtFixedRate(runner, 1, 1, TimeUnit.SECONDS); // Change to TimeUnit.HOURS , use seconds for test purpose 
        
        // Schedule to cancel the task after a week (24 * 7 hours)
        scheduler.schedule(new Runnable() {
            public void run() { 
                runnerHandle.cancel(true); 
                System.exit(0);
            }
        }, 24*7, TimeUnit.HOURS);
    }
}