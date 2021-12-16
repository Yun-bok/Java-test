package testgameex;

public class Warrior extends Gameharctor{
//필드
	public int Shield; //방패내구도 저장할 변수
	//생성자
	Warrior() {// 기본생성자
	}
	
	Warrior(String weapon, int damage, int shield){
		super(weapon,damage);
		this.Shield = shield;
	}
	
	//메서드
	public void taunt() {
		System.out.println("적을 도발합니다.");
	}
	
	public void guard() {
		System.out.println("공격을 막습니다.");
		Shield -= 10;
		//Shield = Shield - 10;
		System.out.println("방패 내구도 :" + Shield);
	}
	
	@Override
	public void attack() {
		System.out.println("검으로 공격합니다.");
	}
}
