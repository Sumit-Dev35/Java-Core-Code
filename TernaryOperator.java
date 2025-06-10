import java.util.Scanner;

public class TernaryOperator {
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    int age=input.nextInt();
    String result=(age>=18)?"You are eligible":"You are not eligible";
    System.out.println(result);
  }
}
