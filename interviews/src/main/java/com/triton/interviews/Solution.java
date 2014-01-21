package com.triton.interviews;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.TreeMap;


public class Solution {
	
	public int solution(int[] A) {
        // write your code in Java SE 6
		
		//first we have to sort the arrays
		Arrays.sort(A);
		//Transform Arrays in a list
		//convert list int into Integer
		
		 List<Integer> myList = new ArrayList<Integer>();
		    for (int index = 0; index <  A.length; index++)
		    {
		    	myList.add( A[index]);
		    }
		  
		TreeMap<Integer,Integer> occurences = new TreeMap<Integer,Integer>();
		for (Integer i :myList){
			int ocur=Collections.frequency(myList,i);
			if(ocur==1) occurences.put(i,ocur);
		}
		    
		if(occurences.size()!=0)return occurences.firstKey();
		else return -1;
    }

}
