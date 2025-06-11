import java.util.Scanner;
public class ConstantTimeFunction{
  public static long fun(long number){
     return number*(number+1)/2;
  }
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    long number=input.nextLong();
    long sum=fun(number);
    System.out.println("Sum of first "+number +" is "+sum);
    input.close();
}
}