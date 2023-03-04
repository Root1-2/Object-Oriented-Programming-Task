package task4;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
       double N1, N2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input 1st number:");
        N1 = scanner.nextDouble();
        System.out.print("Input 2nd number:");
        N2 = scanner.nextDouble();
        System.out.print("1. Addition (+).\n" + "2. Subtraction (-).\n" + "3. Multiplication (*).\n" + "4. Division (/).\n");
        System.out.print("Enter operation number:");
        char operators = scanner.next().charAt(0);
        scanner.close();
        double result;
        switch(operators)
        {
            case '1':
                result = N1 + N2;
                break;

            case '2':
                result = N1 - N2;
                break;

            case '3':
                result = N1 * N2;
                break;

            case '4':
                result = N1 / N2;
                break;

            default:
                System.out.printf("You have entered wrong operator");
                return;
        }
        System.out.println("\nThe result is " +result);
    }    
}
