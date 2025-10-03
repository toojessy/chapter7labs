/*
Name: Jessica Kamienski
Date: 10-2-25
Description:  Prints the even numbers on one line and the odd numbers on another.
*/

import java.util.Scanner;
import java.util.Arrays;

public class EvenOddSplitter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 15 integers separated by one space each: ");
        
         int[] splitter = new int[15];
        for (int i = 0; i < 15; i++) {
            int nums = input.nextInt();
            splitter[i] = nums;
        }
        System.out.println("Even numbers: " + Arrays.toString(getEvens(splitter))); //prints the array as a string
        System.out.println("Odd numbers: " + Arrays.toString(getOdds(splitter)));
        input.close();
    }
    
    public static int []getEvens(int[] nums) {
        int[] evennums = new int[7];
        int count = 0;
        int even = nums.length;
        for (int i = 0; i < even; i++) {
            if (nums[i] % 2 == 0) {
            evennums [count] = nums[i];
            count++;
            }
         
         }
         return evennums;
    }
    
    public static int []getOdds(int[] nums) {
        int[] oddnums = new int[8];
        int count = 0;
        int odd = nums.length;
        for (int i = 0; i < odd; i++) {
            if (nums[i] % 2 != 0) {
            oddnums [count] = nums[i];
            count++;
            }
         
         }
         return oddnums;
    }
}    
    
