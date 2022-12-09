package com.hello_world_bruen;
// Add scanners here
import java.util.Scanner;
public class fibonacci {
	 public static int fibonacci(int n) {
	      int last, prelast, fib;
	      if(n < 0){
	         return -1;
	      }
	      else if(n == 0){
	         return 0;
	      }
	      else if(n == 1){
	         return 1;
	      }
	      else{
	         prelast = 0;
	         last = 1;
	         for (int i = 0; i < n; i++){
	            fib = prelast + last;
	            prelast = last;
	            last = fib;
	         }
	         return prelast;
	      }
	   }
	   
	   public static void main(String[] args) {
	      Scanner scnr = new Scanner(System.in);
	      int startNum;
	      
	      startNum = scnr.nextInt();
	      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
	   }
	}


