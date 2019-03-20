package waa.green.formatter;

import org.springframework.format.Formatter;
import org.springframework.stereotype.Component;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

@Component
public class DateFormatter implements Formatter<Date> {
    @Override
    public Date parse(String str, Locale locale) {
        Date date = null;
        try {
            date = this.dateFormat(str);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return date;
    }

    @Override
    public String print(Date date, Locale locale) {
        System.out.println("print Working");
        DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy ");
        return dateFormat.format(date);
    }

    private Date dateFormat(String date) throws ParseException {
        SimpleDateFormat formatter;
        if (date.contains("/"))
            formatter = new SimpleDateFormat("MM/dd/yy");
        else if (date.contains("-"))
            formatter = new SimpleDateFormat("dd-MM-yyyy");
        else
            formatter = null;
        return formatter.parse(date);
    }
}
