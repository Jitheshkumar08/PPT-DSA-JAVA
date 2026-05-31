package day1;

import java.util.Arrays;

/*
Move Zeroes
Problem Statement:
Rearrange a delivery queue where zeros indicate unavailable trucks; push them to the end without disrupting the rest.

Sample Input:
nums = [0, 1, 0, 3, 12]
Expected Output:
[1, 3, 12, 0, 0]

Input:
20,0,19,5,0,3,10,0,2
Output:
20,19,5,3,10,2,0,0,0

Input:
3,0,0,1,0,5,0,6,0
Output:
3,1,5,6,0,0,0,0,0
*/
public class MovingZero {
    public static void move(int[] trucks){
        int valid = 0, traversal = 0, size = trucks.length;
        while(traversal<size){
            if(trucks[traversal]!=0){
                trucks[valid]=trucks[traversal];
                valid++;
            }
            traversal++;
        }
        Arrays.fill(trucks, valid,size,0);
        System.out.println(Arrays.toString(trucks));
    }
    public static void main(String[] args) {
        move(new int[]{20,0,19,5,0,3,10,0,2});
        move(new int[]{3,0,0,1,0,5,0,6,0});
    }
}
