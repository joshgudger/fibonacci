import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        
        long fibonacciNumber = fibonacci(number);

        
        System.out.println("The Fibonacci number for " + number + " is " + fibonacciNumber);
        
        scanner.close();
    }

    
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }
}
