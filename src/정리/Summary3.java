package 정리;

public class Summary3 {

	public static void main(String[] args) {
		//참조타입 클래스, 배열, 인터페이스, 열거
		int num = 3; //num -> 값
		String str = "문자열"; //str -> 어딘가(힙)에 생긴 String 객체를 가리키는 주소값
		String str2 = "문자열";
		String str3 = new String("문자열");
		//참조타입 비교는 주소값이 같은 객체인지 확인
		boolean result = str ==str2; // == ->true , false
		boolean result2 = str == str3;
		System.out.println(result);
		System.out.println(result2);
		//=>equals()로 비교
		boolean result3 = str.equals(str3);
		System.out.println(result3);
		
		//배열
		// 어떤타입의 저장공간을 여러개 가지는 것
		//타입[]
		//      (타입 값)   (타입 값)   (타입 값)   (타입 값) 
		//index    0          1          2         3
		//배열선언
		//타입[] 변수이름;
		int[] int_arr;
		//배열초기화 및 값 저장
		//int[] int_arr = new int[3];
		//int_arr[0] = 1;
		//int_arr[1] = 2;
		//int_arr[2] = 3;
		//int[] int_arr3 = new int[] {1,2,3}
		//int[] int_arr4 = int[] {1,2,3}
		
		//배열의 값 사용
		//for(int num : int_arr2) {
		//	System.out.println(num2);
		//}
		//for(int i=0; i<int_arr2.length; i++) {
		//	System.out.println(int_arr2[i]);
		//}
		
		
		//이차원 배열 -> 행과 열 ->배열을 여러개 가지는 배열이다
		//int[] int_arr = {1,2,3};
		//  	 1     2     3
		//	    int   int   int    int저장할곳이 3개다~
		//    arr[0] arr[1] arr[2]
		//int[] arr2 = {4,5};
		//앞[]행 , 뒤[] 열
		//뒤[] 배열이 앞[] 숫자만 있다.
		//int[][] arr3 = new int[2][];
		//arr3[0] = arr;   // 1  2  3
		//arr3[1] = arr2;  // 4  5
		
		//int[] arr = {1, 2, 3}
		//int[] arr2 = {4, 5}
		//int[] arr3 = new int[2][];
		//{1, 2, 3}
		//{4, 5}
		//int[][] arr4 = {{ 1, 2, 3},{4, 5, 6}};
		
		//이차원배열의 length -> 행의 갯수 의미
		//arr3.length
		//for(int x = 0; x<arr3.length; x++) {
			//이차원배열[idx].length -> idx번째 행의 열갯수
			//for(int y=0; y<arr3[x].length;y++) {
		//		(System.out.println(  "arr3[x+","+y+"]="+arr[x][y]; );
		//	
		//}
		
		//이차원 배열 예제
		//삼각형 별찍기
		//      *
		//     **
		//    ***
		//   ****
		int num5 = 4;
		char[][] char_arr = new char[num5][num5];
		//행
		for(int x=0; x<char_arr.length;x++) {
			//각 행에 대한 열의 길이
			for(int y=0; y<char_arr.length;y++) {
				// x 행 y 열
				// 0,0   0,1   0,2   0,3
				// 1,0   1,1   1,2   1,3
				// 2,0   2,1   2,2   2,3
				// 3,0   3,1   3,2   3,3
				//****
				//****
				//****
				//****
				//                                         num5/2-i
				//   *   0,0  0,1  0,2   0~2까지 깎고   num5 2-0
				//  **   1,0  1,1   	 0~1		  num5 2-1
				// ***   2,0   	 		 0~0          num5 2-0
				//****
				
				char_arr[x][y] = '*';
			}
			for(int y=0; y<=num5/2-x;y++) {
				char_arr[x][y] = '*';
			}
		}
		
		for(char[] carr:char_arr) {
			for(char c_val: carr) {
				System.out.println(c_val);
			}
			System.out.println();
		}
		//String

	}

}
