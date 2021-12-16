package sec02;

public class Cellphone {
	//필드
	String model;
	String color; //핸드폰의 속성(cellphone 의데이터)를 받아쓸수있었다
	
	//생성자
	Cellphone() {
		System.out.println("Cellphone 기본생성자호출");
	}
	
	Cellphone(String model, String color) {
		System.out.println("Cellphone 기본생성자호출");
		//super();
	//	super(model,color);
		//this.model = model;
		//this.color = color;
//		this.channel = channel;
	}
	
	//메서드
	void powerOn() {
		System.out.println("전원을 킵니다.");
	}
	
	void poweroff() {
		System.out.println("전원을 끕니다.");
	}
	void bell() {
		System.out.println("벨이 울립니다.");
	}
	void sendVoice(String message) {
		System.out.println("자기: "+message);
	}
	void receiveVoice(String message) {
		System.out.println("상대방:" +message);
	}
	void hangUp() {
		System.out.println("전화를 끊습니다.");
	}
}
