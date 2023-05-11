package com.controlstructures;

public class ContinueTest {

	public static void main(String[] args) {
		for (int i = 0; i < 100; i++) {
			if(i%2 == 1) {
				continue;
			}
			System.out.println(i);
		}

	}

}
