package 정리;

import java.util.Scanner;

public class Summary4 {

	public static void main(String[] args) {
		//클래스 구조
		//new -> 힙메모리에 클래스 객체를 생성하고 주소값은 반환
		Cal cal = new Cal(Math.PI);
		Cal cal2 = new Cal(3.14);
		
		System.out.println(cal.pi);
		System.out.println(cal2.pi);
		//입력받을때 사용하는 클래스
		Scanner input = new Scanner(System.in);
		
		double result2 = Cal.CircleArea(5);
		System.out.println(result2);
		while(true) {
			//Integer.parseInt -> 문자열을 정수로 변환
			int x = Integer.parseInt(input.nextLine());
			String Operator = input.nextLine();
			int y = Integer.parseInt(input.nextLine());
			//cal 객체에 있는 Operation( ) -> 반환값
			int result = cal.Operation(x, Operator, y);
			if(result == Integer.MIN_VALUE) {
				System.out.println("연산자 오류 : 다시 입력해주세요");
				break;
			}
			System.out.println(result);
			
			
			//클래스 장점
			//중복코드 줄어듬 - > 개발 속도는 빨라짐
			//가독성 좋아짐 ->
		}
		
	}

}

//클래스    - 공통된 속성이나 기능을 묶어놓은 친구
//필드 -> 속성,값,정보,변수
//생성자 -> 필드에 선언한 변수들 값저장(초기화), 클래스 객체를 만들때 사용되는 기능 ->new 호출
//메서드 -> 기능요소 -> 동적

//접근제한자
//private, protected,default,public
//private - 외부에 비공개 
//protected -> 외부에 상속받은 클래스 공개
//default ->같은패키지
//public -> 전체공개

//클래스 구조
//[접근제한자] class 클래스이름{
//		클래스내용
//}
class Cal{
	//필드 - 클래스 멤버변수,값, 속성
	//[접근제한자] 타입 변수이름; //선언만 OK, 초기화까지 해줘도 OK
	static double pi2 = Math.PI;
	double pi;
	//생성자 - 생성자 구현을 안하면 기본생성자 자동생성, -> 구현되있으면 기본생성자 X
	//[접근제한자]클래스이름(){
	//}
	Cal(double pi){ // 매개변수 한개인 생성자 -> 기본생성자는 생성  X
		//this - 클래스 객체를 의미
		// -> 클래스 내부에 있는 멤버변수나 생성자,메서드를 호출할때 사용(클래스 내부)
		this.pi = pi;
	}
	
	//메서드 - 기능, 동작
	//[접근제한자] 반환타입 메서드이름( 매개변수 ){
	//}
	//매개변수 - 메서드 블록({ }) 사용할 데이터를 외부에서 받아오기 위해서 사용
	//매개변수의 구조 - 타입 변수이름
	//반환타입 - void ->반환값이 없을때 사용 -> return; 메서드 종료
	// 		 - 타입  -> 같은 타입의 값을 반환해준다. -> return 값; 메서드 종료
	//전체공개 정수와 문자열과 정수를 입력받아 정수를 반환하는 Operation 메서드
	public int Operation(int x, String Operator, int y) {
		if(Operator.equals("+")) {
			return x+y;
		}else if(Operator.equals("-")) {
			return x-y;
		}else if(Operator.equals("*")) {
			return x*y;
		}else if(Operator.equals("/")) {
			return x/y;
		}else if(Operator.equals("%")) {// %
			return x%y;
		}else {
			return Integer.MIN_VALUE;
		}
		
		
	}
	public static double CircleArea(int r) {
		return r*r*pi2;
	}
}