package com.project.Project.util;


import com.project.Project.util.ProjectConstant;
import java.sql.Time;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

/**
 *
 * @author Mohit Sangwan
 * @since Nov 25, 2017, 10:01:08 AM
 */
@Component
@Slf4j
public class DateTimeConverter {

    public Time stringToTime(String time) {
        SimpleDateFormat format = new SimpleDateFormat(ProjectConstant.TIME_FORMAT);
        try {
            Date d1 = (Date) format.parse(time);
            Time ppstime = new Time(d1.getTime());
            return ppstime;
        } catch (ParseException ex) {
            log.info(ex.getMessage());
        }
        return null;
    }

    public String timeToString(Date date) {
        DateFormat df = new SimpleDateFormat(ProjectConstant.TIME_FORMAT);
        String strDate = df.format(date);
        return strDate;
    }

    public Calendar stringToCalendar(String str_date) {
        DateFormat formatter;
        formatter = new SimpleDateFormat(ProjectConstant.DATE_FORMAT);
        try {
            Date date1 = (Date) formatter.parse(str_date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date1);
            return cal;
        } catch (ParseException ex) {
            log.error(ex.getMessage());
        }
        return null;
    }

    public String calendarToString(Calendar date) {
        SimpleDateFormat format1 = new SimpleDateFormat(ProjectConstant.DATE_FORMAT);
        String formatted = format1.format(date.getTime());
        return formatted;
    }

    public Calendar stringToDateTime(String date) {
        DateFormat formatter;
        formatter = new SimpleDateFormat(ProjectConstant.DATE_TIME_FORMAT);
        try {
            Date date1 = (Date) formatter.parse(date);
            Calendar cal = Calendar.getInstance();
            cal.setTime(date1);
            return cal;
        } catch (ParseException ex) {
            log.info(ex.getMessage());
        }
        return null;
    }

    public String dateTimeToString(Date date) {
        SimpleDateFormat format1 = new SimpleDateFormat(ProjectConstant.DATE_TIME_FORMAT);
        String formatted = format1.format(date);
        return formatted;
    }

    public String getWeekday(Calendar calendar) {
        SimpleDateFormat simpleDateformat = new SimpleDateFormat("EEEE"); // the day of the week spelled out completely
        return simpleDateformat.format(calendar.getTime());
    }

    public boolean compare(Calendar c1, Calendar c2) {
        if (c1.get(Calendar.YEAR) != c2.get(Calendar.YEAR)) {
            return false;
        }
        if (c1.get(Calendar.MONTH) != c2.get(Calendar.MONTH)) {
            return false;
        }
        if (c1.get(Calendar.DAY_OF_MONTH) != c2.get(Calendar.DAY_OF_MONTH)) {
            return false;
        }
        return true;
    }
}
