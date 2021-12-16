package sec07;

public class HankookTire extends Tire {
	// 필드
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
	}

	@Override
	public boolean roll() {
		++accmulatedRotation;// 누적 회전수 +1
		if (accmulatedRotation < maxRotation) { // 증가된 누적회전수가 타이어수명보다 작으면 어디위치에있는 타이어가 최대최소값 수명알려주
			System.out.println(location + "HankookTire 수명:" + (maxRotation - accmulatedRotation));
			return true;
		} else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}

	}
}
