import java.util.Scanner;
import java.lang.Math;

public class Q4_7{
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String input = sc1.nextLine();
		
		int i = 0;
		int j = 0;
		String first="";
		String middle="";
		String last="";
		String newString="";
		
		i=0+(int)(Math.random()*((input.length())-0));
		j=i+(int)(Math.random()*((input.length())-i));
		first=input.substring(0,i);
		middle=input.substring(i,j);
		last=input.substring(j,input.length());
		
		newString = first+input.charAt(j)+middle+input.charAt(i)+last;
		System.out.println(newString);
		
	}
}