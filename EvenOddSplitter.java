/*
Name: Jessica Kamienski
Date: 10-2-25
Description:  Prints the even numbers on one line and the odd numbers on another.
*/

import java.util.Scanner;

class EvenOdd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter 15 integers separated by one space each: ");
        int nums = input.nextInt();
        
        int[] splitter = new int[nums];
        for (int i = 0; i < splitter.length; i++) {
            splitter[i] = input.nextInt();
        }
        
        System.out.print(i);
  //  public static int getEvens(int[] nums) {
  //       if (nums % 2 == 0) {
  //          System.out.println("Even numbers: " + nums); 
  //      }
  //  }
  //  public static int getOdds(int[] nums) {
  //      if (nums % 2 != 0) {
  //          System.out.println("Even numbers: " + nums); 
   // }
}
}
