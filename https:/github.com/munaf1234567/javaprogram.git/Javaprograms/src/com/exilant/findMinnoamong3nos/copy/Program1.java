package com.exilant.findMinnoamong3nos.copy;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st no");
		int n1=sc.nextInt();
		System.out.println("enter 2st no");
		int n2=sc.nextInt();
		System.out.println("enter 3st no");
		
		int n3=sc.nextInt();
		int min=(n1<n2)?((n1<n3)?n1:n3):(n2<n3)?n2:n3;
		System.out.println("max no is"+min);
		
		
		
	}

}
