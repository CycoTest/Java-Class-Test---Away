package num02;

import java.util.Scanner;

class Boxing {
	int num;
	int sum[] = new int[num];

	void putting() {
		Scanner sc = new Scanner(System.in);
		num = sc.nextInt();
		sc.close();
		int sum[] = new int[num];
		
		for (int i = 0; i < num; i++) {
			sum[i] = i + 1;
		}
		
		int Sum = 0;
		for (int i = 0; i < sum.length; i++) {
			Sum += sum[i];
		}
		System.out.println(Sum);
	}
}

public class Main {
	public static void main(String[] args) {
		
		Boxing pack = new Boxing();

		pack.putting();

	}
}
