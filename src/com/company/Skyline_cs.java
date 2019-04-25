package com.company;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Skyline_cs {


    private String a;
    private Date date;

    public String convertStringToDate(String sDate) {

        DateFormat formatter = new SimpleDateFormat("dd-MM-yyyy");

        Date date = null;
        try {
            date = formatter.parse(sDate);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return String.valueOf(date);
    }
}
