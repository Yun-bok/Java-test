package Random;

import java.util.Scanner;

public class UD {
	/*
	 * Q1) 1~100까지의 난수를 맞추는 Up&Down 힌트 Random rand = new Random(); //0~99까지 랜덤수 +1
	 * -> 1~100까지이다 int num = rand.nextInt(100)+1;
	 *  입력받기
	 *  값 반환해주기
	 *  기회 만들기
	 */
	int sum;
	int num = (int)(Math.random()*99+1);
	int count;
	
	UD(int sum,int num, int count) {
		this.sum =sum;
		this.num =num;
		this.count =count;
	}	
	public static void main(String[] args) {
	
		Scanner input = new Scanner(System.in);
		//Random rand = new Random();
		//System.out.println("1~100까지 숫자를 입력해주세요");//출력
		//정수입력
		
	}
	
	public void roop() { //반복
		while(true) {
			Scanner input = new Scanner(System.in);
			System.out.println("1~100까지 숫자를 입력해주세요");
			int sum = Integer.parseInt(input.nextLine());
			if(sum<num) { //랜덤함수가 입력값보다 크면
				System.out.println(sum+"Up"+"기회"+count);
						count--;
			}else if(sum>num) { //입력값이 랜덤값보다 크면
				System.out.println(sum+"Down"+"기회"+count);
						count--;
			}else if(count>0){
				System.out.println(gameover);
				break;

			}
		}
	}
	public void rand() { //난수생성?
		
	}
	
	public void Count(int count) { //기회
		
		for(int i=0; i<10; i++) {
			if(i<=0)
				System.exit(count);
		}
	}
	
	
	public void gameover(int count) {
		Scanner input = new Scanner(System.in);
		int str = Integer.parseInt(input.nextLine());
		System.out.println("1.게임끝 프로그램 종료," + "2.다시도전하십니까?");
		if(str==1) {
			System.out.println("프로그램종료");
		}else if(str==2) {
			System.out.println("다시시작"); //기회10으로 초기화
			
		}
		
	}
}


