
import java.util.Scanner;

public class shorthand {
  public static void main(String[] args) {
    int a=5;
    Scanner sc=new Scanner(System.in);
    int x1=sc.nextInt();
    int x2=sc.nextInt();
    int x3=sc.nextInt();
    int x4=sc.nextInt();
    a+=x1;
    System.out.println(a);
    a+=x2;
    System.out.println(a);
    a+=x3;
    System.out.println(a);
    a+=x4;
    System.out.println(a);
    sc.close();
  }
}
