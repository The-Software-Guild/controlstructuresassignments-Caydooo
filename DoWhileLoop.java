package com.controlstructures;

public class DoWhileLoop {

	public static void main(String[] args) {
		int first = 0;
		int second = 1;
		int temp = 0;
		int i = 1;
		
		do {
			System.out.println(first);
			
			temp = first;
			first = first + second;
			second = temp;
			
			i++;
		} while(i <= 10);

	}

}
