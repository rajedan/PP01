//Additional Tutorial - Q3.19

import java.util.Scanner;
import java.lang.Math;

public class Q_3_19{

	public static void main(String[] args){
	
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter two floating point numbers: ");
		String input = sc.nextLine();
		
		String[] aryOfFloatingNum = input.split("\\s");
		double num1 = Double.valueOf(aryOfFloatingNum[0]);
		double num2 = Double.valueOf(aryOfFloatingNum[1]);
		
		num1 = Math.round(num1*100)/100;
		num2 = Math.round(num2*100)/100;
	
		if(num1==num2){
			System.out.println("They are same upto two decimal places");
		}
		else{
			System.out.println("They are different");
		
		}
		
	}

}