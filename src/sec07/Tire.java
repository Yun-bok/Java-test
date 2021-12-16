package sec07;
//어려움
public class Tire {
	//필드
	public int maxRotation; //최대 회전수(타이어 수명)
	public int accmulatedRotation; //누적 회전수
	public String location;	//타이어 위치
	
	//생성자
	public Tire(String location, int maxRotation) {
		this.location = location;
		this.maxRotation = maxRotation;
	}
	
	//메서드
	public boolean roll() {
		++accmulatedRotation; //누적 회전수 +1
		if(accmulatedRotation<maxRotation) { //증가된 누적회전수가 타이어수명보다 작으면 어디위치에있는 타이어가 최대최소값 수명알려주
			System.out.println(location + "Tire수명 :"
					+ (maxRotation-accmulatedRotation)+"회");
			return true;
		}else {
			System.out.println("***"+location+"Tire 펑크 ***");
			return false; //논리타입
		}
	}

}
