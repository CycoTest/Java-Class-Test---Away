package num01;

import java.util.Scanner;

public class Main {
	int num1;
	int num2;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		num1 = sc.nextInt();
		num2 = sc.nextInt();
		sc.close();
		converter();
	}
	
	void converter() {
		System.out.printf("%d * %d = %d\n", num1, num2, num1 * num2);
		System.out.printf("%d / %d = %d", num1, num2, num1 / num2);		
	}
	public static void main(String[] args) {
		Main simple = new Main();
		
		simple.input();
	}
}
