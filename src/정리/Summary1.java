package 정리;

public class Summary1 {

	public static void main(String[] args) {
		// 연산자 -> 피연산자 개수 -> 단항, 이항, 삼항
		// 증감연산자(++,--)
		// 변수의 값을 1증가(++) or 1감소(--)
		// 위치 앞이면 다른연산보다 먼저, 뒤이면 다른 연산보다 나중에
		int x = 100;
		int y = 100;
		int result2 = (--x + y++) + x--;
		//99 + 100 -> 199 + x--;
		//x = 99, y 101;
		//199+ x--;
		//x = 98, y 101;
		System.out.println(x);
		System.out.println(y);
		System.out.println(result2);
		//x++; ++x; -> 큰차이 없다 -> 다른 연산이 없어서
		
		//논리 부정(!)
		//true -> false , false -> true  이런식으로 반전시켜준다
		boolean istrue = true;
		System.out.println("논리부정");
		System.out.println(!(istrue));  
		
		//이항 연산자 - 피연산자 2개
		//산술, 문자열 연결, 대입 연산, 비교, 논리 // 비트 논리 , 비트 이동
		//산술(사칙연산 + 나머지 연산(%))
		//곱셈 * , 나눗셈 / 
		//정수/정수 -> 정수가(몫)
		
		//나머지연산 -> 나누고 난 다음 나누어 떨어지지않고 남는 값
		//5%3    -> 2
		
		//대입 연산(=, +=, - , ....)
		//단순 대입 = 
		//우측의 값을 좌측에 저장
		// int num = 3; num에 3을 저장
		
		// +=, -= , *=, /=   ((1)이항연산자)= 
		//좌측에 있는 값에 우측의 값을 (1) 연산후 좌측에 저장
		// num += 4; // num = num + 4
		// num *= 4; // num = num * 4
		
		//비교 연산자( <작다, >크다, <=작거나 같다 , >=크거나 같다)
		//좌측이 우측 표현한거
		// 연산의 결과값이 논리타입(true, false)
		//int num = 3;
		//num <= 3; true
		//true;
		
		//논리 연산자(&&, ||, ^ , !)
		// &&   -> 좌측 참, 우측 참 -> 참이다
		// ||  -> 좌측 or 우측 중 하나라도 참 -> 참이다 true
		// int num = 3, num2 = 4;
		// num <= 3 && num2 <= 3;
		//true     &&    false; --> false
		// num <= 3 || num2 <= 3;
        //true      ||   false; --> true
		// !(num <= 3 || num2 <=3);
		// !(  true   || false);
		// !(  true  ); ----> false 반전
		//논리연산자와 비교연산자는 중요하다 문제풀며 익숙해지자 기본개념 꼭 숙지
		
		//삼항연산자 - 피연산자 3
		// 조건식? (값 or 연산식) : (값 or 연산식);
		// 조건식이 참 앞에 값 반환, 거짓이면 뒤에 값 반환
		// int hour = 18;
		// String result = (hour >= 18)? "퇴근" : "업무중";
		//(hour >= 18) -> true -> result = "퇴근";
		//(hour >= 18) -> false -> result = "업무중";

	}

}
