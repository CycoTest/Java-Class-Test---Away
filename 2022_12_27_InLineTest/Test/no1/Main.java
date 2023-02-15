package no1;

import java.util.Scanner;

class GetNum {
	private int iN;

	private void setIntegerNum() {
		Scanner in = new Scanner(System.in);

		int setNum = in.nextInt();
		if (setNum < 100) {
			iN = setNum;
		}
		in.close();
	}

	public int getIntegerNum() {
		setIntegerNum();
		return iN;
	}
}

public class Main {
	private int[][] rect;

	private void figureMaker() {
		GetNum condition = new GetNum();
		int length = condition.getIntegerNum();

		rect = new int[length][length];
		for (int i = 0; i < rect.length; i++) {
			for (int j = 0; j < rect[i].length; j++) {
				rect[i][j] = 4 * i + j + 1;
			}
		}
	}

	public void print() {
		figureMaker();
		for (int i = 0; i < rect.length; i++) {
			for (int j = 0; j < rect[i].length; j++) {
				System.out.print(rect[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		Main answer = new Main();

		answer.print();
	}
}
