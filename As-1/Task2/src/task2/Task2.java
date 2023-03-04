
package task2;
import java.util.Scanner;

public class Task2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       int count=0,negative=0,positive=0;
       
       System.out.print("Enter an an integer (Program ends if enter 0):");
       int data = input.nextInt();
       
       while (data !=0) {
           if (data < 0) {
               negative++;
           }
           else if (data > 0) {
               positive++;
           }
           count++;
           
                   System.out.print("Enter an integer (Program ends if enter 0): ");
                   data = input.nextInt();
       }
       System.out.println(positive + " positive numbers");
       System.out.println(negative + " negative numbers");
    }
}

