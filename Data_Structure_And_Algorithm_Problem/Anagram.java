package com.bridgelabz.dataStuctureAlgorithm;

import java.util.Arrays;
import java.util.Scanner;


public class Anagram {
	
	private boolean anagram(String string1, String string2) {
        if (string1.length() != string2.length())
            return false;
        char[] array1 = string1.toCharArray();
        Arrays.sort(array1);
        char[] array2 = string2.toCharArray();
        Arrays.sort(array2);
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
                return false;
            }
        }
        return true;
    }
	
	 public static void main(String[] args) {
		 
	        Scanner scanner = new Scanner(System.in);
	        System.out.println("Enter the String 1");
	        String string1 = scanner.next();
	        System.out.println("Enter the String 2");
	        String string2 = scanner.next();
	        Anagram anagramDetection = new Anagram();
	        
	        if (anagramDetection.anagram(string1, string2)) {
	            System.out.println("Strings Are Anagram");
	        }
	         else {
	            System.out.println("Strings Are Not Anagram");
	        }
	        
	        scanner.close();
	    }
}


	 