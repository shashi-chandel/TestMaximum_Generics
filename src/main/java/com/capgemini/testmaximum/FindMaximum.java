package com.capgemini.testmaximum;

import java.util.Scanner;

public class FindMaximum {
	/**
	 * UC1
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static Integer findMaximum(Integer x, Integer y, Integer z) {
		Integer max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 integers to find maximum");
		System.out.println("Enter first integer");
		Integer x = Integer.parseInt(sc.nextLine());
		System.out.println("Enter second integer");
		Integer y = Integer.parseInt(sc.nextLine());
		System.out.println("Enter third integer");
		Integer z = Integer.parseInt(sc.nextLine());
		System.out.println("Maximum of "+"( "+x+", "+y+", "+z+" ) "+ "is "+findMaximum(x, y, z));
		sc.close();
	}
}
