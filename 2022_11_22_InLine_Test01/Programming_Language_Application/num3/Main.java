package num3;

import java.util.Scanner;

public class Main {
	String letter;
	
	void input() {
		Scanner sc = new Scanner(System.in);
		letter = sc.next();
		sc.close();
		
		output();
	}
	
	void output() {
		char words[] = new char[100];
		for (int i = 0; i < letter.length(); i++) {
			words[i] = letter.charAt(i);
			if (words[i] >= 65 && words[i] <= 90) {
				System.out.printf("%c", words[i]);
			} else if (words[i] >= 97 && words[i] <= 122) {
				System.out.printf("%c", words[i] - 32);
			}
		}		
	}
	public static void main(String[] args) {
		Main capital = new Main();
		
		capital.input();
	}
}
