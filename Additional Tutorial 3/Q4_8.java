import java.util.Scanner;

public class Q4_8{
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a word: ");
		char[] charAry = sc1.nextLine().toCharArray();
		
		for(int i=0; i<charAry.length; i++){
			System.out.println(charAry[i]);
		}
		
	}
}