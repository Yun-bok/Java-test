package chap003;

import java.util.LinkedList;

public class ex01 {
public static void main(String[] args) {
	//연결리스트
	//노드 -> 데이터 담거나 표현하는 기본단위
	//연결리스트의 노드 구조
	//데이터 영역 - 값, 포인터 영역 - 연결된 다음 노드 가르키는 영역(주소)
	
	//장점
	//삽입, 삭제가 빠름 -> 포인트 노드가 있어서
	
	//단점
	//검색이 느림 -> 특정 인덱스로 접근 불가 -> 순차적 접근
	
	//종류 - 단일련결 리스트, 이중연결리스트, 원형 연결 리스트
	// 단일연결 -> 포인트 노드 한개(다음꺼)
	// 이중연결 -> 포인트 노드 두개(이전, 다음)
	// 원형연결 -> 포인트가 끝과 시작이 연결-> 마지막 노드가 처음의 주소를 가르킨다.
	
	//배열의 단점 보완한 구조 (이론) -> 직접구현
	//직접 구현하는 방법이 어렵기도하고 많으니깐
	//-> 자바에서 제공하는 구조라도 알고있자
	//자바에서 만들어서 제공
	//LinkedList_ex01();
	LinkedList_ex02();
}

	
static void LinkedList_ex01() {
	//자바에서 제공해주는 연결리스트
	// 자바에서 제공 해준다는것은 -> import가 필요하다
	//->Ctrl+Shift+O , 마우스로 대서 import, 직접쓰는 방법
	LinkedList list = new LinkedList(); 
	//자바 버전이 낮을때 사용했다, | 저장타입이 object 타입 -> 자바 최상위 클래스
	//단점 - 사용할때 강제적으로 타입을 변환해줘야하는 번거로움
	//장점 - 다양한 타입을 저장(일반적으로 같은타입을 저장하는 경우가 많음)
	
	//값 저장
	list.add(1);   //1			 //마지막노드에 저장
	list.add(2);   //1 2              1에다가 2를 가리키는 포인트영역이 있을것
	list.add(3);   //1 2 3                 동일
	list.add(4);   //1 2 3 4
	//매개변수 2 - 첫번째 idx 저장될 위치순번, 두번째 값
	list.add(1, 5);//1 2 3 4
				   // 5   시험** 안에 뭐가들었을지 등
	
	int sum = 0;
	//list.size() - 현재 리스트의 요소갯수 반환
	for(int i = 0; i< list.size(); i++) { // 현재 list 5개요소 5를 반환 i 0~4
		int num = (int)list.get(i); // .get(idx) idx번째 요소 반환 //head에서 시작해서 순차적으로 찾아가는 로직이 있을것 
		System.out.println(num); // 반복을돌리며 넘을 출력해줄것
		sum += num;
		
	}
	System.out.println(sum);
}
//자바에서 제공되는 연결리스트의 옛방식 하지만 지금도사용가능
//static void LinkedList_ex01()

//자바에서 제공되는 연결리스트의 최근방식 (제너릭)
static void LinkedList_ex02() {
	//<제너릭타입> -> 참조타입 들어갈수있다. -> 리스트에 저장될수 있는 타입은 <>안에있는 제너릭 타입과 일치
	LinkedList<Integer> list = new LinkedList<Integer>();
	//int타입을 저장하는 친구다 = Integer위치에 참조타입은 다 들어갈수있다
	//기본타입 -> 참조타입x -> 기본타입에 대한 클래스 -> 일반적으로 기본타입 첫글자 대문자
	//int -> Integer 클래스 

	list.add(0);   //0
	list.add(1);   //0 1
	list.add(2);   //0 1 2
	list.add(3);   //0 1 2 3
	list.add(4);   //0 1 2 3 4 
	
	//매개변수idx에 해당하는 요소삭제
	list.remove(2); // 0 1 3 4
	int sum = 0;
	for(int i=0; i<list.size(); i++) {
		int num = list.get(i);
		sum += num;
		System.out.println(num);
	}
	System.out.println(sum);
	//구글링 마니
}
}
