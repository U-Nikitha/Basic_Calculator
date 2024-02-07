import java.util.Arrays;
import java.util.Scanner;

public class SortNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create an array to store 10 numbers
        int[] numbers = new int[10];

        // Input 10 numbers from the user
        System.out.println("Enter 10 numbers:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Number " + (i + 1) + ": ");
            numbers[i] = scanner.nextInt();
        }

        // Sort the array in ascending order
        Arrays.sort(numbers);

        // Display the sorted numbers
        System.out.println("Sorted numbers in ascending order:");

        for (int num : numbers) {
            System.out.print(num + " ");
        }

        scanner.close();
    }
}
