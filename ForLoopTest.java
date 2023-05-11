package com.controlstructures;

public class ForLoopTest {

	public static void main(String[] args) {
		int value = 6;
		int answer = 1;
		
		for(int i = 1; i <= value; i++) {
			if(value == 0) {
				break;
			}
			answer = answer * i;
		}
		
		System.out.println("The factorial of " + value + " is: " + answer);
	}

}
