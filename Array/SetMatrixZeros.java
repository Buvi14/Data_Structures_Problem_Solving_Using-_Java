package Array;

import java.util.*;

// Given an m x n integer matrix matrix, if an element is 0, set its entire row and column to 0's, and return the matrix.



public class SetMatrixZeros {
    public static void main(String[] args) {
        setZeroes(new int[][]{{0,1,2,0},{3,4,5,2},{1,3,1,5}});
    }
    public static void setZeroes(int[][] matrix) {
        int r = matrix.length;
        int c = matrix[0].length;
        Set<Integer> row = new HashSet<>();
        Set<Integer> col = new HashSet<>();

        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(matrix[i][j]==0){
                    row.add(i);
                    col.add(j);
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                if(row.contains(i) || col.contains(j)){
                    matrix[i][j] =0;
                }
            }
        }
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}

