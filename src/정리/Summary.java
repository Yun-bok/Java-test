package 정리;

public class Summary {

	public static void main(String[] args) {
		//총정리
		// 변수 - 기본 타입(byte, char, short, int ,long, float, double)
		byte byte_val = 1;
		//문자 '' - 빈문자 X, 아스키코드(인터넷서칭), 특수문자(인터넷서칭)
		char char_val =' ';
		//정수를 저장 
		int num = 3;
		short num2 = 2; //int타입인데 길이가 짧은거 - 표현범위를 말한것
		long num3 = 1;  //int타입인데 길이가 긴거 - 표현범위를 말한것
		
		//실수를 저장
		float float_val = 3.14f; // f
		double float_val2 = 3.14; // 실수 기본타입(직접 3.14), d생략
		
		//리터럴 (직접 값을 의미하는)
		//3  4  'a' 3.14
		
		//논리타입 - boolean
		boolean bool_val = true; //값이 true 참 , false 거짓만 가능
		
		//변수의 선언
		//타입 변수이름;
		int num4;
		
		//초기화 - 변수에 최초에 값을 저장하는것
		num4 = 10; 
		//선언과 동시에 초기화가 가능
		int num5 = 10;
		int num6 = 1,num7; // num6=1 , num7 = 0(기본값or 쓰레기값)
		
		//변수 사용
		int result = num5 + num6; // result = 10 + 1;
		
		//프로그래밍
		//흐름(순서)  위에서 아래로  {		에서  }
		//변수는 선언된 블록{ } 	안에서만 사용가능
		//흐름을 바꾸는 것들
		//메서드랑 제어문에 따른 흐름 따라갈 수 있어야 한다.
		//프로그램 시작은 main 함수에서 
		//프로그램 시작은 Ctrl + F11 디버깅 하지않고 시작
		
		//디버깅
		//왼쪽 파란 부분에 브레이크포인트를 잡는다 (더블클릭or우클릭)
		//F11 ->디버깅 시작
		//Step Into(F5) - 메서드 안으로 진입
		//Step Over(F6) - 메서드를 실행하고 다음줄로
		//Resum3(F8)    - 다음 브레이크 포인트까지 실행
		//디버깅 이후에(종료) 우측 상단에 java 클릭
		
		//타입 변환 - 자동(묵시적) 타입변환, 강제(명시적) 타입 변환
		//자동 타입 변환
		//일반적으로 사용되는 메모리가 작은 타입에서 -> 큰타입으로 자동 타입변환 가능
		//byte(1) <short(2) < int(4) < long(8) <float(4) < double(8)
		//왼쪽에서 오른쪽으로
		float float_val3 = 100L; // 자동 타입변환 long->float로 , 100L에서 L이 =long
		//long long_val =3.14f;
		
		//강제(명시적) 타입변환
		//오른쪽에서 왼쪽으로 변환할때
		long long_val2 = (long)3.14; //(타입) 강제적으로(명시적) 타입변환

		//연산자 -> 피연산자 개수 -> 단항, 이항, 삼항
		//증감연산자(++,--)
		//변수의 값을 1증가(++) or 1감소(--)
		//위치 앞이면 다른연산보다 먼저, 뒤이면 다른 연산보다 나중에
		int x = 100;
		int y = 100;
		int result2;
		
		//참조타입(클래스 , 배열, 인터페이스, 열거)
	}

}
