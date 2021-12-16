package factorial;

public class Quiz {

	//재귀
	//문제를 해결하기위해 자기자신의 알고리즘(메서드)을 이용해서 해결
	//**규칙찾기 *****탈출방법
	public static void main(String[] args) {
		//q1
		int result = factorial(5);
		System.out.println(result);
		
		//q2
		System.out.println(power(2,5));
		System.out.println(result2);
		
		//q3
		for(int i=0; i<10; i++) {
			int result3 = fibonacci(i+1); //i+1 -> i 0~9 1~10
			System.out.print(result3+ " ");
		}

	}
	// q1) 팩토리얼 재귀  재귀함수이름(factorial)
	 //* 팩토리얼
	 //* 5!   => 5*4*3*2*1
	 //* 8!   => 8*7*6*5*4*3*2*1
	 //  n    => n*n-1*n-2 .......*1
	static int factorial(int n) {
		//탈출조건
		if(n<=1) {
			return n;
		}
		return n*factorial(n-1);//5넣을시
		//5//n* factorial(n-1)
		//4//	n-1* factorial(n-2) //n의 값이 입력받은 친구로 바뀜
		//3//			n-2*factorial(n-3)
		//2//             n-3*factorial(n-4)
		//n*n-1*n-2*n-3,,,,,*factorial(1) 탈출조건
		//
		//5*4*3*2*1
	}
	//q2) 두 수 x,y를 입력받아 x의 y거듭제곱(승)을 구하시오(재귀) power
	 //* x 2 , y 5
	 //* 2*2*2*2*2 => 2의 5승
	 //* x4, y 5, => 4*4*4*4*4 => 4의 5승 
	//함수가 안에서 다시호출이된다
	//x=2, y=5 => 2*2*2*2*2*
	//int result = power(2,5)
	//x, y => x*x*x*x*x*,,,,,,=>y개
	//탈출조건에 만족하면 탈출하게끔
	//조건에 점점가까워지면서 반복할 증감식이 있어야한다
	
	//x는 곱할변수 y는 곱할수
	static int power(int x , int y) {
		if(y<=1) {
			return x;//y가1일땐 마지막 x 를 반환해라
			//뭘까 이게 개어렵노 ㅅㅂ
		}
		return x*power(x,y-1);
		//2*power(2,5)
		//	2*power(2,4)
		//		2*power(2,3)
		//			2*power(2,2) 
		// 				2*      power(2,1)
		//2  *  2  *  2  *  2  *  2  *power(2,0)
		//눈으로 봤을때 저렇게 나온다
		//2를5번 곱해줘야했는데 y가 점점 줄어듬
	}
//	플러스 문제
//	 * q3) 피보나치 수열 -> 앞 두개의 수의 합이 다음숫자가 되는것
//	 * ex)1  1  이면 세번째는 2 이후는 더한 3 이후 5 이후 8 이후 
//	 * 8 13 21 34 55   (fibonacci)
//    1 1 2 3 5 8 13 21 34 55
//	 * fibonacci(5) => 5
//	 * fibonacci(7) => 13
//	 * fibonacci(8) => 21 이런식으로 나옴
//	 * 반복문 1~10번째까지의 수열 출력 과제는 2번까지해도 되지만 3까지 해도좋음

	
	//fibonacci(5)  => 5
	//->피보나치 수열의 5번째 자리의 숫자
	// -> 5번째 자리의 숫자 ==== 3번째 숫자 + 4번째 숫자 
	// -> 4번째          ==== 		3번째 숫자 + 2번째 숫자
	// -> 3번째          ==== 2번쨰 숫자 + 첫번째 숫자
	// -> 2번째          ==== 첫번째 숫자
	//5번째 자리의 숫자 ====  첫번째 숫자 + 첫번째 숫자 +
	//					  첫번째 숫자 + 첫번째 숫자 + 첫번째 숫자
	
	//5
	//fibonacci(5)  -> 5자리
	//fibonacci(5) = fibonacci(4) + fibonacci(3)
	//fibonacci(4) = fibonacci(3) + fibonacci(2)
	//fibonacci(3) = fibonacci(2) + fibonacci(1)
	//fibonacci(2) = fibonacci(1) //1
	//fibonacci(1) = 1
	//				1 1 2 3 5 (재귀) 알고리즘시험
	static int fibonacci(int n) { //몇번째 자리의 숫자를 구하는 친구
		if(n<=1) {
			return n;
		}
		return fibonacci(n-1) + fibonacci(n-2);
		
		
		
	}
}
