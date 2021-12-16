package testgameex;

public class Archer extends Gameharctor{
	//필드
	public int arrow_count; //화살갯수를 저장하는 변수
	
	//생성자
	public Archer(String weapon,int damage, int arrow_count) {// 상속받았기 때문에 쓸수있다
//		this.weapon =weapon;
//		this.damage =damage;
//		this.arrow_count = arrow_count;
		
		super(weapon,damage);//super를 써서 부모의 생성자를 불러옴
		this.arrow_count =arrow_count; //아처가 가진 애로우 카운트만 초기화
	}
	
	//메서드 -회피() - 출력 캐릭터가 회피합니다.
	public void evasion() {
		System.out.println("캐릭터가 회피합니다.");
	}
	//공격() - 출력 : 활을 쏩니다. -> arrow_count --  -> arrow_count 출력
	@Override //중요
	public void attack() { //부모가만든 함수를 자식이 재 정의한다 공격을 상속받아도
		System.out.println("활을쏩니다.");
		arrow_count --;
		System.out.println(arrow_count);
	}
	//reload장전(int cnt) - cnt만큼 arrow_count 증가
	public void reload(int cnt) {
		System.out.println("재장전");
		System.out.println(arrow_count);
	//	arrow_count += cnt //좌측 값에 우측값을 더한 후 좌측에 저장
		arrow_count = arrow_count + cnt;
		System.out.println(arrow_count);
	}

}
