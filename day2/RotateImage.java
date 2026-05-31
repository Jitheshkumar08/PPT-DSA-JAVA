package day2;

import java.util.Arrays;

/*
48. Rotate Image
You are given an n x n 2D matrix representing an image, rotate the image by 90 degrees (clockwise).
You have to rotate the image in-place, which means you have to modify the input 2D matrix directly. DO NOT allocate another 2D matrix and do the rotation.

Example 1:
Input: matrix = [[1,2,3],[4,5,6],[7,8,9]]
Output: [[7,4,1],[8,5,2],[9,6,3]]

Example 2:
Input: matrix = [[5,1,9,11],[2,4,8,10],[13,3,6,7],[15,14,12,16]]
Output: [[15,13,2,5],[14,3,4,1],[12,6,8,9],[16,7,10,11]]
*/
public class RotateImage {
    public static void rotate(int[][] mat){
        int size = mat.length;
        for(int row=0;row<size;row++){
            for(int col=row+1;col<size;col++){
                mat[row][col] ^= mat[col][row];
                mat[col][row] ^= mat[row][col];
                mat[row][col] ^= mat[col][row];
            }
        }
        for(int row=0;row<size;row++){
            int left = 0, right = size-1;
            while(left<right){
                mat[row][left] ^= mat[row][right];
                mat[row][right] ^= mat[row][left];
                mat[row][left] ^= mat[row][right];
                left++;right--;
            }
        }
    }
    public static void main(String[] args) {
        int[][] alpha = {{1,2,3},{4,5,6},{7,8,9}};
        rotate(alpha);
        for(int[] row:alpha){
            System.out.println(Arrays.toString(row));
        }
    }
}
