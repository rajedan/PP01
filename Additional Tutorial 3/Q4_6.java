import java.util.Scanner;
import java.util.Arrays;

public class Q4_6{
	public static void main(String[] args){
		boolean first = true;
		
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the numbers: ");
		String input = sc1.nextLine();
		int[] ary = Arrays.stream(input.split("\\s")).mapToInt(Integer::parseInt).toArray();
		
		int minVal = 0;
		
		for(int i=0;i<ary.length;i++){
			if(first==true){
				minVal = ary[i];
				first = false;
			}
			else if(ary[i]<minVal){
				minVal = ary[i];
			}
		}
		System.out.println("Min is "+minVal);
		
	}
}