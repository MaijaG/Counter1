
import java.util.Scanner;

public class Counter {
    // Recursion: the process fo function/method calling itself.
    //Create a method that counts up from a start number to a finish number.
    void countTo(int start, int stop) {
        //1. Check if start value is greater than final value an error if so.
        if (start > stop) {
            System.out.println("Sart value must be less than final value. Please try again!");
            return;
        }
        // 2. Print the value to start to the console
        System.out.println(start);
        //3. add one to the value of start
        start++; // start 2

        if (start <= stop) {
            countTo(start, stop);
        }
        return;
    }

    void countDown(int start, int stop) {
        if (start < stop) {
            System.out.println("Sart value must be greater than final value. Please try again!");
            return;
        }
        System.out.println(start);
        start--;

        if (start >= stop) {
            countDown(start, stop);
        }
        return;
    }
}
