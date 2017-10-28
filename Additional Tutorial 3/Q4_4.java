import java.util.Scanner;
import java.util.Arrays;

public class Q4_4{
	public static void main(String[] args){
	
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the temperatures(seperated with a space): ");
		String input = sc1.nextLine();
		int[] aryOfTemps = Arrays.stream(input.split("\\s")).mapToInt(Integer::parseInt).toArray();
		int maxIndex = 0;
		int maxValue = 0;
		
		for(int i=0;i<aryOfTemps.length;i++){
			if(aryOfTemps[i]>maxValue){
			maxValue=aryOfTemps[i];
			maxIndex=i;
			}
		}
		
		switch(maxIndex){
			case 0:
				System.out.print("Highest temperature in January");
				break;
			case 1:
				System.out.print("Highest temperature in February");
				break;
			case 2:
				System.out.print("Highest temperature in March");
				break;
			case 3:
				System.out.print("Highest temperature in April");
				break;
			case 4:
				System.out.print("Highest temperature in May");
				break;
			case 5:
				System.out.print("Highest temperature in June");
				break;
			case 6:
				System.out.print("Highest temperature in July");
				break;
			case 7:
				System.out.print("Highest temperature in August");
				break;
			case 8:
				System.out.print("Highest temperature in September");
				break;
			case 9:
				System.out.print("Highest temperature in October");
				break;
			case 10:
				System.out.print("Highest temperature in November");
				break;
			case 11:
				System.out.print("Highest temperature in December");
				break;	
		}
	}
}