
import java.util.Scanner;

public class binarySearch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your size array : ");
        int size = input.nextInt();
        int[] arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = input.nextInt();
        }
        int serachElement = input.nextInt();
        int low = 0, high = size - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == serachElement) {
                System.out.println("Element found");
                return;
            } else if (arr[mid] < serachElement) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println("Element does not found");
        input.close();
    }
}
