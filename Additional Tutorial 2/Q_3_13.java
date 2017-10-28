//Additional Tutorial 2 - Q3.13

import java.util.Scanner;

public class Q_3_13{

	public static void main(String[] args){
	
		char letterGrade='';
	
		Scanner sc = new Scanner();
		System.out.print("Enter numerical grade value: ");
		double input = sc.nextDouble();
		
		if(input==4.0){letterGrade='A+';}
		else if(input>=3.85){letterGrade='A-';}
		else if(input>=3.15){letterGrade='A';}
		else if(input>=2.85){letterGrade='B+';}
		else if(input>=2.7){letterGrade='B-';}
		else if(input>=2.15){letterGrade='B';}
		else if(input>=1.85){letterGrade='C+';}
		else if(input>=1.7){letterGrade='C-';}
		else if(input>=1.15){letterGrade='C';}
		else if(input>=0.85){letterGrade='D+';}
		else if(input>=0.7){letterGrade='D-';
		elseif(input>0){letterGrade='D''}
		else{letterGrade='F';}
		
		System.out.println(letterGrade);
	}
}