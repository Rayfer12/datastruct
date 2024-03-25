import java.util.*;

public class GDC {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter two numbers:"); 

        byte number1 = scanner.nextByte(); // see the first number from the user
        byte number2 = scanner.nextByte(); // see the second number from the user

        byte common;

        if (number1 > number2){ // Check which number is greater
            common = number1; // If number1 is greater, set common to number 1
        }
        else{
            common = number2; // Otherwise, set common to number 2
        }

        while (! (number1 % common == 0 && number2 % common == 0 )){ // While the GCD is not found
            common--; // Decrement common to find the greatest common divisor
        }

        System.out.println("The GCD of " + number1 + " and " + number2 + " is " + common); 
    }
}
