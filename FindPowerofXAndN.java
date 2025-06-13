import java.util.Scanner;

public class FindPowerofXAndN {
  public static long Power(long base,long power){
    System.out.println("Reach To function");
    if(power==0)return 1;
    long shortAnswer=Power(base, power/2);
    shortAnswer*=shortAnswer;
    if(power%2==1)return shortAnswer*base;
    return shortAnswer;
  }
  public static void main(String [] args){
    Scanner input =new Scanner(System.in);
    long base =input.nextInt();
    long power=input.nextInt();
    long answer=Power(base,power);
    System.out.println(answer);
    input.close();
  }
}
