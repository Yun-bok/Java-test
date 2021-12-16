package testgameex;

import java.util.Scanner;

public class Game_main {
	//프로그램 복습 -> 이해
	//메인클래스(시작함수) - 최상단부터 -> 최하단 까지내려가면됨
	//입력을 받기위한 변수 input
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		//게임캐릭터클래스 배열 변수 character_arr

		Gameharctor[] character_arr = new Gameharctor[8];
		//boolean 값은 반복을 끝내기 위한 조건으로 isrun 선언
		boolean isrun = true;
		//while(조건식) 조건식이 만족하면(참) true -> {실행코드} 실행
		while (isrun) {
			//사용자 편의를 위한 출력
			System.out.println("1. 캐릭터 생성, 2.캐릭터 선택, 3.캐릭터 조회, 4.캐릭터삭제, 5.종료");
			//input.nextLing ->문자열 -> int 변환
			int num = Integer.parseInt(input.nextLine());
			//조건문
			//switch(변수)
			//case 값:   -> 변수랑 값은 타입 일치
			//변수 값 같으면 실행 break;없으면 끝까지 실행
			//어떤이름();  생성자, 메소드(함수)
			//메서드or생성자(매개변수)
			//매개변수 -> 타입 변수 이름	->사용 메서드(매개변수타입에 맞는값)
			//타입 어떤값을 저장지 변수이름 메서드{}사용할 이름
			switch (num) {
			case 1:
				Create_char(character_arr);
				break;
			case 2:
				Select_char(character_arr);
				break;
			case 3:
				Show_char(character_arr);
				break;
			case 4:
				Delete_char(character_arr);
				break;
			case 5:
				isrun = false;
				break;

			}

		}
	}
	//함수-> 실행 X ->(main안에)어딘가에서 호출해야지 실행
	static void Create_char(Gameharctor[] char_arr) {
		System.out.println("1. 전사  2.궁수");
		int num = Integer.parseInt(input.nextLine());
		if (num == 1) {
		
			//캐릭터 슬롯(게임캐릭터클래스 배열)
			//현재 배열 크기 8 , i 0~7
			for (int i = 0; i < char_arr.length; i++) {
				//캐릭터 배열 인덱스자리가 비었지는(null)기준 null 데이터가 없으면 출력도 못하니까
				//Archer  Warrior  null null...8개
				//			   	    2 
				if (char_arr[i] == null) {
					//num -> 직업의미 -> 1 전사, 2궁수
					if (num == 1) {
						System.out.println("전사생성");
						char_arr[i] = new Warrior("검", 100, 100);

					} else if (num == 2) {
						System.out.println("궁수생성");
						char_arr[i] = new Archer("활", 100, 100);
					}
					return; // ->void -> 아무없이 , 함수끝을 의미
					//함수반환값이 있을때 반환타입이랑 일치하는 값이 뒤에 들어가요
					//함수를 끝내고 뒤에있는값을 함수호출한 위치로 보내주는역활
				}
			}
			System.out.println("자리가 없습니다.");
		}
	}
	//캐릭터선택 기능
	static void Select_char(Gameharctor[] char_arr) {
		Show_char(char_arr);
		System.out.println("캐릭터를 선택해주세요");
		int num = Integer.parseInt(input.nextLine());
		//객체 instanceof 클래스타입
		//-> 객체의 타입 우측의 클래스타입으로 변환가능체크 가능-> true
		boolean result = char_arr[num-1] instanceof Archer;
		if(result) {
			Archer archer = (Archer)char_arr[num-1];
			archer.attack();
			archer.evasion();
			archer.reload(1);
			
		}
		boolean result2 = char_arr[num-1] instanceof Warrior;
		if(result2) {//warrior 클래스로 변환이 되는지~
			Warrior warrior = (Warrior)char_arr[num-1];
			warrior.attack();
			warrior.guard();
			warrior.taunt();
		}
	}

	static void Show_char(Gameharctor[] char_arr) {
		for (int i = 0; i < char_arr.length; i++) {
			if (char_arr[i] != null) {
				if (char_arr[i] instanceof Warrior) {
					System.out.print((i + 1) + "전사 ");
				} else if (char_arr[i] instanceof Archer) {
					System.out.print((i + 1) + "궁수");
				}
			} else {
				System.out.print((i + 1) + "비어있음");
			}
		}
		System.out.println();
	}

	static void Delete_char(Gameharctor[] char_arr) {
		System.out.println("삭제할 자리번호를 입력해주세요");
		int num =Integer.parseInt(input.nextLine());
		char_arr[num-1] = null; //char_arr[num-1]원래는 게임캐릭터가 들어가있었지만 null로바꾸고 출력한다
		Show_char(char_arr);
	}
//새로할때마다 데이터가 날라가는데 이를 방지하려면 배우는게 데이터베이스,서버이다
}
