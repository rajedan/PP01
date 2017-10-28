//Tutorial 2 V 2016 - Q4

import java.util.Scanner;
import java.math.BigDecimal;

public class Q4{

  public static void main(String[] args){

    final BigDecimal usdRate= new BigDecimal("146.53");
    
    Scanner input = new Scanner(System.in);
    System.out.print("How many Sri Lankan Rupees do you wish to convert to USD? :");
    BigDecimal amountToConvert = new BigDecimal(input.nextLine()); 
    BigDecimal convertedAmount = amountToConvert.divide(usdRate,3,BigDecimal.ROUND_HALF_UP);
    String display = String.format("%s LKR = %s USD",amountToConvert, convertedAmount);
    System.out.println(display);

  }
}