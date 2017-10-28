//Additional Tutorial 4 - Q(5.4)
import java.util.Scanner;

public class Q5_4{
	
	public static String middle(String str){
		if (str.length()%2==1){
			return str.split("")[(str.length()/2)];
		}
		return str.split("")[(str.length()/2)]+str.split("")[(str.length()/2-1)];
	}
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String input = sc.nextLine();
		
		String middleStr = middle(input);
		System.out.println("The middle characters are "+middleStr);
	}
	
}