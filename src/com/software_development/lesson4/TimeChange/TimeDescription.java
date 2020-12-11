package com.software_development.lesson4.TimeChange;

public class TimeDescription {
    private int hours;
    private int minutes;
    private int seconds;

    TimeDescription(int hours, int minutes, int seconds) {
        this.hours = hours;
        this.minutes = minutes;
        this.seconds = seconds;
    }

    int getHours() {
        if (hours > 24 || hours < 0)
            hours = 0;
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    int getMinutes() {
        if (minutes > 60 || minutes < 0)
            minutes = 0;
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    int getSeconds() {
        if (seconds > 60 || seconds < 0)
            seconds = 0;
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    @Override
    public String toString() {
        return "TimeDescription" +
                "hours=" + hours +
                ", minutes=" + minutes +
                ", seconds=" + seconds;
    }
}
