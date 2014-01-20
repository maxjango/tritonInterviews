package com.triton.interviews;

import org.joda.time.DateTime;
import org.joda.time.MutableDateTime;

public class LamaWoolService {
	
	public boolean isWoolTooOldToSell(DateTime shearDate) {
		// Joda mutable DateTime instance initialized to the current system date/time		
		MutableDateTime now = shearDate.toMutableDateTime();
		now.setDate(shearDate);
		
		//MutableDateTime now = new MutableDateTime();
		
        now.addDays(-10);
		return now.isBefore(shearDate);
		}
}
