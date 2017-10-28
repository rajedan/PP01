//Source code for Question 4.1 (e)
import java.util.Scanner;
public class Q4_1_e{
	public static void main(String[] args){
		int odd=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number: ");
		String input = sc.nextLine();
		
		String[] aryOfNums = input.split("");
		System.out.println(aryOfNums.length);
		/*for(int x=0; x<aryOfNums.length;x++){
			System.out.print(aryOfNums[x]+" ");
		}*/
				
		for(int i=0;i<aryOfNums.length;i++){
			if((Integer.valueOf(aryOfNums[i]))%2==1){
				odd+=Integer.valueOf(aryOfNums[i]);
			}
		}
		
		System.out.print("Sum: "+odd);
	}
}