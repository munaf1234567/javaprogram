package com.exilant.convertLowercaseORUppercasechar;

import java.util.Scanner;

public class Program1 {

	public static void main(String[] args) {

		Scanner sc= new Scanner(System.in);
		System.out.println("enter one char");
		char  ch=sc.nextLine().charAt(0);	
	    char chh=	((ch>=65) && (ch<=90))?(char)(ch+32):((ch>=97) && (ch<=122))?(char)(ch-32):ch;
	    System.out.println(chh);		
			
		
		
		
	}

}
