package com.bridgelabz.dataStuctureAlgorithm;

import java.util.ArrayList;

public class PrimeNumberPalindrome {
	
	 public static void main(String[] args) {
		 
	        System.out.print("Prime Numbers between 0 to 1000 are : ");
	        int k = 0;
	        ArrayList<Integer> array = new ArrayList<Integer>();
	        for (int i = 0; i <= 1000; i++) {
	            int j = 1, count = 0;
	            while (j <= i / 2) {
	                if (i % j == 0) {
	                    count++;
	                    if (count == 2) {
	                        break;
	                    }
	                }
	                j++;
	            }
	            if (count == 1) {
	                array.add(k, i);
	               
	                k++;
	            }
	        }
	        for (Object x : array) {
	            System.out.print(x + " ");
	        }

	        System.out.println();

	        for (int i = 0; i < array.size(); i++) {

	            int value = (Integer) array.get(i);
	            int number = 0, remain = 0, temp = value;
	        

	            while (temp > 0) {
	                remain = temp % 10;
	                temp = temp / 10;
	                number = number * 10 + remain;
	            }
	            if (number == value) {
	                if(number != 999) {
	                    System.out.print(value + " is a Palindrome, ");
	                }
	                else{
	                    System.out.print(value + " is a Palindrome.");
	                }
	            }
	        }
	    }
}