/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author thetkhine
 */
public class ParseDate {
    public static void main(String[] args) {
        try {
            Calendar cal = Calendar.getInstance();
            cal.set(Calendar.YEAR, 2022);
            cal.set(Calendar.MONTH, Calendar.JANUARY);
            cal.set(Calendar.DAY_OF_MONTH, 1);
            Date date = cal.getTime();
            SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss aa");
            
            String dateString = formatter.format(date);
            Date newDate = formatter.parse(dateString);
            
            System.out.println("New Date "+newDate);
            
            LocalDateTime dateTime = LocalDateTime.now();
            DateTimeFormatter df  = DateTimeFormatter.ofPattern("dd MMM yyyy HH:mm:ss");
            String dateTimeStr = dateTime.format(df);
            
            System.out.println("Str "+dateTimeStr);
            LocalDateTime newDateTime = LocalDateTime.parse( dateTimeStr, df);
            
            System.out.println("New Date Time "+newDateTime);
        } catch (ParseException ex) {
            ex.printStackTrace();
        }
    }
}
