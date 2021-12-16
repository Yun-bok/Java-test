package sec07;

public class KumhoTire extends Tire {
	// 필드
	// 생성자
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	// 메소드
	@Override
	public boolean roll() {
		++accmulatedRotation;
		if (accmulatedRotation < maxRotation) { // 증가된 누적회전수가 타이어수명보다 작으면 어디위치에있는 타이어가 최대최소값 수명알려주
			System.out.println(location + "KumhoTire 수명:" + (maxRotation - accmulatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}
}
