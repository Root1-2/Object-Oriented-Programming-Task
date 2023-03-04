package task3;
import java.util.Scanner;
public class Task3 {
    
        public static void main(String[] args) {
            
         int i, j, r;
         Scanner sc = new Scanner(System.in); //Taking rows value from the user    
         System.out.println("Enter the number of rows: ");    
         int rows = sc.nextInt();
         for (i = 0; i < rows; i++) {
            r = 1;
            for (j = 2 * (rows - i); j >= 0; j--) {
                System.out.print(" ");
            }
            for (j = 0; j <= i; j++) {
                System.out.print(r + " ");
                r++;
            }
            System.out.println();
        }
    }
}       
 
