package com.StrangerPings2340.app;

import com.google.firebase.database.ServerValue;

import java.util.Date;
import java.util.Map;

/**
 * Created by Rishab on 2/24/2017.
 */

public class WaterSourceReport {

    private long timestamp;
    private String name;
    private String location;
    private String waterType;
    private String waterCondition;
    private int reportNumber;

    public WaterSourceReport() {}

    public int getReportNumber() {
        return reportNumber;
    }

    public void setReportNumber(int reportNumber) {
        this.reportNumber = reportNumber;
    }

    public long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(long timestamp) {
        this.timestamp = timestamp;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getWaterType() {
        return waterType;
    }

    public void setWaterType(String waterType) {
        this.waterType = waterType;
    }

    public String getWaterCondition() {
        return waterCondition;
    }

    public void setWaterCondition(String waterCondition) {
        this.waterCondition = waterCondition;
    }


    public String toString() {
        return "Report " + Integer.toString(reportNumber) +
                ":\n\nLocation: " + location + "\nWater Condition: " + waterCondition + "\n";
    }






}
