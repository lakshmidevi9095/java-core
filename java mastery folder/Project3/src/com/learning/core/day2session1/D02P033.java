package com.learning.core.day2session1;
import java.util.Scanner;
public class D02P033 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		   int percentage = input.nextInt();   
		   if(percentage>=60)
		   System.out.println("Grade A");
		   else if(percentage>=45)
		   System.out.println("Grade B");
		   else if(percentage>=35)
		      System.out.println("Grade C");
		   else if(percentage<35) 
		      System.out.println("Fail");
		  }


	}
