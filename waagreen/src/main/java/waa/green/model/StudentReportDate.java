package waa.green.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;

public class StudentReportDate {
    private double per;
    List<Date> dateofmed;
    private int possibledays;
    private int daysattended;
    private boolean available=true;

    public double getPer() {
        return per;
    }

    public void setPer(double per) {
        this.per = per;
    }

      public int getPossibledays() {
        return possibledays;
    }

    public List<Date> getDateofmed() {
        return dateofmed;
    }

    public void setDateofmed(List<Date> dateofmed) {
        this.dateofmed = dateofmed;
    }

    @Override
    public String toString() {
        return "StudentReportDate [per=" + per + ", dateofmed=" + dateofmed + ", possibledays=" + possibledays
                + ", daysattended=" + daysattended + ", available=" + available + "]";
    }

    public void setPossibledays(int possibledays) {
        this.possibledays = possibledays;
    }

    public int getDaysattended() {
        return daysattended;
    }

    public void setDaysattended(int daysattended) {
        this.daysattended = daysattended;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

    public StudentReportDate(double per, int possibledays, int daysattended) {
        super();
        this.per = per;
        this.possibledays = possibledays;
        this.daysattended = daysattended;
    }


}
