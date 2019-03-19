package waa.green.model;

public class PercentageExtrapoint {
private double percentage;
private double extrapoint;
private Student student;

public PercentageExtrapoint(double percentage, double extrapoint, Student student) {
	super();
	this.percentage = percentage;
	this.extrapoint = extrapoint;
	this.student = student;
}
public PercentageExtrapoint() {
}
	public Student getStudent() {
	return student;
}
public void setStudent(Student student) {
	this.student = student;
}
public double getPercentage() {
	return percentage;
}
public void setPercentage(double percentage) {
	this.percentage = percentage;
}
public double getExtrapoint() {
	return extrapoint;
}
public void setExtrapoint(double extrapoint) {
	this.extrapoint = extrapoint;
}

}
