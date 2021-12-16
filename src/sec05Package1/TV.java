package sec05Package1;

public class TV extends Product{
	int ch;
	TV(){
		//super();
		//super() -> 부모 기본생성자 호출 (생략 가능)
		//super(매개변수) 매개변수가 있는 생성자 사용가능 -> 부모생성자 가 없으면 컴파일오류
		//반드시 첫줄
	}
	
	TV(int price, int ch){
		super(price);
		System.out.println("자식 생성자");
		this.ch = ch;
		
	}
	
	//오버라이드 - 반환타입 매개변수 일치-> 부모메서드와 구조가 같아야된다
	//@Override ->없을때 있을때 차이보려면 -> 매개변수 바꿔보자 -> 오버로딩 가능한지
	//-> 없으면 오버로딩 -> 있으면 컴파일에러
	//오버라이드 -> 접근제한자를 더 공개적으론 가능 , 더 비공개적으로 불가능
	@Override		//대소문자 구별
	public void print() {
		super.print();
		System.out.println("가격: "+price+"/포인트: "+bonusPoint+"/채널: "+ch);
	}

}
