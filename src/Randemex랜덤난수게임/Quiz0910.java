package Randemex랜덤난수게임;

import java.util.Random;
import java.util.Scanner;

public class Quiz0910 {
	public static void main(String[] args) {
		// q1) 1~100까지의 난수를 맞춰주는 업다운 기회10
		 Random rand = new Random();
		Scanner input = new Scanner(System.in);
		// 0~99까지 랜덤수 +1 -> 1~100
		 int num = rand.nextInt(100) + 1;

		boolean isrun = true;// 반복을 위한변수 -> 실행중상태
		int count = 10; // 기회 -> 남은횟수
		System.out.println("UP&Down");
		while (isrun) {
			if (count > 0) { // 0보다크면 실행
				System.out.println("숫자를 입력하세요");
				int inputnum = Integer.parseInt(input.nextLine());
				if (num > inputnum) {
					System.out.println("UP 남은기회:" + count);
				} else if (num < inputnum) {
					System.out.println("Down 남은기회 :" + count);
				} else {
					System.out.println("정답입니다. 랜덤:" + num + "남은기회" + count);
					// 선택 1 프로그램을 종료
					// isrun = false; //요기까지면 기본적인 업앤다운
					// System.out.println("프로그램종료");
					// 선택2 재도전코드
					/*
					 * System.out.println("다시 도전? y/n"); String input_str = input.nextLine(); if
					 * (input_str.equals("y")) {// count ->10으로 변경,num 랜덤수 변경 count = 10; num =
					 * rand.nextInt(100) + 1; // 랜덤수 다시초기화 } else if (input_str.equals("n")) { isrun
					 * = false; System.out.println("프로그램종료"); }
					 */
					//선택 2 재도전 함수
					//isrun = Check();
				}
				count--;
			} else { // count <=0 실행
				// 선택1 프로그램을 종료
				// System.out.println("남은기회가 없습니다. 프로그램종료");
				// isrun = false;
				System.out.println("남은 기회가 없습니다.");
				System.out.println("다시 도전? y/n");
				String input_str = input.nextLine();
				if (input_str.equals("y")) {// count ->10으로 변경,num 랜덤수 변경
					count = 10;
					num = rand.nextInt(100) + 1; // 랜덤수 다시초기화
				} else if (input_str.equals("n")) {
					isrun = false;
					System.out.println("프로그램종료");

				}
				System.out.println("UP&Down");
				System.out.println("숫자를 입력하세요");
				int inputnum = Integer.parseInt(input.nextLine());
				if (num > inputnum) {
					System.out.println("UP");
				} else if (num < inputnum) {
					System.out.println("Down");
				} else {
					System.out.println("정답입니다. 랜덤:" + num);
					isrun = false; // 요기까지면 기본적인 업앤다운
				}

			}
		}

	}
}
