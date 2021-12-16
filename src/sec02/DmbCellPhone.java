package sec02;

public class DmbCellPhone extends Cellphone{ //셀폰 클래스 사용가능
	//상속받음으로써 중복되는부분이있어 계발이 빨라진다.
	//모델과 컬러를 셀폰에서 상속받았다
	//필드 
	int channel;
	
	//생성자
	DmbCellPhone(String model, String color, int channel){
		this.model = model;
		this.color = color;
		this.channel = channel;
	}
	
	//메소드
	void turnOnDmb() {
		System.out.println("채널"+channel+"번 DMB 방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channel = channel;
		System.out.println("채널"+channel+"번 으로 바뀝니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방송 수신을 멈춥니다.");
	}
	
}
