package task5;
import java.util.Scanner;
public class Task5 {
    public static void main(String[] args) {
        int n, x, count=0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of elements:");
        n = input.nextInt();
       int [] number = new int[n];
       System.out.print("Enter "+n+" integers: ");
       for(int i=0; i<n; i++){
           number[i] = input.nextInt();
       }
        System.out.print("Enter the number to search: ");
        x = input.nextInt();
        for(int i = 0; i < n; i++)
        {
            if(number[i] == x)
            {
                count++;
            }
        }
        System.out.print(x+ " occurred "+count+ " times in the array.");
    }
}