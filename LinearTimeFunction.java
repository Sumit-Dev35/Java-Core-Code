import java.util.Scanner;

public class LinearTimeFunction {
  public static long fun(long number){
    long answer=0;
    for(long i=1;i<=number;i++)
    answer+=i;
    return answer;
  }
  public static void main(String[] args) {
    Scanner input =new Scanner(System.in);
    long number =input.nextLong();
    long sum=fun(number);
    System.out.println("Sum of first "+number+" is : "+sum);
    input.close();
  }
}
