package com.triton.interviews;

import java.util.concurrent.atomic.AtomicInteger;

public class MyIncrementInteger {
	
	
	public void firstMethod(){
		int i =0;
		synchronized(this){i++;}
	}
	
	public void secondMethod(){
		AtomicInteger i = new AtomicInteger();
		i.getAndIncrement();
	}
	
	public void thirdMethod(){
		Singleton.getInstance().counter++;
	}
	
}
