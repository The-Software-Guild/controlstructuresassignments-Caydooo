package com.controlstructures;

public class BreakTest {

	public static void main(String[] args) {

		int value = 1;
		int count = 0;
		
		while(true) {
			count = 0;
			if(value == 1) {
				count = 2;
			}
			for(int i = 1; i <= value/2; i++) {
				if(value % i == 0) {
					count++;
				}
			}
			if(count <= 1) {
				System.out.println(value + " is prime");
			}
			
			value++;
			if(value > 100) {
				break;
			}
		}
	}
}
