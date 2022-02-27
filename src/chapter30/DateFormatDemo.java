/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter30;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/**
 *
 * @author thetkhine
 */
public class DateFormatDemo {
    public static void main(String[] args) {
        Date date = new Date();
        DateFormat df = DateFormat.getDateInstance(DateFormat.FULL, Locale.ITALIAN);
        
        System.out.println("Format "+ df.format(date));
        
        //date = new Date(2022,1,1);
        
        Calendar cal = Calendar.getInstance();
        cal.set(Calendar.YEAR, 2022);
        cal.set(Calendar.MONTH, Calendar.JANUARY);
        cal.set(Calendar.DAY_OF_MONTH, 1);
        Date dateRepresentation = cal.getTime();
        SimpleDateFormat formatter = new SimpleDateFormat("dd MMM yyyy HH:mm:ss aa");
        
        System.out.println("Format "+formatter.format(dateRepresentation));
        
        SimpleDateFormat timeFormatter = new SimpleDateFormat(" HH:mm:ss aa");
        System.out.println("Time "+timeFormatter.format(new Date()));
        
        LocalDate localDate = LocalDate.now();
        System.out.println("LocalDate "+localDate.format(DateTimeFormatter.ofPattern("dd MMM yyyy")));
        
        LocalTime localTime = LocalTime.now(ZoneId.of("Asia/Tokyo"));
        System.out.println("Time "+ localTime);
                
    }
}
