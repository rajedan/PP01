//Tutorial 2 V 2016 - Q5

public class Q5{

  public static void main(String[] args){

    final double pi = 22/7;

    System.out.println("Degrees\tRadians\n--------------------");
        
    for(int i=0;i<=90;i+=15){
      int radians = (int)((i*pi)/180);
      System.out.println(i+"\t"+radians);
    }
      

  }

}