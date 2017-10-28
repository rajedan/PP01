//Additional Tutorial 2 - Q3.11

import java.util.Scanner;

public class Q_3_11{

	public static void main(String[] args){
	
		double temp=0.0;
		double boilingTemp=100.0;
		double	altitude=0.0;
		String state="";

		Scanner inputTemp = new Scanner(System.in);
		System.out.print("Enter the temperature followed by C for Celsius or F for Fahrenheit: ");
		String t = inputTemp.nextLine();

		if(t.matches("\\d+\\s*[a-zA-Z]")==false){
			System.out.println("Invalid temperature input");
			System.exit(0);
		}
		
		if(t.charAt(t.length()-1)=='C'){
			t=t.replace("C","");
			temp = Double.valueOf(t);
		}
		else if(t.charAt(t.length()-1)=='F'){
			t=t.replace("F","");
			temp = Double.valueOf(t);
			temp = (temp-32)*5/9;
		}
		else{
			System.out.println("Unit hasn't been provided OR Unit provided is invalid");
			System.exit(0);
		}      
		
		Scanner inputAlt = new Scanner(System.in);
		System.out.print("Enter the altitude followed by m for meter or f for feet: ");
		String a = inputAlt.nextLine();
		
		if(a.matches("\\d+\\s*[a-zA-Z]")==false){
			System.out.println("Invalid temperature input");
			System.exit(0);
		}
		
		if(a.charAt(a.length()-1)=='m'){
			a=a.replace("m","");
			altitude=Double.valueOf(a);
			if(altitude>=300.0){boilingTemp=boilingTemp-(altitude/300);}
		}

		else if(a.charAt(a.length()-1)=='f'){
			a=a.replace("f","");
			altitude=Double.valueOf(a);
			if(altitude>=1000.0){boilingTemp=boilingTemp-(altitude/1000);}	
		}
		else{
			System.out.println("Unit hasn't been provided OR Unit provided is invalid");
			System.exit(0);
			}
		if(temp>=boilingTemp){state = "Water is at gaseous state";}
		else if(temp>0.0){state = "Water is at liquid state";}
		else{state = "Water is at solid state";}//EndIf
		
		System.out.println(state);
		
	}

}