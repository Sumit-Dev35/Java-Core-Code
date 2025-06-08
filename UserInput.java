
import java.util.Scanner;

public class UserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please Enter Your Name :");
        String name=scanner.nextLine();
        System.out.println("Good Morning "+name);
        System.out.println(name + " , Also tell me your age : ");
        int age=scanner.nextInt();
        System.out.println("Your age is : " +age);
        int number1,number2;
        System.err.print("Enter Your First Number : ");
        number1=scanner.nextInt();
        System.err.print("\nEnter Your Second Number : ");
        number2=scanner.nextInt();
        System.out.println("\nSum of two number is" + (number1+number2));
        scanner.close();
      }
}
