package 정리;

public class Summary2 {

	public static void main(String[] args) {
		/*제어문
		 * 조건문, 반복문
		 * 조건문 - if, switch
		 * 
		 * 조건식-> true -> 1실행코드 실행하고 나머진 무시(실행안함)
		 * -> false -> 1실행코드 실행 X -> 조건식2 있으면 체크
		 * 
		 * 조건식2 -> true ->2실행코드 실행하고 끝남(나머지 실행 안함)
		 * -> false -> 2실행코드 실행 X -> 나머지가 있다면 (else) -> 3실행코드 실행
		 * 
		 * if(조건식){
		 * 		1 실행코드
		 * }else if(조건식2){ //필요에 따라 있을수도 없을수도
		 * 		2 실행코드
		 * }else{			//필요에 따라 있을수도 없을수도
		 * 		3 실행코드
		 * }
		 * 
		 * int num = 3;
		 * if(num==3) { // ==같다, !=같지않다 num==3 -> true
		 * System.out.println("num은 3이다"); 
		 * }
		 * 
		 * num =1;
		 * if(num==3) { // ==같다, !=같지않다 num==3 -> true
		 * System.out.println("num은 3이다"); 
		 * }else if(num==2) {
		 * System.out.println("num은 2이다");
		 * }else{
		 * System.out.println("나머지 실행");
		 * 
		 *변수에 값에 따라 실행코드가 달라지는 문법
		 *변수 값1일때 -> 1실행코드
		 *변수 값2일때 -> 2실행코드
		 *변수가 위에 같은값이 없을때는 -> default 3실행코드 실행
		 *break; 없으면 밑에 실행코드도 실행됨
		 *
		 * switch(변수) {
		 * case 값: 1실행코드; break;
		 * case 값: 2실행코드; break;
		 * default: 3실행코드; break;
		 * }
		 * num = 2;
		 * switch(num) {
		 * case 1: System.out.println("1"); break;
		 * case 2: System.out.println("2"); break;
		 * case 3: System.out.println("3"); break; //스위치는 브레이크 있고 없고 중요
		 * default:System.out.println("나머지");
		 * }
		 * 
		 * 반복문 for, while, do while
		 * for(초기값 ; 조건식 ; 증감식){
		 * 			반복실행 코드
		 * }
		 * 초기값 -> 어디부터 시작
		 * 조건식 -> 참이면 -> 반복코드 실행 -> 증감식 변수 값 변경
		 * -> 조건식 -> 참이면 -> 반복코드실행 -> 증감식 변수값 변경
		 * -> 조건식 -> 거짓이면 -> 반복끝(더이상 실행X)
		 * 조건식 -> 어디까지 반복할지
		 * 증감식 -> 어느 주기
		 * 시작 i 0 -> 9	 //초기값, 조건 -> 시작과 끝
		 * 증감식 -> 주기    0 ~9 	 1증가 9번반복
		 * i = i+2	0 2 4 8    4번 반복
		 * for(int i = 0; i<10; i= i+2) {
		 * 	System.out.print(i+"홀수");
		 *  System.out.print(i+1)+"짝수");
		 * if(i%2==0) {
		 * System.out.println(i+"짝수");
		 * }else {
		 * System.out.println(i+"홀수");
		 * }
		 * 
		 * 
		 * 
		 * while - 일반적으로 위에 변수 선언, 증감식 실행코드
		 *조건식이 참 -> 실행코드 실행 -> 증감식 -> 조건식 -> 참 ->실행코드
		 *증감식 -> 조건식 -> 거짓false -> 반복끝
		 * while(조건식) {
		 * 		실행코드
		 * }
		 * System.out.print("while");
		 * int cnt = 5;
		 * while(cnt>0) {
		 * 		System.out.println(cnt);
		 * 		cnt--;
		 * }
		 * 
		 * 제어할문이 있어야 반복문을 사용
		 * boolean isrun = true;
		 * while(isrun) {
		 * 		System.out.println("반복");
		 * 		cnt++;
		 * 		if(cnt==10) {
		 * 			break;
		 * }
		 * }
		 * 
		 *  
		 * do while -> while 거의비슷
		 * 차이점 -> 실행코드가 무조선 실행
		 * do{
		 * 		실행코드
		 * }while(조건식);
		 * 
		 * do{
		 * 		System.out.println("do블록 실행");
		 * }while(false);
		 * }
		 */

	}

}
