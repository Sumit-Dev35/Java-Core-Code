import java.util.Scanner;

public class checkSubsequenceString {
  public static void main(String[] args) {
      Scanner scanner=new Scanner(System.in);
      System.out.print("Enter the first string: ");
      String str1= scanner.nextLine();
      System.out.print("Enter the second string: ");
      String str2=scanner.nextLine();
      boolean isSubsequence=false;
      int i=0,h=0;

      while(i<str1.length() && h<str2.length()){
        if(str1.charAt(i)==str2.charAt(h)){
          i++;
          h++;
        }
        else{
          h++;
        }
      }
      if(i==str1.length()){
        System.out.println("Yes, the first string is a subsequence of the second string.");
      }
      else{
        System.out.println("No, the first string is not a subsequence of the second string.");
      }
      scanner.close();
  }
}
