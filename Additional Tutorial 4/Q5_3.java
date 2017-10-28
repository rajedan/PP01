//Additional Tutorial 4 - Q(5.3)
import java.util.Scanner;

public class Q5_3{
	public static int firstDigit(int n){
		String[] aryOfNums = String.valueOf(n).split("");
		return Integer.valueOf(aryOfNums[0]);
		
	}
	public static int lastDigit(int n){
		String[] aryOfNums = String.valueOf(n).split("");
		return Integer.valueOf(aryOfNums[aryOfNums.length-1]);
	}
	public static int digits(int n){
		return String.valueOf(n).length();
	}
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter an integer value: ");
		int input = sc.nextInt();
		
		int firstDigitResult = firstDigit(input);
		System.out.println("The first digit is "+firstDigitResult);
	
		int lastDigitResult = lastDigit(input);
		System.out.println("The last digit is "+lastDigitResult);		
		
		int numOfDigits = digits(input);
		System.out.println("The number of digits are "+numOfDigits);
		
	}
}