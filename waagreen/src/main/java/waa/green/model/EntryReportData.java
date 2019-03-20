package waa.green.model;

public class EntryReportData {
    private String student_id;
    private String name;
    private double percentage;
    private long total;
    private long possible;

    public EntryReportData(String student_id, String name, double percentage, long total, long possible) {
        this.student_id = student_id;
        this.name = name;
        this.percentage = percentage;
        this.total = total;
        this.possible = possible;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPercentage() {
        return percentage;
    }

    public void setPercentage(double percentage) {
        this.percentage = percentage;
    }

    public long getTotal() {
        return total;
    }

    public void setTotal(long total) {
        this.total = total;
    }

    public long getPossible() {
        return possible;
    }

    public void setPossible(long possible) {
        this.possible = possible;
    }

    public String getStudent_id() {
        return student_id;
    }

    public void setStudent_id(String student_id) {
        this.student_id = student_id;
    }
}
