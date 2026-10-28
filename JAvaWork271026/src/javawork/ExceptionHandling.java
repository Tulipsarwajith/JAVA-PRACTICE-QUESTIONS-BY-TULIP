package javawork;

public class ExceptionHandling {
	public static void main(String[]args) {
		
		// Exception 1: ArithmeticException
        try {
            int a = 10;
            int b = 0;
            int result = a / b;

            System.out.println("Result: " + result);

        } catch (ArithmeticException e) {
            System.out.println("Exception 1: Cannot divide by zero.");
        }

        // Exception 2: ArrayIndexOutOfBoundsException
        try {
            int arr[] = {10, 20, 30};

            System.out.println(arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception 2: Invalid array index.");
        }

        // Exception 3: NullPointerException
        try {
            String str = null;

            System.out.println(str.length());

        } catch (NullPointerException e) {
            System.out.println("Exception 3: Cannot access a method using null.");
        }

        System.out.println("Program completed successfully.");
    }
}