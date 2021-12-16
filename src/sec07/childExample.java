package sec07;

public class childExample {

	public static void main(String[] args) {
		Child child = new Child();
		
		Parent parent = child;
		parent.method1();
		parent.method2(); //Child -> 재정의된 함수
		//parent.method3();
		

	}

}
