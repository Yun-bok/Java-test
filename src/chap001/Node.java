package chap001;

public class Node {
	//�ʵ�
	private int value; //��
	private Node next;  //������
	
	//������
	Node(int value, Node next){
		this.value = value;
		this.next = next;
	}
	
	public int getValue() {
		return this.value;
	}

}
