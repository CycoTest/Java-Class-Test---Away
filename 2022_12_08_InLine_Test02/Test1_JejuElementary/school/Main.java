package school;

import java.util.Scanner;

class Info {
	private String school = "Jejuelementary";
	private int grade = 6;

	public void putInfo() {
		Scanner in = new Scanner(System.in);

		this.school = in.next();
		this.grade = in.nextInt();
		in.close();

		printf();
	}

	public String getSchool() {
		return school;
	}

	public int getGrade() {
		return grade;
	}

	public void printf() {
		System.out.printf("%d grade in %s School", getGrade(), getSchool());
	}
}

public class Main {
	public static void main(String[] args) {
		Info list = new Info();

		list.printf();
		list.putInfo();
	}
}
/*
 * Q: "학교명", "학년"을 저장할 수 있는 구조체로 2개의 변수를 선언한 후, 
 * 		한 개의 변수는 학교명에 "Jejuelementary", 
 * 		학년에 "6"으로 각각 초기화하고, 
 * 		다른 변수에는 새로운 학교와 학년을 입력받아 아래와 같이 출력하는 프로그램을 작성하시오.
 * 		
 * 		학교명은 20자 이하의 영문자이다.
 * 
 * input ex) 
 * Seogwipomiddle 1
 * 
 * output ex)
 * 6 grade in Jejuelementary School // 초기화한 것
 * 1 grade in Seogwipomiddle School // 입력받은 것
 * 
 * 
 */
