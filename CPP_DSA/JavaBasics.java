import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
    
    
    static void printDigits(int num) {
        // agar num ka vlue 0 hoga to ruj jaunga
        // agar num ka value 0 ni hua to processing kargurna
        
        while(num!= 0){
            int digit = num % 10;
            System.out.println(digit);
            
            num = num / 10; 
         }
    }
    
    
    static int countDigits(int num) {
    
        int count = 0;
    
        while(num!= 0){
            int digit = num % 10;
            count++;
            
            num = num / 10; 
         }
        return count;
    }
    
 static int sumDigits(int num) {
    
        int sum = 0;
    
        while(num!= 0){
            int digit = num % 10;
           sum = sum + digit;
            
            num = num / 10; 
         }
        return sum;
    }


    static int reverseNumber(int num) {
        
        int ans = 0;
        
        while(num!= 0){
            
            int digit = num % 10;
            ans = ans*10 + digit;
            num = num/10;
            
        }
        return ans;
    }

    static boolean isPalindrome(int num){
        
        int original = num;
        int reverseNum = reverseNumber(num);
        
        if(original == reverseNum){
            System.out.println("Number is a palindrome");
            return true;
        }
        System.out.println("Number is not a palindrome");
        else return false;
    }
    
  
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here

    	
		boolean ans = isPalindrome(1234);
		System.out.println(ans);
		
    int num = 1234;
		int reverseNum = reverseNumber(num);
		System.out.println("Reverse Number is " + reverseNum);
		
		int num = 53127;
		printDigits(num);
		
	    int ans = countDigits(num);
		System.out.println("total count is " + ans);

    int ans1 = sumDigits(num);
		System.out.println("Total sum is " + ans1);

	}
}
