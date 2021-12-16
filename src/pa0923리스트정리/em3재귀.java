package pa0923리스트정리;

public class em3재귀 {
	public static void main(String[] args) {
		//재귀 (재귀 메서드)
		//문제를 해결하기 위해 자신의 알고리즘(메서드)을 이용하여 해결하는 것
		//**규칙 찾기가 중요 -> 알고리즘 테스트전에 여러번 문제를 이해해보고 풀어봐야 익숙해짐
		//***** 탈출 조건 -> 재귀는 문제를 해결하기 위해서 자기자신(메서드) 호출
		//-> 무한 호출 -> 스택 오버플로우 발생
		
		//print();
		
		//일반적인 알고리즘 문제
		//팩토리얼, 피보나치 수열, 하노이 타워 , 퀵정렬 알고리즘, 이진 탐색 트리 등
		int result = sum(10);
		System.out.println(result);
		
		int result2 = mul(5);
		System.out.println(result2);
	}
	
	//1~n까지의 숫자를 더하시오
	//n~5
	//1,  2,  3,  4,  5
	//1, n-3, n-2, n-1 , n
	//n n-1 n-2 n-3 ......1
	//sum(5) => ???
	//sum(10)
	
	public static int sum(int n) {
		if(n==1) {
			return n;
		}
		return n + sum(n-1);
		//n+ sum (n-1)  // 5 + sum(4)
		//n +           // 5 + 4 + sum(3)
		                //5 + 4 +   3 + sum(2)
					    //5 + 4 + 3 +   2+ sum(1)
					    //5 + 4 + 3 +   2+   1 +sum(0)
	}
	
	//1~n 까지의 곱
	//n*n-1*n-2*n-3 ,,,,, 1
	//mul(3)
	public static mul(int n) {
		if(n==1) {
			return n;
		}
		return n*mul (n-1);
		//n* n-1 * mul(n-2)
		//n* n-1 * n-2 *mul(n-3),,,,,, n-? =1
		//3 * 2 * 1
	}
	
	static void print() {
		System.out.println("출력");
		print();
		//탈출조건이 없어서 무한반복으로 -> 오류 스택오버플로우
	}

}
