package com.exilant.findLowercaseORUppercasechar;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter 1st no");
		char  ch=sc.nextLine().charAt(0);
		
	String msg=	((ch>=65) && (ch<=90))?ch+"is Uppercase":((ch>=97) && (ch<=122))?ch+"is lowercase":ch+"is not Alphabet";
	System.out.println(msg);		
			
		
		
		
	}

}
