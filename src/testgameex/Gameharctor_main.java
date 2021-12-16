package testgameex;

public class Gameharctor_main {
	public static void main(String[] args) {
		//무기는 활, 공격력 100, 화살갯수 100
		//Archer 클래스
		//new -> 참조타입 객체를 생성하고 주소를 돌려주는 역할
		//new 클래스이름() -> 생성자 -> 클래스에 없으면 에러
		Archer archer = new Archer("활",100,100);
		archer.attack();
		archer.reload(100);
		archer.evasion();
		
		
		//무기는 검, 공격력 100, 방패내구도 100
		Warrior warrior = new Warrior("검", 100, 100);
		warrior.taunt();
		warrior.attack();
		warrior.guard();
	}
}
