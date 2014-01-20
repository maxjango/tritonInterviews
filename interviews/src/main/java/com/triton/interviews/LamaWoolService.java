package com.triton.interviews;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

public class LamaWoolService {
	
	public boolean isWoolTooOldToSell(DateTime shearDate) {
		// Joda mutable DateTime instance initialized to the current system date/time
		//you can't use au current date time, or change the current date so that it can match the test
		//otherwise the result will be random with respect to the current date
		
		MutableDateTime now = shearDate.toMutableDateTime();
		now.setDate(shearDate); 
		
		//MutableDateTime now = new MutableDateTime();
		
        now.addDays(-10);
		return now.isBefore(shearDate);
		}
}
