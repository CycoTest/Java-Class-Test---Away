package test02;

public class Student extends Person {
	protected int java;
	protected int html;
	protected int sum;

	Student(String no, String name, int java, int html, int sum){
		super.getNo();
		super.getName();
		super.getName();
		this.java = java;
		this.html = html;
		this.sum = sum;
	}
	
	Student() {
		super.getNo();
		super.getName();
		java = 100;
		html = 50;
		sum = java + html;
	}
	
	@Override
	public void infoPrint() {
		System.out.printf("번호 : %s\n이름 : %s\nJava : %d\nHtml : %d\n합계 : %d\n", super.getNo(), super.getName(), java, html, sum);
		System.out.println();
	}
	
	public void studentSort(Student[] score) {
		for (int i=0; i<score.length; i++) {
			for (int j=0; j<score.length - i -1; j++) {
				if (score[j].sum < score[j+1].sum) {
					Student temp = score[j];
					score[j] = score[j+1];
					score[j+1] = temp;
				}
			}
		}
	}
	
	public int getJava() {
		return java;
	}
	
	public int getHtml() {
		return html;
	}
}
