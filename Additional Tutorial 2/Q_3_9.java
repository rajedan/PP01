//Additional Tutorial 2 - Q3.9

import java.util.Scanner;

public class Q_3_9{

  public static void main(String[] args){

    double temp=0.0;
    String state="";

    Scanner inputTemp = new Scanner(System.in);
    System.out.print("Enter the temperature followed by C for Celsius or F for Fahrenheit: ");
    String t = inputTemp.nextLine();
    
    if(t.charAt(t.length()-1)=='C'){
		t=t.replace("C","");
		temp = Double.valueOf(t);
	}
	else if(t.charAt(t.length()-1)=='F'){
		t=t.replace("F","");
		temp = Double.valueOf(t);
		temp = (temp-32)*5/9;
	}
    else{System.out.println("Unit hasn't been provided OR Unit provided is invalid");} //EndIf      
	
	if(temp>=100.0){state = "Water is at gaseous state";}
    else if(temp>0.0){state = "Water is at liquid state";}
    else{state = "Water is at solid state";}   

    System.out.println(state);

  } //End Main
} //End Class