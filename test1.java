import java.util.Scanner;

public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (number < 0) {
                System.out.println("Input must be a non-negative integer.");
            } else {
                long factorial = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is: " + factorial);
            }
        } else {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
        scanner.close();
    }

    public static long calculateFactorial(int n) {
        if (n == 0) {
            return 1; // Base case: 0! = 1
        } else {
            long factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }
            return factorial;
        }
    }
}
