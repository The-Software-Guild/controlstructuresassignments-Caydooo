package com.controlstructures;

public class SwitchCaseTest {

	public static void main(String[] args) {
		char character = 'f';
		
		switch(character) {
			case 'a': {
				System.out.println("The character is a vowel!");
				break;
			}
			case 'e': {
				System.out.println("The character is a vowel!");
				break;
			}
			case 'i': {
				System.out.println("The character is a vowel!");
				break;
			}
			case 'o': {
				System.out.println("The character is a vowel!");
				break;
			}
			case 'u': {
				System.out.println("The character is a vowel!");
				break;
			}
			default: {
				System.out.println("The character is a consonant!");
			}
		}

	}

}
