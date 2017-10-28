//Additional Tutorial - Q3.18

import java.util.Scanner;

public class Q_3_18{

	public static void main(String[] args){
	
		String season = "";
	
		Scanner sc1 = new Scanner(System.in);
		Scanner sc2 = new Scanner(System.in);
	
		System.out.print("Enter the month: ");
		int month = sc1.nextInt();
		
		System.out.print("Enter the day: ");
		int day = sc2.nextInt();
		
		if(month<=3){
			season="Winter";
		}
		else if(month<=6){
			season="Spring";
		}
		else if(month<=9){
			season="Summer";
		}
		else{
			season="Fall";
		}
		
		if(month%3==0 && day>=21){
			if(season=="Winter"){season="Spring";}
			else if(season=="Spring"){season="Summer";}
			else if(season=="Summer"){season="Fall";}
			else{season="Winter";}
		}
		
		System.out.println("The season for the month and the day you entered is "+season);
	}

}