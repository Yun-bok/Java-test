package testgameex;
//Game Character 클래스
//필드 : weapon 무기, damage 공격력
//생성자 : 자유롭게
//메서드 -> attack공격() - 출력 : 캐릭터가 공격합니다.
public class Gameharctor {
	//필드
	String weapon; //무기 관련된 변수-> String 클래스타입 -> 문자열을 저장할 수 있는 공간
	int damage; //공격력 관련된 변수 -> int 클래스타입 -> 정수를 저장할 수 있는 공간
	
	//생성자 - 클래스이름이랑 동일
	Gameharctor() { //기본생성자 -> 다른생성자가 있으면 자동생성 x
		
	}
	//매개변수 -> (타입 변수,타입 변수) -> 외부에서 필요한 데이터를 받을때
	Gameharctor(String weapon, int damage) {
		this.weapon = weapon;
		this.damage = damage; //저장해줄수있는생성자 만듬 
	}
	
	//메서드 - 클래스의 동작,행위
	public void attack() {
		System.out.println("캐릭터가 공격합니다.");
	}
}
