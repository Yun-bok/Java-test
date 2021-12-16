package pa0923리스트정리;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class 이윤복0924 {

	public static void main(String[] args) {
		Q1();
		//Q2();
		//Q3();

	}

	/* 
	 * Q1)Stack 에 저장된 1,2,3 을더하는 반복문이 제대로 작동하게 수정 Stack<intrger> stack = new
	 * Stack<integer>(); stack.push(1); stack.push(2); stack.push(3);
	 * 
	 * for(int=0; i<stack.size();i++){ 스택안에 요소 전체 출력} 스택사이즈를 사용해서 전체 출력 위로뺀다던가?
	 */
	static void Q1() {
		int num = 0;
		int sum = 0;
		int data = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1); //1
		stack.push(2); //2
		stack.push(3); //3 들어가고
		
		//1,2,3을 더하는 반복문이 작동하게끔
		int data1 = stack.pop();
		int data2 = stack.pop();
		int data3 = stack.pop();
			//0부터 스택사이즈 까지 증가
		int size = stack.size();
		for(int i=0; i<stack.size();i++) { //3까지 반복
			 sum =+ i;
			System.out.println();
			
			//######
			i 가 stack.push보다 작으면 
			
				
			//	num =+ size; 
			//System.out.println(data); //이렇게 되면 사이즈만 3번나오고
			//피보나치?
			
			
			
		//	sum =+ data1+data2+data3) 이러면 의미없고
		}
		
		
		
		
	}
	

	// Q2) Stack 저장된 1,2,3,4,5 저장(for등 반복)하고 출력(while 사용)하는 반복문
	//Stack<integer> s = new
	//s.push(1) - 반복문으로 1~5저장
	//s.pop -> while로 전체출력
	static void Q2() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		int size = stack.size();
		for(int i=0; i<stack.size(); i++) { //반복
			boolean run;
			//while(run) {
				
		//	}
			
		}

	}
	/*
	 * Q3) 웹 브라우저의 앞으로 가기, 뒤로가기 기능 구현(스택이용) 1.페이지방문(문자열 입력) 2.이전페이지로 가기(출력) 예외:
	 * 이전페이지가 없습니다.(조건) (처음엔 이전페이지가 없고 1번으로 방문했다는 가정하에) 3.다음페이지로 가기(출력) *스택사용 예외:
	 * 다음페이지가 없습니다(조건)
	 * 
	 */

	static void Q3() {
		Queue<String> queue = new LinkedList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println("1.google | 2.naver | 3.daum");
		System.out.println("---------------");
		System.out.println("접속할 웹브라우저 입력:");
		String url1 = input.nextLine();
		
		queue.offer(url1); // 입력받은 주소 저장
		System.out.println("현재 브라우저:"+url1);
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("이전브라우저"); break;
		case 2: System.out.println("다음브라우저"); break;
		}
		
		
		if(url1)
		//데이터 고정이 아니라 꺼내면 삭제된다
		//그러면???
		
		
		if(url1 == null) {//
			System.out.println("이전 페이지가 없음");
		}
		
		boolean isEmpty = url1.isEmpty(); //만약 url값이 비어있다면
		if(isEmpty) {
			
		System.out.println("이전페이지가 없습니다");//이전 페이지 시
		}else if(isEmpty) {
			System.out.println("다음페이지가 없습니다"); //다음페이지시
			
		}
		

	}
	static void q4() {
		Stack<String> stack = new Stack<String>();
		
	}
	
}
