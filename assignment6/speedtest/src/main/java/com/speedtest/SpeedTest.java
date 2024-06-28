package com.speedtest;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class SpeedTest {
    private float downloadSpeed;
    private float uploadSpeed;
    private float ping;
    private String timestamp;
    
    public SpeedTest() {
    }
    @JsonCreator
    public SpeedTest(@JsonProperty("downloadSpeed") float downloadSpeed,
                     @JsonProperty("uploadSpeed") float uploadSpeed,
                     @JsonProperty("ping") float ping,
                     @JsonProperty("timestamp") String timestamp) {
        this.downloadSpeed = downloadSpeed;
        this.uploadSpeed = uploadSpeed;
        this.ping = ping;
        this.timestamp = timestamp;
    }
    public float getDownloadSpeed() {
        return downloadSpeed;
    }

    public float getUploadSpeed() {
        return uploadSpeed;
    }

    public float getPing() {
        return ping;
    }
    public String getTimestamp() {
        return timestamp;
    }
    @JsonProperty("download_speed")
    public static float download_speed(){
        return (float)(Math.random() *300);
    }
    @JsonProperty("upload_speed")
    public static float upload_speed(){
        return (float)(Math.random() *300);
    }
    @JsonProperty("ping")
    public static float ping(){
        return (float)(Math.random() *300);
    }
}
