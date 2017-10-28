//Additional Tutorial 2 - Q3.15

import java.util.Scanner;

public class Q_3_15{

	public static void main(String[] args){

		String largestVal="";
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter three numbers:");
		String input = sc.nextLine();

		String[] aryOfNums= input.split("\\s+");
		
		for(int i=1;i<aryOfNums.length;i++){
			if(Double.valueOf(aryOfNums[i])>Double.valueOf(aryOfNums[i-1])){
				largestVal = aryOfNums[i];
			}
		}
		System.out.println("Largest value is: "+largestVal);
	}
}