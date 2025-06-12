
import java.util.Scanner;

public class FindsOfDigitSum{
  public static void main(String[] args) {
      Scanner input = new Scanner(System.in);
      int number=input.nextInt();
      int answer=0;
      while(number>0){
        answer+=number%10;
        number/=10;
      }
      System.out.println(answer);
  }
}