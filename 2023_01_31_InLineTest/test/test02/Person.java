package test02;

public class Person {
	private String no;
	private String name;
	
	Person() {
		no = "S001";
		name = "홍길동1";
	}
	
	private void setNo(String number) {
		no = "S" + number;
	}
	
	public String getNo() {
		return no;
	}
	
	private void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void infoPrint() {
		System.out.printf("번호 : %s\n이름 : %s\n", no, name);
	}
}
