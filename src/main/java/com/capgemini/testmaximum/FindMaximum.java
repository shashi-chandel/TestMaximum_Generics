package com.capgemini.testmaximum;

import java.util.Arrays;

public class FindMaximum <T extends Comparable<T>>
{
	T max;
	
	public T maximum() {
		return this.max;
	}
	
	public T findMaximum(T ... args) {
		Arrays.sort(args);
		this.max = args[args.length-1];
		return max;
	}
	
	public void printMax() {
		System.out.println(max);
	}
}