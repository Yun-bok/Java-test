package chap001;

public class SinglyLinkedList { //page 52 //page 56~58
	//필드
	private Node head; //시작 노드
	
	SinglyLinkedList() {
		this.head = null;
	}
	
	SinglyLinkedList(int value) {
		this.head = new Node(value,null);
		
	}
	public class Node {
		//필드
		private int value; //값
		private Node next;  //포인터
		
		//생성자
		Node(int value, Node next){
			this.value = value;
			this.next = next;
		}
		
		public int getValue() {
			return this.value;
		}

	}

	
	
	//메서드
	public Node getHead() { //시작노드 반환
		return this.head;
	}
	//노드 추가기능
	public void append(int value) {
		//시작 노드 == null -> 시작노드 객체 생성 X
		if(this.head == null) {
			this.head = new Node(value,null);
		}
		
		//while의 조건을 거짓으로 바꾸는 변수정도?
		//pointer -> 시작 노드를 갖고있을것
		Node pointer = this.head;
		//마지막 노드를 검색하기 위한 반복문
		while(pointer.next!=null) {//시작노드 다음노드 ->null 아니면
			pointer = pointer.next; //포인트 -> 다음 노드
		}
		//pointer 마지막에 노드
		//마지막노드(int value, Node next)
		//마지막노드 포인터 영역에 다음 노드객체의 주소값
		
		pointer.next = new Node(value,null);
	}
	
	//전체 조회
	public void printAll() {
		//시작 노드
		Node pointer = this.head; //pointer-> Node클래스 -> value 값, next 다음 노드 객체
		StringBuilder builder = new StringBuilder();
		String str = "";
		while(pointer.next!=null) {
			str += pointer.getValue(); //append 이어붙인데
			str += " -->";
			//첫 Node Value 1 next node2
			//node2 value 2 next null
			pointer = pointer.next;
		}
		
		str += pointer.getValue();
		System.out.println(str);
	}
	//삭제
	public void delete(int value) {
		//정수 입력받아서 어떠한 기능
		Node pointer = this.head; //pointer -> 시작 노드
		
		//입력받은 값이 시작노드의 값과 같을때
		if(pointer.getValue()==value) {//시작노드 value -> 입력받은 값이랑 같을때 실행
			Node removeNode = this.head; 	//removeNode -> 시작노드 저장
			this.head = this.head.next;	//시작노드 -> 다음 노드 저장
			
			removeNode = null;	// 시작노드를 저장했던 임시공간 -> null ->가비지 컬렉터가 지워주..
			return;//메서드 종료
		}
		//입력받은 값이 시작노드의 값과 같지 않다
		
		//시작노드 빈공간 temp 임시저장
		Node temp = pointer;
		
		
		//while 첫번째 조건
		//입력받은값 2
		//[ 1, null ] -> 객체는 하나뿐인데 값이 같지 않을때 실행X
		
		//while 두번째 조건
		//pointer 값이 value 같지 않다는거
		//[1번,2번객체] [ 2, 3번객체] [3, 4번 객체]
		
		//pointer(처음반복 -> 시작노드)가 객체가 있고 pointer 값(value) 입력받은 값과 같지 않을때
		
		//포인터(처음객체~마지막객체) 마지막객체까지 반복되거나 , 입력받은 값하고 같은 값이 있을때까지 반복
		while(pointer !=null && pointer.getValue() != value) {
			temp = pointer; //
			pointer = pointer.next; // 포인터 (현재 객체) 다음객체
		}
		
		//마지막 객체
		if(pointer.next == null) {
			temp.next = null;
		}else {// 같은값
			temp.next = pointer.next;
		}
		pointer = null;
	}
	
	

}
