//Additional Tutorial - Q3.20

import java.util.Scanner;

public class Q_3_20{

	public static void main(String[] args){
	
		String sign="";
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Please enter your birthday(month and day): ");
		String input = sc.nextLine();
		
		String[] ary = input.split("\\s");
		int month = Integer.valueOf(ary[0]);
		int day = Integer.valueOf(ary[1]);
		
		if((month==1 && day<20) || (month==12 && day>=22)){sign="Capricorn";}
		else if((month==1 && day>=20) || (month==2 && day<19)){sign="Aquarius";}
		else if((month==2 && day>=19) || (month==3 && day<21)){sign="Pisces";}
		else if((month==3 && day>=21) || (month==4 && day<20)){sign="Aries";}
		else if((month==4 && day>=20) || (month==5 && day<21)){sign="Taurus";}
		else if((month==5 && day>=21) || (month==6 && day<21)){sign="Gemini";}
		else if((month==6 && day>=21) || (month==7 && day<23)){sign="Cancer";}
		else if((month==7 && day>=23) || (month==8 && day<23)){sign="Leo";}
		else if((month==8 && day>=23) || (month==9 && day<23)){sign="Virgo";}
		else if((month==9 && day>=23) || (month==10 && day<23)){sign="Libra";}
		else if((month==10 && day>=23) || (month==11 && day<22)){sign="Scorpio";}
		else{sign="Saggitarius";}
	
		System.out.println("You are a "+sign);
	
	}

	
}