package com.software_development.lesson4.Airline;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Airline {
    private String wayPoint;
    private String planeType;
    private Date departureTime;
    private DaysOfWeek daysOfWeek;


    public Airline(String wayPoint, String planeType, Date departureTime, DaysOfWeek daysOfWeek) {
        this.wayPoint = wayPoint;
        this.planeType = planeType;
        this.departureTime = departureTime;
        this.daysOfWeek = daysOfWeek;
    }

    @Override
    public String toString() {
        return "Runner{" +
                "wayPoint='" + wayPoint + '\'' +
                ", planeType='" + planeType + '\'' +
                ", departureTime=" + departureTime +
                ", daysOfWeek=" + daysOfWeek +
                '}';
    }

    public String getWayPoint() {
        return wayPoint;
    }

    public void setWayPoint(String wayPoint) {
        this.wayPoint = wayPoint;
    }

    public String getPlaneType() {
        return planeType;
    }

    public void setPlaneType(String planeType) {
        this.planeType = planeType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public DaysOfWeek getDaysOfWeek() {
        return daysOfWeek;
    }

    public void setDaysOfWeek(DaysOfWeek daysOfWeek) {
        this.daysOfWeek = daysOfWeek;
    }
}
