import java.util.ArrayList;
import java.util.List;

public class PascalTriangle {
    public static void main(String[] args) {
        // System.out.println(generate(1));
        System.out.println(getRow(1));
    }

    // Pascal Triangle 2 using Dp
    public static List<Integer> getRow(int rowIndex) {
        List<Integer> Lp = new ArrayList<Integer>();
        int[][] arr = new int[rowIndex+1][rowIndex+1];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j <= i; j++) {
                if(j==0){
                    arr[i][j] =1;
                    if(i == rowIndex){
                        Lp.add(arr[i][j]);
                    }
                }
                else if(i==j){
                    arr[i][j] =1;
                    if(i == rowIndex){
                        Lp.add(arr[i][j]);
                    }
                }
                else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                    if(i == rowIndex){
                        Lp.add(arr[i][j]);
                    }
                }
            }
        }
        return Lp;
    }

    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> Lp = new ArrayList<>();
        int [][] arr = new int[numRows][numRows];
        for (Integer i = 0; i < numRows; i++) {
            Lp.add(new ArrayList<Integer>());
            for (Integer j = 0; j <=i; j++) {
                if(j==0){
                    arr[i][j] =1;
                    Lp.get(i).add(j,1);
                }
                else if(i==j){
                    arr[i][j] =1;
                    Lp.get(i).add(j,1);
                }
                else{
                    arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
                    Lp.get(i).add(j,arr[i][j]);
                }
            }
        }
        // for (int i = 0; i < arr.length; i++) {
        //     for (int j = 0; j <=i; j++) {
        //         System.out.print(arr[i][j]);
        //     }
        //     System.out.println();
        // }
        return Lp;
    }
}
