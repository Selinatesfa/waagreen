package waa.green.model;

import java.util.Date;
import java.util.List;

public class StudentReportDate {
private double per;
private List<Date> dateofmed;
private int possibledays;
private int daysattended;
private boolean available;
public double getPer() {
	return per;
}
public void setPer(double per) {
	this.per = per;
}

public List<Date> getDateofmed() {
	return dateofmed;
}
public void setDateofmed(List<Date> dateofmed) {
	this.dateofmed = dateofmed;
}
public int getPossibledays() {
	return possibledays;
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
