/**
 * 
 */
package com.ask.sample;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * @author sahar8
 *
 */
public class DaysBetween {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DaysBetween(2010, 5, 01, 2011, 5, 1));

	}

	static int DaysBetween(int year1, int month1, int day1, int year2, int month2, int day2) {
		Calendar calendar1 = new GregorianCalendar();
		Calendar calendar2 = new GregorianCalendar();

		calendar1.set(year1, month1, day1);
		calendar2.set(year2, month2, day2);
	
		return (int) ((calendar2.getTime().getTime() - calendar1.getTime().getTime()) / (1000 * 60 * 60 * 24));

	}

}
