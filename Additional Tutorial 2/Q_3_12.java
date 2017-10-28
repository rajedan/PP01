//Additional Tutorial 2 - Q3.12

import java.util.Scanner;

public class Q_3_12{

	public static void main(String[] args){
	
	    double grade=0.0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a letter grade: ");
		String input = sc.nextLine();
		
		char[] ary = input.toCharArray();
		char letter = ary[0];
		char postfix = ary[1];
	    
		switch(letter){
			case 'A':
				grade+=4;
				break;
			case 'B':
				grade+=3;
				break;
			case 'C':
				grade+=2;
				break;

			case 'D':
				grade+=1;
				break;

			case 'F':
				grade+=0;
				break;
		}
		if(postfix=='+' && letter!='A'){grade+=0.3;}
		if(postfix=='-'){grade-=0.3;}
		System.out.println("The numeric value is "+grade);
	
	}

}