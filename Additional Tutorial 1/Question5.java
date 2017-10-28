//Additional Tutorial - Q5

import java.util.Scanner;

public class Question5{
	public static void main(String []args){
		Scanner reader = new Scanner(System.in);
		System.out.println("Input first number:");
		int n1 = reader.nextInt();
		System.out.println("Input second number:");
		int n2 = reader.nextInt();
		System.out.println(Integer.toString(n1)+"+"+Integer.toString(n2)+"="+(n1+n2));
		System.out.println(Integer.toString(n1)+"-"+Integer.toString(n2)+"="+(n1-n2));
		System.out.println(Integer.toString(n1)+"X"+Integer.toString(n2)+"="+(n1*n2));
		System.out.println(Integer.toString(n1)+"/"+Integer.toString(n2)+"="+(n1/n2));
		System.out.println(Integer.toString(n1)+" mod "+Integer.toString(n2)+"="+(n1%n2));
	}
}