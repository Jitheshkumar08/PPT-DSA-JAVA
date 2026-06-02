package day1;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/*
Missing Invoice / First Missing Minimum
Problem Statement:
In the super market end of each day finding the raised bills to customer with invoice number, now find the missing invoice of the day.

Example:
Input:
8,10,3,1,4,2,5
Output:
6

Input:
45,91,90,92,46
Output:
47

Input:
0,1,2,4,5,6,7
Output:
3
 */
public class MissingMinimum {

    public static boolean isExists(int[] inv, int numb) {
        for (int each : inv) {
            if (each == numb) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        // using manual
        // int[] invoices = {8,10,3,1,4,2,5};
        // int mini = Integer.MAX_VALUE;
        // for(int each:invoices) 
        //     if(each<=mini) mini=each;
        // while(true){
        //     int current = mini+1;
        //     if(isExists(invoices, current))
        //         mini=current;
        //     else{
        //         System.out.println("Missing minimum is "+current);
        //         return;
        //     }
        // }
        // using collections
        List<Integer> invoices = Arrays.
                asList(8, 10, 3, 1, 4, 2, 5);
        int mini = Collections.min(invoices);
        while (true) {
            int current = mini + 1;
            if (invoices.contains(current)) {
                mini = current; 
            }else {
                System.out.println("Missing minimum " + current);
                return;
            }
        }
    }
}
