import java.util.Scanner;
import java.util.Arrays;

public class Q4_5{
	public static void main(String[] args){
		Scanner sc1 = new Scanner(System.in);
		System.out.print("Enter the floating point values(seperated with a space): ");
		String input = sc1.nextLine();
		double[] ary = Arrays.stream(input.split("\\s+")).mapToDouble(Double::valueOf).toArray();
		
		double sum = 0.0;
		double minValue = ary[0];
		double maxValue = ary[1];
		
		for(int i=0;i<ary.length;i++){
			if(ary[i]>maxValue){
			maxValue=(double)(ary[i]);
			}
			if(ary[i]<minValue){
			minValue=(double)(ary[i]);
			}
			sum+=(double)(ary[i]);
		}
		System.out.println("Average is "+(sum/ary.length));
		System.out.println("Max value is "+maxValue);
		System.out.println("Min value is "+minValue);
		System.out.println("Range is "+(maxValue-minValue));
	}
}