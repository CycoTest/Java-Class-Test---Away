package num1;

import java.util.Scanner;

public class Main {
	int Num;
	
	void loop() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			System.out.print("number? ");
			int Num = sc.nextInt();
			if (Num > 0) {
				System.out.println("positive integer");
			} else if (Num <0) {
				System.out.println("negative number");
			} else if (Num == 0) {
				sc.close();
				break;
			}
		}
	}
	public static void main(String[] args) {
		Main libra = new Main();
		
		libra.loop();
	}
}
