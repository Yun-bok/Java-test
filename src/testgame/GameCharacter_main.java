package testgame;

import java.util.Scanner;

//public static void main(String[] args) {

//무기는 활, 공격력 100, 화살갯수 100
//   Archer archer = new Archer("활",100, 100);
//  archer.attack();
// archer.reload();

//무기는 검, 공격력 100, 방패내구도 100
//   Warrior warrior = new Warrior("검",100,100)
//  warrior.taunt();
// warrior.attack();
// warrior.guard();
// }
public class GameCharacter_main {
	public static void main(String[] args) {
		//상속?
		Scanner sc = new Scanner(System.in);
		System.out.println("클래스를 선택하세요");
		int num = Integer.parseInt(sc.nextLine());
		
		
		//클래스 선택후
		Game_d play = new Game_d("","","",);
		System.out.println();
		System.out.println();
		System.out.println();
	}

}

