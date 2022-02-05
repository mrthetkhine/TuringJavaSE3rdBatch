/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter20;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;

/**
 *
 * @author thetkhine
 */
public class CalendarDemo {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        String []months = {"Jan","Feb","Mar",
                            "Apr","May","June",
                            "July","Aug","Sep",
                            "Oct","Nov","Dec"};
        System.out.println("Month "+ months[ calendar.get(Calendar.MONTH)]);
        System.out.println("Year "+ calendar.get(Calendar.YEAR));
        System.out.println("Date "+ calendar.get(Calendar.DATE));
        System.out.println("Day "+ calendar.get(Calendar.DAY_OF_WEEK));
        
        System.out.println("Calendar first day of week "+calendar.getFirstDayOfWeek());
        
        System.out.println("Hour "+ calendar.get(Calendar.HOUR));
        System.out.println("Minutes "+ calendar.get(Calendar.MINUTE));
        System.out.println("Sec "+ calendar.get(Calendar.SECOND));
        
        calendar.add(Calendar.HOUR, 1);
        calendar.add(Calendar.MONTH, 1);
        System.out.println("Hour "+ calendar.get(Calendar.HOUR));
        System.out.println("Minutes "+ calendar.get(Calendar.MINUTE));
        System.out.println("Sec "+ calendar.get(Calendar.SECOND));
        
        System.out.println("Calender "+calendar.getTime());
        
        GregorianCalendar gCal = new GregorianCalendar(2022, 1, 5);
        System.out.println("Gcal "+ gCal.getTime());
        
        System.out.println("Is Leap Year "+ gCal.isLeapYear(2024));
    }
}
