//Additional Tutorial 2 - Q3.14

import java.util.Scanner;

public class Q_3_14{

	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the card notation: ");
		String input = sc.nextLine();
		char[] ary = input.toCharArray();
		
		if (Character.toString(ary[0]).matches("[^a-zA-z]")){
			System.out.print(ary[0]);
		}
		else{
			switch(ary[0]){
				case 'J':
					System.out.print("Jack");
					break;
				case 'Q':
					System.out.print("Queen");
					break;
				case 'K':
					System.out.print("King");
					break;
				case 'A':
					System.out.print("Ace");
					break;
			}
		}
		
		switch(ary[1]){
			case 'D':
				System.out.print(" of Diamonds");
				break;
			case 'H':
				System.out.print(" of Hearts");
				break;
			case 'S':
				System.out.print(" of Spades");
				break;
			case 'C':
				System.out.print(" of Clubs");
				break;
		}
	}

}