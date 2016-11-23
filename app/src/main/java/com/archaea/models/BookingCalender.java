package com.archaea.models;

/**
 * Created by vizsatiz on 24-11-2016.
 */
public class BookingCalender {

    private String day;
    private int date;

    public BookingCalender(int date, String day) {
        this.date = date;
        this.day = day;
    }

    public int getDate() {
        return date;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }
}
