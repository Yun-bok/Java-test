package pa0923리스트정리;

import java.util.Scanner;
import java.util.Stack;

public class 이윤복0924ex {

	public static void main(String[] args) {
		// q1();
		// q2();
		 q3();

	}

	/*
	 * Q1)Stack 에 저장된 1,2,3 을 더하는 반복문이 제대로 작동하게 수정 Stack<intrger> stack = new
	 * Stack<integer>(); stack.push(1); stack.push(2); stack.push(3);
	 * 
	 * for(int=0; i<stack.size();i++){ 스택안에 요소 전체 출력}
	 */
	static void q1() {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		// i=0~ i<size i++

		int size = stack.size();
		for (int i = 0; i < size; i++) { // 반복 그대로 하면 전체 출력 안된다
			System.out.println(stack.pop());

		}
	}

	/*
	 * Q2) Stack 저장된 1,2,3,4,5 저장( for등 반복)하고 출력(while 사용)하는 반복문
	 */
	static void q2() {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 5; i++) {
			// i 1~5
			// 0+1~4+1
			stack.push(i + 1); // 1~5
		}
		// 방법 1 - 비어있는지 확인할수 있는 친구
		// isEmpty() 비어있으면 true, 비어있지않으면(요소가 있으면)false
		// ! 논리부정 반전 -> true false -> false true
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());

		}
		// 방법 2 - size()
		int size = stack.size(); // 5
		while (size > 0) { // 조건이 참이면 반복, 거짓이면 실행 X
			System.out.println(stack.pop());
			System.out.println("size : " + stack.size());
			size--;
		}
	}

	static void q3() {
		//Stack<Integer> stack = new Stack<Integer>();
		//System.out.println("--------");
		//System.out.println("1.페이지방문|2.이전페이지|3.다음페이지|4.종료");
		//System.out.println("--------");
		
		Scanner input = new Scanner(System.in);
		Stack<String> previous = new Stack<String>();//이전 페이지 목록 저장
		Stack<String> next	   = new Stack<String>();//다음 페이지 목록 저장
		String now_page ="구글";
		
		boolean run = true;
		while(run) {
		int num = Integer.parseInt(input.nextLine());
		switch(num) {
		case 1:
			String firstpage = "구글";
			System.out.println("방문할 페이지 :");
			String page = input.nextLine();
			previous.push(now_page); //이전페이지를 저장
			now_page = page; //현재페이지 이동
			break;
			
		case 2:
			if(previous.isEmpty()) {
				System.out.println("이전페이지가 없습니다.");
				break;
			}
			String page2 = previous.pop();
			next.push(now_page);
			now_page = page2;
			System.out.println("현재페이지 :" +now_page);
			break;
		case 3:
			if(next.isEmpty()) {
				System.out.println("다음페이지가 없습니다");
				break;
			}
			previous.push(now_page);
			now_page= next.pop();
			System.out.println("현재페이지 :" +now_page);
			break;
		case 4:
			run = false;
			break;
		}
		
		
		System.out.println("방문할 페이지: ");
		String page = input.nextLine();
	}
	}
}
