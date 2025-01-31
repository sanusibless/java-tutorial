import java.util.Scanner;

import p1.*;
import p2.Geeks2;

public class Main {

    /**
     * 
     * @param args
     */

     public static int findMax(int[] arr) {
        int max = arr[0];

        for(int n : arr) {
            if(max < n) max = n;
        }
        return max;
     }
    public static void main(String[] args) {
        // System.out.println("Hello Dear");
        // Scanner scanner = new Scanner(System.in);

        // System.out.println("What is your name?");
        // String name = scanner.nextLine();

        // System.out.println("Welcome, " + name + ", What is your Year of Birth?");
        // Integer year = scanner.nextInt();

        // System.out.println("Your is " + name + " and you were born " + year + ", Do you love being Jehovah Servant? (yes/no)");
        // String answer = scanner.next();

        // System.out.println(answer);

        int[] arr = { 1, 2, 5,30 ,9};
        
        // Using for-each loop to 
        // print each element
        int max = findMax(arr);

        System.out.println(max);

        Geeks o = new Geeks();

        o.display();
    }
}