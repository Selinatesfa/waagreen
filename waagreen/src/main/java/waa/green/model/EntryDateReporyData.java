package waa.green.model;

import java.util.Date;

public class EntryDateReporyData {
    private Date date;
    private Boolean booleandata;

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Boolean getBooleandata() {
        return booleandata;
    }

    public void setBooleandata(Boolean booleandata) {
        this.booleandata = booleandata;
    }

    public EntryDateReporyData(Date date, Boolean booleandata) {
        this.date = date;
        this.booleandata = booleandata;
    }
}
