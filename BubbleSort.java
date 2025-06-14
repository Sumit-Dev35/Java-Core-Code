
import java.util.Scanner;

public class BubbleSort {
  public static void main(String [] args){
    System.out.println("Take Input for the array");
    Scanner input=new Scanner(System.in);
    System.out.print("Enter size for your array : ");
    int size=input.nextInt();
    int [] array=new int[size];
    for (int idx = 0; idx < array.length; idx++) {
        array[idx]=input.nextInt();
    }
    
    for(int i=0;i<size-1;i++){
      for(int j=0;j<size-1;j++){
        if(array[j]>array[j+1]){
           int x=array[j];
           array[j]=array[j+1];
           array[j+1]=x;
        }
      }
    }
    System.out.println("Now Your Sorted Array Is :");
    for(int i=0;i<size;i++){
      System.out.print(array[i]+" ");
    }
   }
}
