import java.util.Scanner;

public class gcd {
    // Method to find the GCD of two numbers
    public static int gcd_finder(int a, int b) {
        // Base case = if b reaches 0, return the GCD as a
        if (b == 0) {
            return a;
        }
        // Recursive case = recursively call to find GCD of both integers with operation
        return gcd_finder(b, a % b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input first number: ");
        int a = sc.nextInt(); // Read the first number from the user

        Scanner ex = new Scanner(System.in);
        System.out.print("Input second number: ");
        int b = ex.nextInt(); // Read the second number from the user

        int gcd_result = gcd_finder(a, b); // Calculate the GCD of the two numbers
        // Print the result
        System.out.print("GCD of " + a + " and " + b + " is " + gcd_result);
    }
}
