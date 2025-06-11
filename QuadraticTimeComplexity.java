import java.util.Scanner;

public class QuadraticTimeComplexity {
  public static long fun(long number){
   long answer=0;
   for(long i=1;i<=number;i++){
    for(long j=1;j<=i;j++){
      answer++;
    }
   }
   return answer;
  }
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    long number=input.nextLong();
    long sum=fun(number);
    System.out.println("Sum of first "+number+" natural number is : "+sum);
    input.close();
  }
}
