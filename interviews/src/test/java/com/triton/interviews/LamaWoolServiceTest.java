package com.triton.interviews;

import static org.junit.Assert.assertTrue;

import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.Test;


public class LamaWoolServiceTest {
	
	private LamaWoolService service;
	
	@Before
	public void init() {
	  service = new LamaWoolService() ;
	}
	
	@Test
	public void checkShearDate_AllOk() throws Exception {
	
	assertTrue(service.isWoolTooOldToSell(new DateTime(2013, 01, 15,10,20)));
	}	

}
