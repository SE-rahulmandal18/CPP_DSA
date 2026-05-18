import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    static int getLowerBound(int arr[], int target){
        int n = arr.length;
        int s = 0 ;
        int e = n-1;
        int mid = s + (e-s)/2;
        int ans = n;
        
        while(s <= e){
            
            if(arr[mid] >= target){
                // ans ko store krna h
                ans = mid;
                
                // left mai move krna h
                e = mid - 1;
                
            }
            else{
                // right mai move krna h
                s = mid + 1;
            }
            
            mid = s + (e-s)/2;
    
        }
        return ans;
    }
    
    
    static int getUpperBound(int arr[], int target){
        int n = arr.length;
        int s = 0;
        int e = n-1;
        int mid = s + (e-s)/2;
        int ans = n;
        
        
        while(s <= e) {
            
            if(arr[mid] > target) {
                // left mai move krna h;
                ans = mid;
                e = mid - 1;
            }
            
            else{
                s = mid + 1;
            }
            
            mid = s + (e-s)/2;  
           
        }
         return ans;
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
          int arr[] = {10, 20, 30, 30, 30, 30, 30, 40, 50};
          int target = 25;
          
          int ans = getUpperBound(arr, target);
          System.out.println("lower bound: " + ans);
          
          

	}
}
