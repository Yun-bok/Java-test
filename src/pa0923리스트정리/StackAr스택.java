package pa0923리스트정리;

import java.util.Stack;

public class StackAr스택 {

	public static void main(String[] args) {
		//스택
		//컵 모양 생각
		// -> 먼저 저장한것이 아래 나중에 저장한것이 위에
		// ->꺼낼때는(삭제) 위에서 부터
		//여기까진 이해하기
		
		//LIFO - Last In First Out
		//선입후출이다
		//후입선출   이것들은 말장난이다 ->시험
		//최상위 데이터 (다음 나올데이터) ->Top 이라 부름
		//여기까진외우기
		
		//사용할때
		//역추적을 해야할 때(ex.문서 작업 시 실행취소 ex)Ctrl+z 이런거쓸때 사용)
		//되돌리기            가장 나중에 입력한 내용부터 삭제
		//히스토리 (앱, 웹페이지 -> 이전페이지, 다음페이지, 방문순서 등) 관리 할때 사용
		
		//네이버 -> 다음 -> 구글 ->카카오
		//이전페이지를 관리(하는 데이터 구조? 스택이 있을것) ->네이버 -> 다음 -> 구글
		//이전 -> 구글 -> -> 다음 -> 네이버
		
		//주요 사용법
		//저장할때 push
		//꺼낼때  pop        -> 주의* 불러오기x -> 데이터 꺼내기(삭제)
		//다음에 꺼내질 값 확인 peek 라는게 있다
		
		//알고리즘 문제
		//스택은 주로 사용하는게
		//괄호 검사, 역순 문자열 만들기, 후위표기법으로의 변환등
		//순서문제 큐
		//역순 스택
		
		//오류
		//자료가 없을때 pop하는 오류 -> stack underflow
		//스택의 크기 이상의 자료를 push하려 할때 오류 -> stack overflow
		//이거 시험각
		//
		//		  5          넘쳐흘렀다 오버플로우다
		//     |  4     |  5  4   3  2   1  1
		//     |  3     |
		//     |  2	    |
		//     |__1_____|  이건 언더 플로우다
		//
		Stack01();
		Stack02();
	}
	//원리가 궁금하거나 배운내용으로 만들어보고 싶은사람 -> 책에있다 113
	//책(배열,연결리스트)참고
	//자바에서 제공해주는 스택구조 사용
	static void Stack01() {
		//스택 util 생성
		Stack<Integer> stack = new Stack<Integer>(); //int타입을 저장하는 스택이 생긴다
		//스택사용은 외우자
		//stack.add(1); add도 사용은 가능 하지만
		//<제너릭타입> -> 저장되는 타입이 <제너릭타입>이다 일반적으로 생각
		//제너릭을 제공해주는건 자바의 강점 개인적으로 공부해보자
		//이게 통상적으로 다른데서도 쓰인다
		//push 데이터(요소) 저장
		stack.push(1);  //1 
		stack.push(2);  //1 2
		stack.push(3);  //1 2 3
  		stack.push(4);  //1 2 3 4
  		
  		
  	//	for(int i=0; i<stack.size(); i++) {
  	//		int num = stack.pop();
  	//		System.out.println(num);
  	//	}
  		//출력은?
  		//4
  		//3
  		//2
  		//1 하지만 생각처럼 잘안나온다~
  		//size 스택의크기
  		int size = stack.size();
  		System.out.println("pop 이전 size: "+size); //4
  		
  		int data1 = stack.pop();
  		System.out.println(data1); //4
  		//데이터 유지가 아니라 삭제 스택의 size 가3이된다
  		
  		//스택 pop -> size 감소
  		size = stack.size();
  		System.out.println("pop 이후 size: "+size); //3
  		
  		//1 2 3
  		stack.pop(); // 스택1 2
  
  		System.out.println(stack.pop());//스택 1 // 출력2
  		
  		System.out.println("pop 이후 size:"+stack.size()); // 시험암시 위에서 아래로 흐름 ㄱ
		//(data2)2
  		//pop이후 size: 1
  		
  		//.peek()
  		//마지막 값( 다음 나올 데이터값 확인)
  		int data3 = stack.peek(); //1
  		System.out.println(data3);
  		System.out.println("peek 이후 size:"+stack.size()); //1
  		
  		//스택1
  		//.contains() -> 매개변수로 들어간 요소가 있는지 확인 -> 있으면 true 없으면 false
  		boolean iscontain = stack.contains(1);
  		System.out.println("contains: "+iscontain);
  		
  		//하나 남아있던것 비우는 전체삭제 기능
  		//.clear() //스택 초기화(전체삭제)
  		stack.clear();
  		System.out.println("clear: "+stack.size());
  		
  		//.isEmpty() -> 비어있는지 확인 -> 비어있으면 true, 요소(데이터)있므녀 flase
  		//stack.push(1); <- 이거 넣으면 false
  		boolean isempty = stack.empty();
  		System.out.println("empty() : "+isempty); //내용이 없으니까 true
  		
  		//반복해서 출력 - Quiz
  		
		//불편 제네릭이 낫다
		Stack stack2 = new Stack();
		stack2.push(1);
		int num = (int)stack2.pop(); //제너릭을 쓰지않으면 하나하나 써줘야한다
	}

	static void Stack02() {
		Stack<String> stack = new Stack<String>();
		stack.push("a");//a
		stack.pop();
		stack.push("b");
		stack.push("c");
		stack.clear();
		stack.push("d");
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		//출력 결과 값 쓰시오
		//시험문제
	}
}
