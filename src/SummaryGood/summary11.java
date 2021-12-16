package SummaryGood;

public class summary11 {
//11장 기본 API 클래스 -> 제공
//기본 API -> 자바 제공
//일반적인 API -> 사용자(개발자) API -> 개발자가 개발자한테 사용하라고 제공

	
	//내부적으로 만들어진 코드를 
	//사용방법을 알려주고 쓰는거
	//자바에서 제공해주는 다양한 클래스들을 사용해보고 익히는
	
	//Object 클래스(최상위)
	//euqals()
	//남이만든거 -> 제공되는 사용법 익히는 ->나중에 검색할수 있을정도로

	
	//12장 멀티스레드
	//기본 메인 스레드 -> 프로그램 작동
	for(int i = 0; i<Integer.MAX_VALUE; i++) {
		System.out.println(i+" ");
	}
	System.out.println("동시작업");
	//프로그램은 위에서부터 아래로 실행
	//실행을 여러군데에서 사용자가 동시에 하고싶은때
	
	//13장 제네릭
	//타입
	int a = 3;
	double b = 3.14;
	int[] c = {1,2};
	//14장 람다식 -> 이름없는 함수
Runnable runnable = ()->{
		for(int i=0; i<5; i++) {
			
		
	

//static <A,B> A test(A a, B b) {
//	return true;
//}
//}
//}

