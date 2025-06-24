import java.util.Scanner;

public class LearnerSearch {
  public static void main(String[] args) {
    Scanner scanner=new Scanner(System.in);
    int size =scanner.nextInt();
    int []arr=new int[size];
    for(int i=0;i<size;i++){
      arr[i]=scanner.nextInt();
    }
    int target=scanner.nextInt();
    boolean found=false;
    for(int i=0;i<size;i++){
      if(arr[i]==target){
          found=true;
      }
    }
    if(found){
      System.out.println("Element found !!!");
    }
    else{
      System.out.println("Element not found !!!");
    }
    scanner.close();
  }
}
