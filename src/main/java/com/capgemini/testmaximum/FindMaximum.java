package com.capgemini.testmaximum;

import java.util.Scanner;

public class FindMaximum {
	public static <T extends Comparable<T>> T findMaximum(T x, T y, T z) {
		T max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 3 inputs to find maximum");
		System.out.println("Enter first input");
		String x = sc.nextLine();
		System.out.println("Enter second input");
		String y = sc.nextLine();
		System.out.println("Enter third input");
		String z = sc.nextLine();
		System.out.println("Maximum:" + findMaximum(x, y, z));
		sc.close();
	}
}
