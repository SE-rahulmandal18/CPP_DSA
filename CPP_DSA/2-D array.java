import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    static List<Integer> rowSum(int arr[][]){
        
         List<Integer> result = new ArrayList<>();
         // total no of rows;
         int m = arr.length;
         
         // total no of column
         int n = arr[0].length;
         
         for(int row=0; row<m; row++){
             
             int sum = 0;
             
             for(int col=0; col<n; col++){
                 sum = sum + arr[row][col];
             }
             
             result.add(sum);
         }         
         return result; 
    }

	static List<Integer> colSum(int arr[][]){
        
        List<Integer> result = new ArrayList<>();
        
        int m = arr.length;
        int n = arr[0].length;
        
        for(int col=0; col<n; col++){
            
            int sum = 0;
            
            for(int row=0; row<m; row++){
                sum += arr[row][col];
            }
            
            result.add(sum);
        }
        
        return result;
    }

	public static void main (String[] args) throws java.lang.Exception
	{
          int arr[][] = {
            {10, 20, 30},
            {40, 50, 60},
            {70, 80, 90}
        };
        
        
        List<Integer> ans = rowSum(arr);
        System.out.println("total sum: " +ans);    

		 
        List<Integer> ans1 = colSum(arr);
        System.out.println("col sum: " + ans1);
	}
}
