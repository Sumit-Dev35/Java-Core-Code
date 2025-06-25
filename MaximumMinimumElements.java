import java.util.Scanner;
public class MaximumMinimumElements {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        int minElement = Integer.MAX_VALUE;
        int maxEelemnt = Integer.MIN_VALUE;
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            minElement = Math.min(minElement, arr[i]);
            maxEelemnt = Math.max(maxEelemnt, arr[i]);
        }
        System.out.println(minElement + " " + maxEelemnt);
        scanner.close();
    }
}
