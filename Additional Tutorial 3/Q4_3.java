//Source code for Question 4.3
import java.util.Scanner;
public class Q4_3{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter text here: ");
		String input = sc.nextLine();
		String[] ary1 = input.split("");
		String[] ary2 = input.split("\\s+");
		String[] ary3 = input.split("");
		int vowelCount=0;
		
		//Q4.3 (a)
		System.out.print("Uppercase letters in the string: ");
		for(int i=0;i<ary1.length;i++){
			if(ary1[i].matches("[A-Z]+")){
				System.out.print(ary1[i]+"");
			}
		}System.out.println();
		
		//Q4.3 (b)
		System.out.print("Second letters of the string: ");
		for(int x=0;x<ary2.length;x++){
			if(ary2[x].length()!=1){
				System.out.print(ary2[x].toCharArray()[1]+" ");
			}
		}System.out.println();
	
		//Q4.3 (c)
		System.out.print("New string with replaced vowels: ");
		for(int y=0;y<ary3.length;y++){
			if(ary3[y].matches("[aeiouAEIOU]+")){
				System.out.print("_");
			}else{System.out.print(ary3[y]);}
		}System.out.println();
		
		//Q4.3 (d)
		for(int z=0;z<ary3.length;z++){
			if(ary3[z].matches("[aeiouAEIOU]+")){
				vowelCount++;
			}
		}System.out.println("Your vowel count: "+vowelCount);
	
		//Q4.3 (e)
		for(int count=0;count<ary3.length;count++){
			if(ary3[count].matches("[aeiouAEIOU]+")){
				System.out.println("Vowel \'"+ary3[count]+"\'detected. Position is: "+count);
			}
		}
	}
	
}