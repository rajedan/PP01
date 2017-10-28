//Source code for Question 4.1 (d)
import java.util.Scanner;
public class Q4_1_d{
	public static void main(String[] args){
		
		int sumOfOdd = 0;
		
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
		
		System.out.print("Enter number A: ");
		int num1=sc1.nextInt();
		
		System.out.print("Enter number B: ");
		int num2=sc2.nextInt();
		
		for(int i=num1;i<=num2;i++){
			if(i%2==1){
				sumOfOdd+=i;
			}
		}
		
		System.out.print("The sum of odd numbers between "+num1+" and "+num2+" is = "+sumOfOdd);
		
	}
}