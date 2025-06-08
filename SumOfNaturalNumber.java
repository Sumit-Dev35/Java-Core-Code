
import java.util.Scanner;

public class SumOfNaturalNumber {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your nth Number : ");
        int n = input.nextInt();
        System.out.println("Sum of nth Natural Number is : " + fun3(n));
        input.close();
    }

    public static long fun1(int n) {
        return n * (n + 1) / 2;
    }

    public static long fun2(int n) {
        long ans = 0;
        for (int i = 1; i <= n; i++) {
            ans += i;
        }
        return ans;
    }

    public static long fun3(int n) {
        int ans = 0;
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                ans++;
            }
        }
        return ans;
    }
}
