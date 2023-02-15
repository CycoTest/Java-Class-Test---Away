package no3;

import java.util.Scanner;

class Assemble {
	private String include = "Hong Gil Dong";
	private char[] each;

	private void gathering() {
		each = new char[include.length()];

		for (int i = 0; i < include.length(); i++) {
			each[i] = include.charAt(i);
		}
	}

	public void print() {
		Scanner in = new Scanner(System.in);
		gathering();

		int start = in.nextInt();
		int end = in.nextInt();
		in.close();

		for (int i = start; i <= end; i++) {
			System.out.print(each[i]);
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Assemble piece = new Assemble();

		piece.print();
	}
}
