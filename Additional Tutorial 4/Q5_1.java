//Additional Tutorial 4 - Q(5.1)

import java.util.Scanner;

public class Q5_1{
	public static double smallest(double x, double y, double z){
		double min = x;
		Double[] ary = {x,y,z};
		
		for(double val:ary){
			if (val<min){
				min=val;
			}
		}
		return min;
	}
	
	public static double average(double x, double y, double z){
			return ((x+y+z)/3);
	}
	
	public static void main(String[]args){
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter first double value: ");
		double input1 = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter first double value: ");
		double input2 = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter first double value: ");
		double input3 = sc3.nextDouble();
		
		double smallestVal = smallest(input1, input2, input3);
		System.out.println("The smallest value is "+smallestVal);
	
		double averageVal = average(input1, input2, input3);
		System.out.println("The average of the numbers you entered is "+averageVal);
	
	}
}