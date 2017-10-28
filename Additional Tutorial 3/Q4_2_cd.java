//Source code for Question 4.2 (c)(d)
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;

public class Q4_2_cd{
	public static void main(String[] args){
		
		int cumulative=0;
		ArrayList<Integer> aryOfAdjDuplicates = new ArrayList<Integer>();
		
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a sequence of numbers: ");
		String input = sc.nextLine();
		int[] aryOfNums = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();
		
		//For loop for Part(c)
		for(int i=0;i<aryOfNums.length;i++){
			cumulative+=aryOfNums[i];
			System.out.print(cumulative+" ");
		}System.out.println();
		
		//Loops for Part(d)
		for(int x=1;x<aryOfNums.length;x++){
			if(aryOfNums[x]==aryOfNums[x-1]){
				if(aryOfAdjDuplicates.indexOf(aryOfNums[x])==-1){
				aryOfAdjDuplicates.add(aryOfNums[x]);
				}
			}
		}
		
		for(int y=0;y<aryOfAdjDuplicates.size();y++){
			System.out.print(aryOfAdjDuplicates.get(y)+" ");
		}
		
		
		
		
	}
}