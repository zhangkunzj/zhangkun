package com.zk;

public class Clock {
    int hour;
    int minute;
    int second;
    String color;
    String timezone;

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getSecond() {
        return second;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getTimezone() {
        return timezone;
    }

    public void setTimezone(String timezone) {
        this.timezone = timezone;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void showTime(){
        System.out.println("现在时间是"+hour+minute+second);
    }

}
