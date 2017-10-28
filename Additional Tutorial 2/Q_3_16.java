//Additional Tutorial 2 - Q3.16

import java.util.Scanner;
import java.util.Arrays;

public class Q_3_16{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter three strings: ");
		String input = sc.nextLine();
		
		String[] aryOfStrings = input.split("\\s");
		Arrays.sort(aryOfStrings);
		for(int i=0;i<aryOfStrings.length;i++){
			System.out.println(aryOfStrings[i]);
		}
	}
}