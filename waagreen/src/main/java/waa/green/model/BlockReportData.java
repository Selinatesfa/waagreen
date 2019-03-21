package waa.green.model;

import java.util.Date;

public class BlockReportData {
    private Date date;
    private boolean present;

    public BlockReportData(Date date, boolean present) {
        this.date = date;
        this.present = present;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isPresent() {
        return present;
    }

    public void setPresent(boolean present) {
        this.present = present;
    }
}
