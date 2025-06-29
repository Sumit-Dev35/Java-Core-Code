import java.util.Scanner;

public class Array{
  public static void main(String[] args) {
      int arr[]=new int [1000];
      Scanner sc=new Scanner(System.in);
      for (int i = 0; i < 1000; i++) {
          arr[i]=sc.nextInt();
      }
      for (int i = 0; i < 1000; i++) {
          System.out.println(arr[i]);
      }
      sc.close();
  }
}