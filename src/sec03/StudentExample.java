package sec03;

public class StudentExample {
	public static void main(String[] args) {
		//Student클래스 상속받음
		Student student = new Student("홍길동", "123456-1234567", 1);
		System.out.println("name : " + student.name);
		System.out.println("ssn : " + student.ssn);
		System.out.println("studentno : " + student.studentNo);
		
		
	}
}
