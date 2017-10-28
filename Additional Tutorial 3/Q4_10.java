import java.util.Scanner;

public class Q4_10{
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter a word: ");
		String[] ary = sc1.nextLine().split("");
		
		int vowelCount=0;
		
		for(int i=0; i<ary.length; i++){
			if(ary[i].matches("[aeiouAEIOU]")){
				vowelCount++;
			}
		}
		
		System.out.println("The vowel count for the word you entered is "+vowelCount);
	}
}