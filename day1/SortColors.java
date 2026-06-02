package day1;

import java.util.Arrays;

/*
Sort Colors (Dutch National Flag)
Problem Statement:
Assume that your are part of support team in IRCTC app where customers would raise issue and it will be considered priority ticket such as 0, 1 and 2. now today tickets are in the bucket and you need to arrange it by priority

Example:
Input:
2,0,0,1,0,2,0,1
Output:
0,0,0,0,1,1,2,2

Sample Input:
nums = [2, 0, 2, 1, 1, 0]
Expected Output:
[0, 0, 1, 1, 2, 2]
 */
public class SortColors {

    // public static void sort(int[] tickets){
    //     Queue<Integer> buffer = new PriorityQueue<>();
    //     Arrays.stream(tickets).forEach((t)->buffer.offer(t));
    //     int index= 0;
    //     while(!buffer.isEmpty()){
    //         tickets[index] = buffer.poll();
    //         index++;
    //     }
    //     System.out.println(Arrays.toString(tickets));
    // }
    public static void sort(int[] tickets) {
        int left = 0, trav = 0, end = tickets.length - 1;
        while (trav <= end) {
            if (tickets[trav] == 0) {
                tickets[trav] ^= tickets[left];
                tickets[left] ^= tickets[trav];
                tickets[trav] ^= tickets[left];
                left++;
                trav++;
            } else if (tickets[trav] == 1) {
                trav++; 
            }else {
                tickets[trav] ^= tickets[end];
                tickets[end] ^= tickets[trav];
                tickets[trav] ^= tickets[end];
                end--;
            }
        }
        System.out.println(Arrays.toString(tickets));
    }

    public static void main(String[] args) {
        sort(new int[]{2, 0, 0, 1, 0, 2, 0, 1});
        sort(new int[]{2, 0, 2, 1, 1, 0});
    }
}
