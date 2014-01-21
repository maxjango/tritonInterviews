package com.triton.interviews;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SolutionTest {
	
	private Solution service;
	private int[] a;
	
	
	@Before
	public void init() {
	  service = new Solution() ;
	  a = new int[]{1,1,4,3,3,2};
	}
	
	@Test
	public void solutio_AllOk() throws Exception {
	
	assertEquals(4,service.solution(a));
	}

}
