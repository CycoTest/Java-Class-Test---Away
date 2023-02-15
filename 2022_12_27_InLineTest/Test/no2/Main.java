package no2;

import java.util.Scanner;

class Triangle {
	private int x;
	private int y;

	public Triangle(int x, int y) {
		this.x = x;
		this.y = y;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}
}

public class Main {
	private int sumX;
	private int sumY;
	Triangle[] position = new Triangle[3];

	private void setPosition() {
		Scanner in = new Scanner(System.in);

		for (int i = 0; i < position.length; i++) {
			int x = in.nextInt();
			int y = in.nextInt();
			position[i] = new Triangle(x, y);
		}
		in.close();
	}

	private void makeXY() {
		setPosition();

		for (int i = 0; i < position.length; i++) {
			sumX += position[i].getX();
			sumY += position[i].getY();
		}
	}

	public void print() {
		makeXY();

		double cgX = (double) sumX / position.length;
		double cgY = (double) sumY / position.length;

		System.out.printf("(%.1f, %.1f)", cgX, cgY);
	}

	public static void main(String[] args) {
		Main center = new Main();

		center.print();
	}
}
