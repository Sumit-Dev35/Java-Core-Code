import java.util.Scanner;

public class Recursion {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int number=input.nextInt();
    int answer=factorial(number);
    System.out.println(answer);
  }
  public static int factorial(int n){
    if(n<=0)return 1;
    return n*factorial(n-1);
  }
}
