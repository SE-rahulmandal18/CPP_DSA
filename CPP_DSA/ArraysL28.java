import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{

  //
  
    static int[] sortArray(int arr[]) {
        
        int n = arr.length;
        int i = 0;
        int j = n-1;
        
        while(i < j ) {
            if(arr[i] == 1 && arr[j] == 0){
                // swap
                arr[i] = 0;
                arr[j] = 1;
             }
            
            if(arr[i] == 0) {
                i++;
            }
            
            if(arr[j] == 1){
                j--;
            }
        }
        return arr;     
    }


  
  //
  
    static int[] getHighestLowestFreqElement(int arr[]) {
        
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        // inset data in HashMap
        for(int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        int highestFreq = Integer.MIN_VALUE;
        int highestNum = -1;
        
        for(int key: freq.keySet()) {
            
            int currentKey = key;
            int currentFreq = freq.get(key);
            
            if(currentFreq > highestFreq) {
                highestFreq = currentFreq;
                highestNum = currentKey;
            }
        }
        
        int lowestFreq = Integer.MAX_VALUE;
        int lowestNum = -1;
        
        for(int key : freq.keySet()) {
            
            int currentKey = key;
            int currentFreq = freq.get(key);
            
            if(currentFreq < lowestFreq) {
                lowestFreq = currentFreq;
                lowestNum = currentKey;
            }
        }
        
        int ans[] = {highestFreq, lowestFreq};
        return ans;
            
    }

  

     // 
     static int getMode(int arr[]) {
         
        HashMap<Integer, Integer> freq = new HashMap<>();
        
        for(int num: arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        
        
        // // print
        // for(int i: freq.keySet()) {
            
        //     // i -> will represent key
        //     System.out.println(i + " -> " + freq.get(i));
        // }
        
        
        int maxFreq = -1;
        int maxFreqWaliKey = -1;
        
        for(int key : freq.keySet()) {
            int currentKey = key;
            int currentKeykiFrequency = freq.get(key);
            
            if(currentKeykiFrequency > maxFreq) {
                // mujhe naya max mil gya
                maxFreq = currentKeykiFrequency;
                maxFreqWaliKey = currentKey;
            }
        } 
        // jab loop s bahar aaoge toh maz freq wali key ready hogi
        return maxFreqWaliKey;
      
        }

  
  
  // print extreme of an array
  
   static void printAlternate(int arr[]){
       
       int n = arr.length;
       int i = 0;
       int j = n-1;
        
        while(i <= j){
            if(i == j){
                System.out.println(arr[i]);
                return;
            }
            
            else{
                System.out.println(arr[i]);
                i++;
                
                System.out.println(arr[j]);
                j--;
            }
        }
  

    // shift element by one in an array
   
   static void shiftElementByOne(int arr[]){
       // step1: store last vale element ki value
       int n = arr.length;
       int temp = arr[n-1];


       // step2: shift all values of array 
        for(int i=n-1 ; i>0; i--){
            arr[i] = arr[i-1];
        }
       
       
       // step3: temp ki value of 0 index pr copy
         arr[0] = temp;
         
         
         for(int k: arr){
             System.out.print(k + " ");
         }
    
        }
    
   


  
   // reverse an Array
   static void reverseArray(int arr[]){
        int n = arr.length;
        
        int i=0;
        int j = n-1;
        
        while(i<=j){
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
            
            i++;
            j--;
        }
        for(int k: arr){
            System.out.println(k);
        }
      
        }
      
   
   
   
    
    
	public static void main (String[] args) throws java.lang.Exception
	{ 
    //
     int arr[] = {0, 1, 0, 1, 0, 1};
	    
	    sortArray(arr);
	    
	    System.out.println(Arrays.toString(arr));
	    
	    // print
	   // for(int num: arr){
	   //     System.out.println(num);
	   // } 
	}

    
    //
     int arr[]  = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
	 
	 int ans[] =  getHighestLowestFreqElement(arr);
	  System.out.println("Highest freq element is " + ans[0]);
	  System.out.println("Lowest freq element is " + ans[1]);
    
    // 
     int arr[]  = {1, 2, 2, 3, 3, 3, 4, 4, 5, 5, 5, 5, 5};
	  int ans = getMode(arr);
	  System.out.println(ans);
	  

    
    // print extreme of an array
    int arr[] = {1,2,3,4,5,7,6};
	   
	    printAlternate(arr);
    
    // shift element by one in an array
    int arr[] = {1,2,3,4,5,7,6};
	   
	  shiftElementByOne(arr);
    
    
	   int arr[] = {1,2,3,4,5,7,6};
	   
	  reverseArray(arr);
	  
	    
	  
	}
}

