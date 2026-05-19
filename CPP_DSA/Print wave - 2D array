import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef {

    static List<Integer> wavePrint(int arr[][]) {

        List<Integer> result = new ArrayList<>();

        int m = arr.length;      // rows
        int n = arr[0].length;   // columns

        for (int col = 0; col < n; col++) {

            // odd column -> bottom to top
            if ((col & 1) == 1) {
                for (int row = m - 1; row >= 0; row--) {
                    result.add(arr[row][col]);
                }
            }

            // even column -> top to bottom
            else {
                for (int row = 0; row < m; row++) {
                    result.add(arr[row][col]);
                }
            }
        }

        return result;
    }

    public static void main(String[] args) throws java.lang.Exception {

        int[][] arr = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16},
            {17, 18, 19, 20}
        };

        List<Integer> ans = wavePrint(arr);
        System.out.println(ans);
    }
}
