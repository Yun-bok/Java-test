package sec04;

public class SupersonicAirplane extends Airplane{
	//static 객체 생성 X -> 클래스이름으로 접근할수있다. -> 모든객체 공통으로
	//final -> 하넙ㄴ 값이 저장되면 변경 불가
	public static final int NORMAL = 1;
	public static final int SUPERSONIC = 2;
	
	public int flymode = NORMAL;
	
	
	@Override  		// -> 좀더 안전하게 의도한 코딩
	public void fly() {
		if(flymode==SUPERSONIC) {
			System.out.println("초음속비행합니다.");
		}else {
			//Airplane 객체의 fly() 메서드 호출
			super.fly();
		}
	}

}
