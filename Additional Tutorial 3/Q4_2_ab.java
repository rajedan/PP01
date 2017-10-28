//Source code for Question 4.2 (a)(b)
import java.util.Scanner;
public class Q4_2_ab{
	public static void main(String[] args){
		int largest=0, smallest=0, oddCount=0, evenCount=0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter your sequence of numbers: ");
		String input = sc.nextLine();
		String[] aryOfNums = input.split("\\s+");
		largest=Integer.valueOf(aryOfNums[0]);
		smallest=Integer.valueOf(aryOfNums[0]);
		for(int i=0;i<aryOfNums.length;i++){
			if((Integer.valueOf(aryOfNums[i]))>largest){
				largest=Integer.valueOf(aryOfNums[i]);
			}
			if((Integer.valueOf(aryOfNums[i]))<smallest){
				smallest=Integer.valueOf(aryOfNums[i]);
			}
			if((Integer.valueOf(aryOfNums[i]))%2==0){
				evenCount++;
			}
			if((Integer.valueOf(aryOfNums[i]))%2==1){
				oddCount++;
			}
		}
		System.out.println("The largest number in the sequence you entered is: "+largest);
		System.out.println("The smallest number in the sequence you entered is: "+smallest);
		System.out.println("The even count for the sequence you entered is "+evenCount);
		System.out.println("The odd count for the sequence you entered is "+oddCount);
		}
}