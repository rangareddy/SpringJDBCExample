package com.ranga;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 
 * @author Ranga Reddy
 * @version 1.0
 * @since 25 July, 2015
 */

public class PairSum {
	public static void main(String[] args) {
		int array[] = new int[] {1, 5, 7, 9, 10, 2, 4};
		int sum = 6;
		printPairSumUsingMap(array, sum);
		printPairSumUsingSet(array, sum);
		printPairsSumUsingBruteForce(array, sum);
	}

	/**
	 * Finding and Printing pair sum values using Map
	 * @param array
	 * @param sum
	 */
	private static void printPairSumUsingMap(int[] array, int sum) {
		System.out.println("Printing the sum pairs using Map ");
		Map<Integer, Integer> pairs = new HashMap<Integer, Integer>();
		int len = array.length, key = 0;
	    for(int i=0; i<len; i++){
	    	key = array[i];
	        if(pairs.containsKey(key))
	            System.out.println(key +", "+ pairs.get(key));
	        else
	            pairs.put(sum-key, key);
	    }		
	}
	
	/**
	 * Finding and Printing pair sum values using Map
	 * @param array
	 * @param sum
	 */
	private static void printPairSumUsingSet(int[] array, int sum) {
		System.out.println("Printing the sum pairs using Set ");
		Set<Integer> values = new HashSet<Integer>();
		int len = array.length, value = 0;
	    for(int i=0; i<len; i++){
	    	value = array[i];
	        if(values.contains(sum - value)) {
	        	System.out.println(value +", "+ (sum - array[i]));
	        } else {
	        	values.add(value);
	        }
	    }		
	}
	
	/**
	 * Finding and Printing pair sum values using BruteForce
	 * @param array
	 * @param sum
	 */
	private static void printPairsSumUsingBruteForce(int[]array, int sum){
		System.out.println("Printing the sum pairs using BruteForce ");
		int len = array.length;
	    for(int i=0; i<len; i++){
	        for(int j=i; j<len;j++){
	            if( (array[i]+array[j]) == sum)
	            	System.out.println(array[i] +", "+ array[j]);	                
	        }
	    }
	}
}