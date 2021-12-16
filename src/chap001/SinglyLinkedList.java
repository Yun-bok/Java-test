package chap001;

public class SinglyLinkedList { //page 52 //page 56~58
	//�ʵ�
	private Node head; //���� ���
	
	SinglyLinkedList() {
		this.head = null;
	}
	
	SinglyLinkedList(int value) {
		this.head = new Node(value,null);
		
	}
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

	
	
	//�޼���
	public Node getHead() { //���۳�� ��ȯ
		return this.head;
	}
	//��� �߰����
	public void append(int value) {
		//���� ��� == null -> ���۳�� ��ü ���� X
		if(this.head == null) {
			this.head = new Node(value,null);
		}
		
		//while�� ������ �������� �ٲٴ� ��������?
		//pointer -> ���� ��带 ����������
		Node pointer = this.head;
		//������ ��带 �˻��ϱ� ���� �ݺ���
		while(pointer.next!=null) {//���۳�� ������� ->null �ƴϸ�
			pointer = pointer.next; //����Ʈ -> ���� ���
		}
		//pointer �������� ���
		//���������(int value, Node next)
		//��������� ������ ������ ���� ��尴ü�� �ּҰ�
		
		pointer.next = new Node(value,null);
	}
	
	//��ü ��ȸ
	public void printAll() {
		//���� ���
		Node pointer = this.head; //pointer-> NodeŬ���� -> value ��, next ���� ��� ��ü
		StringBuilder builder = new StringBuilder();
		String str = "";
		while(pointer.next!=null) {
			str += pointer.getValue(); //append �̾���ε�
			str += " -->";
			//ù Node Value 1 next node2
			//node2 value 2 next null
			pointer = pointer.next;
		}
		
		str += pointer.getValue();
		System.out.println(str);
	}
	//����
	public void delete(int value) {
		//���� �Է¹޾Ƽ� ��� ���
		Node pointer = this.head; //pointer -> ���� ���
		
		//�Է¹��� ���� ���۳���� ���� ������
		if(pointer.getValue()==value) {//���۳�� value -> �Է¹��� ���̶� ������ ����
			Node removeNode = this.head; 	//removeNode -> ���۳�� ����
			this.head = this.head.next;	//���۳�� -> ���� ��� ����
			
			removeNode = null;	// ���۳�带 �����ߴ� �ӽð��� -> null ->������ �÷��Ͱ� ������..
			return;//�޼��� ����
		}
		//�Է¹��� ���� ���۳���� ���� ���� �ʴ�
		
		//���۳�� ����� temp �ӽ�����
		Node temp = pointer;
		
		
		//while ù��° ����
		//�Է¹����� 2
		//[ 1, null ] -> ��ü�� �ϳ����ε� ���� ���� ������ ����X
		
		//while �ι�° ����
		//pointer ���� value ���� �ʴٴ°�
		//[1��,2����ü] [ 2, 3����ü] [3, 4�� ��ü]
		
		//pointer(ó���ݺ� -> ���۳��)�� ��ü�� �ְ� pointer ��(value) �Է¹��� ���� ���� ������
		
		//������(ó����ü~��������ü) ��������ü���� �ݺ��ǰų� , �Է¹��� ���ϰ� ���� ���� ���������� �ݺ�
		while(pointer !=null && pointer.getValue() != value) {
			temp = pointer; //
			pointer = pointer.next; // ������ (���� ��ü) ������ü
		}
		
		//������ ��ü
		if(pointer.next == null) {
			temp.next = null;
		}else {// ������
			temp.next = pointer.next;
		}
		pointer = null;
	}
	
	

}
