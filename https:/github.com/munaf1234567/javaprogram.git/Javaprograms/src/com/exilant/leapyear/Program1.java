package com.exilant.leapyear;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter year");
		int year=sc.nextInt();
		String msg=(year%4!=0)?year+"---->not leap year":(year%100!=0)?year+"---->leap year":(year%400==0)?year+"------>is leap year":year+"----->is leap year";
		System.out.println(msg);
	
		
		
		
	}

}
