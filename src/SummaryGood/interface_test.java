package SummaryGood;

public interface interface_test { //final 써야함 static , default도 써야함
	public static final int num = 10;
	int num2 = 10; //원래 그냥쓰면 인식못하고 위에처럼 명시해줘야함
	
	//interface_test(){ //생성자도 안되고
		
	//다중상속 쌉가능
	
	abstract void test(); //추상메서드
	
	static void test2() { //이런식으로쓴다
		
	}
	
	//void test3() { //default 인지 static인지 모르니 명시적으로 앞에 넣어줘야한다 public 불가능
		
	

}
