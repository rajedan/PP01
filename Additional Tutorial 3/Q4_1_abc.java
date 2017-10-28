//Source code for Question 4.1 (a)(b)(c)
import java.util.Scanner;
import java.lang.Math;
public class Q4_1_abc{
	public static void main(String[] args){
		int sumA=0,sumB=0;
		//For loop for Part (a)
		for(int i=2;i<=100;i+=2){
			sumA+=i;
		}System.out.println("Sum of all even numbers between 1 and 100(inclusive): "+sumA);
		//For loop for Part (b)
		for(int x=1;x<=100;x++){
			sumB+=x;
		}System.out.println("Sum of all squares between 1 and 100(inclusive): "+sumB);
		//For loop for Part (c)
		for(int y=0;y<=20;y++){
				System.out.println("2^"+y+"= "+(int)Math.pow(2,y));
		}
	}
}
