package com.triton.interviews;

public class Singleton {
	
    public static int counter;

	private Singleton(){
	}
	
	private static class SingletonHolder
	{
	 private final static Singleton instance = new Singleton();
	}
	
	public static Singleton getInstance(){
	  return SingletonHolder.instance;
	}

}
