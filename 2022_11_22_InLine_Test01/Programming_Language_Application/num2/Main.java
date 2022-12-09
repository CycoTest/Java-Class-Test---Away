package num2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int rn[] = new int[100];
		
		int i;
		int count = 0;
		for (i=0; i<rn.length;i++) {
			rn[i] = sc.nextInt();
			if (rn[i]==0) {
				sc.close();
				break;
			}
			count++;
		}
		
		int rN[] = new int[count];
		for (i=0; i<rN.length;i++) {
			rN[i] = rn[count - i -1];
			if (rN[i] == 0) {
				sc.close();
				break;
			}
			System.out.print(rN[i] + " ");
		}
	}
}
