
import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
   // print unsorted element in an array
  
   static int getUnsortedElement(int arr[]){
        
            for(int i = 0; i<arr.length; i++){
                
                if(arr[i+1] < arr[i]){
                    
                    return arr[i+1];
                }
            }
            
            return -1;
      
        }
  

  // zero and one count 
  static int[] getZeroOneCount(int arr[]){
        
        int zeroCount = 0;
        int oneCount = 0;
        
        for(int i=0; i<arr.length; i++){
            if(arr[i] == 0){
                zeroCount++;
            }
            else{
                oneCount++;
            }
        }
        
        int ans[] = {zeroCount, oneCount};
        return ans;
        
        }
 
  
   // return sum of postive and negavtive numbers   
   static int[] getPosNegSum(int arr[]){
       
       int posSum = 0;
       int negSum = 0;
       
       for(int i=0; i<arr.length; i++){
           
           if(arr[i] > 0){
               
               posSum += arr[i];
           }
           else{
               
           negSum += arr[i];
       }
     }
      
      int ans[] = {posSum, negSum};
      return ans;
   }

  

  // find max in an array
   static int getMaximum(int arr[]){
       int maxi = arr[0];
       
       for(int i=0; i<arr.length; i++){
       if(arr[i] > maxi) {
           maxi = arr[i];
        }
    }
       
       return maxi;
   }
   

  
 // linear search
    // find key element in an array
    
    static boolean findTarget(int arr[], int target){
        
        for(int i=0; i<arr.length; i++){
            
            if(arr[i] == target){
                return true;
            }
        }
         return false;
    }
    

  
    
    // array elements multiply by 10
    
    static int[] multiplyBy10(int arr[]) {
        int size = arr.length;
        int newArray[] = new int[size];
        
        for(int i=0; i<size; i++)
        {
            int element = arr[i];
            int newElement = element*10;
            newArray[i] = newElement; 
        }
        
        return newArray;
        
    }
    
    
    
    // average of an array
    static double getAverage(int arr[]){

        
	    int arr[] = {3, 5, 6, 7};
	    
	    boolean ans = findTarget(arr, 9);
	    System.out.println(ans);
	    

      
        
        // since traversing the whole array Time Complexitiy O(n) 
        // Space Complexitiy O(1)
        
        double sum = 0;
        
        for(int i : arr){
            sum += i;   
        }
        
        int size = arr.length;
        double avg = sum/size;
        
        return avg;
        
    }
    
    
	public static void main (String[] args) throws java.lang.Exception
	{
      // print unsorted element in an array
    int arr[] = {1,2,3,4,5,7,6};
	   
	   System.out.println(getUnsortedElement(arr));
	  
    
    // zero and one count
     int arr[] = {1, 0, 0, 1, 0, 1, 1, 0};
	    
	    int ans[] = getZeroOneCount(arr);
	    System.out.println("Zero count " + ans[0]);
	    System.out.println("One count " + ans[1]);
	  

    
     // return sum of postive and negavtive numbers
     int arr[] = {2, -3, -1, 6, 4, -9};
	    
	    int ans[] = getPosNegSum(arr);
	    System.out.println("Positive sum " + ans[0]);
	    System.out.println("Negative sum " + ans[1]);
	 

    int arr[] = {1, 2, 4, 6, 9};
     System.out.println(getMaximum(arr));
    
		// your code goes here
// 		int arr[] = {2, 3, 1, 4};
		
// 		System.out.println(getAverage(arr));

    
	    int arr[] = {2, 3, 1, 4};
	    int ans[] = multiplyBy10(arr);
	    
	    System.out.println("printing ans array ");
	    for(int i: ans){
	        System.out.println(i);
	    }
		


    

	}
}
