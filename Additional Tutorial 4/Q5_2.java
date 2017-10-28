//Additional Tutorial 4 - Q(5.2)
import java.util.Scanner;

public class Q5_2{
	
	public static boolean allTheSame(double x, double y, double z){
		if(x==y && y==z){
			return true;
		}
		else{return false;}
	}
	
	public static boolean allDifferent(double x, double y, double z){
		if(x!=y && x!=z && y!=z ){
			return true;
		}
		else{return false;}
	}
	
	public static boolean sorted(double x, double y, double z){
		if(x<=y && y<=z){
			return true;
		}
		else{return false;}
	}
	
	public static void main(String[] args){
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter first double value: ");
		double input1 = sc1.nextDouble();
		
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter first double value: ");
		double input2 = sc2.nextDouble();
		
		Scanner sc3 = new Scanner(System.in);
		System.out.print("Enter first double value: ");
		double input3 = sc3.nextDouble();
		
		boolean same = allTheSame(input1,input2,input3);
		boolean different = allDifferent(input1,input2,input3);
		boolean isSorted = sorted(input1,input2,input3);
		
		if(same){
			System.out.println("The numbers you entered are equal to each other");
		}
		if(different){
			System.out.println("The numbers you entered are different from one another");
		}
		if(isSorted){
			System.out.println("The numbers you entered are in sorted order");
		}
		
	}
}
