//Additional Tutorial 2 - Q3.17

import java.util.Scanner;

public class Q_3_17{

	public static void main(String[] args){
	
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter military time [1]: ");
		int time1 = sc1.nextInt();
	
		Scanner sc2 = new Scanner(System.in);
		System.out.print("Enter military time [2]: ");
		int time2 = sc2.nextInt();
		
		if(time1>time2){
			System.out.println(time1);
			System.out.println(time2);
		}
		if(time2>time1){
			System.out.println(time2);
			System.out.println(time1);
		}
		else{System.out.println("Both times are the same");}
		
	
	}

}