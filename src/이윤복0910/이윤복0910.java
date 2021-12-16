package 이윤복0910;

import java.util.Random;
import java.util.Scanner;
public class 이윤복0910 {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		UpAndDown();
	}
	
	static void UpAndDown(){
		Random rand = new Random();
		int num = rand.nextInt(100) + 1;
		
		System.out.println("1 ~ 100 랜덤 수 (999 -> 종료 | 0 -> 다시 시작)");
		for(int i = 1; i <= 10; i++) {
			System.out.print("숫자 입력 : ");
			int input = Integer.parseInt(sc.nextLine());
			
			if(input == 999) {
				System.out.println("종료");
				return;
			}else if(input == 0) {
				System.out.println("재시작");
				UpAndDown();
				return;
			}
			
			if(input < num) {
				System.out.println("Up");
			}else if(input > num) {
				System.out.println("Down");
			}else {
				System.out.println(" 정답 ");
				System.out.println("난수 : " + num);
				End();
				return;
			}
			
			System.out.println("== 남은 기회 : " + (10 - i) + " ==");
		}
		
		End();
	}
	
	static void End() {
		System.out.println("게임 끝");
		System.out.print("다시 시작하시겠습니까? -------> 1.다시 시작 or 종료");
		int num2 = Integer.parseInt(sc.nextLine());
		
		if(num2 == 1) {
			System.out.println("다시 시작");
			UpAndDown();
		}else {
			System.out.println("종료");
			return;
		}
	}
}
