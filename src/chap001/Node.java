package chap001;

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
