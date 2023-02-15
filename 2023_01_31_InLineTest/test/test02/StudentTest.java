package test02;

public class StudentTest extends Student {
	public static void main(String[] args) {
		Student test = new Student();
		Student num[] = new Student[5];
		
		for (int i=0; i<num.length; i++) {
			String no = test.getNo();
			String name = test.getName();
			int java = test.getJava();
			int html = test.getHtml();
			int sum = java + html;
			num[i] = new Student(no, name, java, html, sum);
		}
		
		test.studentSort(num);
		
		for (int i=0; i<num.length; i++) {
			test.infoPrint();
		}
	}
}
