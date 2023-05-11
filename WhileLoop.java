package com.controlstructures;

public class WhileLoop {

	public static void main(String[] args) {
		int palindrome_value = 454;
		int remainder = 0;
		int reversed = 0;
		int temp = palindrome_value;

		while(palindrome_value != 0){
			remainder = palindrome_value % 10;	
			reversed = reversed * 10 + remainder;	
			palindrome_value = palindrome_value/10;	
		}

		palindrome_value = temp;
		
		if (palindrome_value == reversed) {
			System.out.println(palindrome_value + " is a palindrome.");
		} else {
			System.out.println(palindrome_value + " is not a palindrome.");
		}
	}
}
