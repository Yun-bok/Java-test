package testgame;

//메인에도 화살 카운트
//전사 공격 출력:검으로 공격합니다.
//궁수 ->기본 상속받음
public class Game_Archer extends Middle{
	 public int arrow_count;
	
	 public Archer(String str,int i, int j) {
		 this.weapon = str;
		 this.damage = i;
		 this.arrow_count = j;
	
}
	 public void dodge
	 System.out.println(dodge+"캐릭터가 회피합니다");
	
}
void attack() {
	System.out.println("캐릭터가 활을쏩니다");
}
