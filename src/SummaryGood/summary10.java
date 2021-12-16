package SummaryGood;

import java.util.Scanner;

public class summary10 {
	public static void main(String[] args) {
		//예외처리 제일중요 뻑난다 에러난다 그런거라고 한다
		//10장 예외처리
		//Exception =예외 그리고 최상위 클래스다
		//자바는 뼈대를 하는과정이고 나중엔 구현하기 더좋은
		//c++같은 언어도 배워보자
		
		//오류의 종류 - 에러,예외
		//하드웨어 -> 에러 ->프로그램 종료
		//사람실수 -> 예외 -> 프로그램종료
		//		 -> 예외처리-> 종료되지않음
		
		//예외에 대해 다양한 클래스 제공 -> 너무 다양해서 외우긴 무리
		//****최상위클래스 Exception
		
		
		int[] int_arr = new int[3];
		//예외 처리 방법
		
		try {//예외가 발생할수 있는 코드블럭
			int_arr[2] = 10;
		}catch(Exception e) {//예외가 발생했을때 처
			//일반적으로 사용
			e.toString(); //예외의 내용
			e.printStackTrace(); //예외의 위치를 볼때
			System.out.println("예외발생");
		}finally {// 파이널 - 항상 실행한다(예외가 발생하든 말든), 작성을 안할수있
			System.out.println("finally");
		}
		
		System.out.println("프로그램 다음실행");
		int[] intarr = new int[3];
		String str = null;
		//예외처리
		try { //예외가 발생할 수 있는코드
			//intarr[4] = 10;
			//System.out.println("예외발생 밑에 코드");
			str.toString();
		
		}catch(ArrayIndexOutOfBoundsException e) {//catch 한번 잡히면 아래 catch 실행 안한다
			//ArrayIndexOutOfBoundsException 발생하면 실행
			System.out.println("ArrayIndexOutOfBoundsException ");
		}catch(NullPointerException e) {
			//NullPointerException 발생하면 실행
			System.out.println("NullPointerException");
		}catch(Exception e) {
			//위에 두개의 예외를 제외한 모든 예외가 실행
			System.out.println("위에 두개의 예외를 제외한 모든 예외가 실행");
		}finally {
			
		}
		//개발자가 의도적으로 예외처리를 해줘야하는 메서드를 만듬
		try {
			print();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	static void print() throws Exception{
		System.out.println("1~10의 정수를 입력하세요");
		Scanner input = new Scanner(System.in);
		
		int num = Integer.parseInt(input.nextLine());
		
		if(num>=1&&num<=10) {
			System.out.println("정상작동");
		}else {
			System.out.println("개발자 의도 빗나감");
			throw new Exception();
		}
	}
}
