package com.cnsumi.problems;

public class Hanoi {
	public static void main(String[] args) {
		char a = 'a', b = 'b', c = 'c';
		move(a, b, c, 3);
	}

	public static void move(char a, char b, char c, int num) {
		if (num < 1) return;
		if (num == 1) {
			System.out.println(a + "->" + c);
		}else {
			move(a, c, b, num - 1);
			move(a, b, c, 1);
			move(b, a, c, num - 1);
		}
	}
}
