package num03;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int height = sc.nextInt();
		int weight = sc.nextInt();
		sc.close();
		
		int BMI = weight + 100 - height;
		
		System.out.printf("%d\n", BMI);

		if (BMI > 0) {
			System.out.println("Obesity");
		}
	}
}
