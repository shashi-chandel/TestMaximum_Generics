package com.capgemini.testmaximum;

import java.util.Scanner;

public class FindMaximum {
	/**
	 * UC1
	 * 
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

	/**
	 * UC2
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public static Float findMaximum(Float x, Float y, Float z) {
		Float max = x;
		if (y.compareTo(max) > 0)
			max = y;
		if (z.compareTo(max) > 0)
			max = z;
		return max;
	}
	public static String findMaximum(String x,String y,String z) {
		String max = x;
		if(y.compareTo(max)>0)
			max = y;
		if(z.compareTo(max)>0)
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
		System.out.println("Maximum of " + "( " + x + ", " + y + ", " + z + " ) " + "is " + findMaximum(x, y, z));
		System.out.println("Enter 3 float numbers to find maximum");
		System.out.println("Enter first float number");
		Float x1 = Float.parseFloat(sc.nextLine());
		System.out.println("Enter second float number");
		Float y1 = Float.parseFloat(sc.nextLine());
		System.out.println("Enter third float number");
		Float z1 = Float.parseFloat(sc.nextLine());
		System.out.println("Maximum of " + "( " + x1 + ", " + y1 + ", " + z1 + " ) " + "is " + findMaximum(x1, y1, z1));
		System.out.println("Enter 3 integers to find maximum");
        System.out.println("Enter first String");
        String x2 = sc.nextLine();
        System.out.println("Enter second String");
        String y2 = sc.nextLine();
        System.out.println("Enter third String");
        String z2 = sc.nextLine();
        System.out.println("Maximum of given strings "+findMaximum(x2,y2,z2));
		sc.close();
	}
}
