package roundArea;

import java.util.Scanner;

class NumericalFactor {
	private int radius;
	private double pi;

	public void FactorMaker() {
		Scanner in = new Scanner(System.in);
		radius = in.nextInt();
		in.close();

		pi = ((double) Math.round((double) Math.PI * 100)) / 100;
	}

	public int getRadius() {
		return radius;
	}

	public double getPi() {
		return pi;
	}
}

public class Main {
	public static void main(String[] args) {
		NumericalFactor bring = new NumericalFactor();

		bring.FactorMaker();
		System.out.printf("%.2f", bring.getRadius() * bring.getRadius() * bring.getPi());
	}
}
/*
 * Q: 반지름의 길이를 전달받아 넓이를 출력하는 함수를 작성하고 
 * 		반지름의 길이를 입력받아 함수를 호출하여 넓이를 출력하는 프로그램을 작성하시오.
 * 
 * 		단, 원주율(π)은 3.14로 하고 반올림하여 소수 둘째자리까지 출력한다. 
 * 
 * 		원의 넓이 = 반지름(r) * 반지름(r)​ * 원주율(π)​이다.
 * 
 * input ex)
 * 10
 * 
 * output ex) 
 * 314.00
 * 
 */
