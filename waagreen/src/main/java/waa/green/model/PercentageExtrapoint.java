package waa.green.model;

public class PercentageExtrapoint {
    private double percentage;
    private double extrapoint;
    private Student student;
    private int meditationdays;
    private int possibledays;

    public int getPossibledays() {
        return possibledays;
    }

    public void setPossibledays(int possibledays) {
        this.possibledays = possibledays;
    }

    public int getMeditationdays() {
        return meditationdays;
    }

    public void setMeditationdays(int meditationdays) {
        this.meditationdays = meditationdays;
    }

    public PercentageExtrapoint(double percentage, double extrapoint, Student student, int meditationdays, int possibledays) {
        this.percentage = percentage;
        this.extrapoint = extrapoint;
        this.student = student;
        this.meditationdays = meditationdays;
        this.possibledays = possibledays;
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
