
import java.util.Scanner;

public class mergeTwoSortedArray{
  public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
    System.out.print("Enter number of elemnets in first array : ");
    int n=input.nextInt();
    System.out.print("Enter number of elements in second array");
    int m=input.nextInt();
    int [] arr1=new int[n];
    int [] arr2=new int[m];
    for(int i=0;i<n;i++)
    arr1[i]=input.nextInt();
    for(int i=0;i<m;i++)
    arr2[i]=input.nextInt();
    int []resultArray=new int[n+m];
    int i=0;
    int j=0;
    int k=0;
    while(i<n && j<m){
      if(arr1[i]<=arr2[j]){
        resultArray[k++]=arr1[i++];
      }
      else{
        resultArray[k++]=arr2[j++];
      }
    }
    while(i<n){
      resultArray[k++]=arr1[i++];
    }
    while(j<m){
      resultArray[k++]=arr2[j++];
    }

    for(int l=0;l<n+m;l++){
      System.out.print(resultArray[l]+" ");
    }
    
    input.close();
  }
}