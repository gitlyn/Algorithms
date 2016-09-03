package com.cnsumi.problems;

public class Fibonacci {
	public static void main(String[] args) {
		for (int i = 1; i < 4; i++) {
			System.out.println(getNum(i));
		}
	}
	
	public static int getNum(int index) {
		return index <= 2 ? 1 : getNum(index - 1) + getNum(index - 2);
	}
}
