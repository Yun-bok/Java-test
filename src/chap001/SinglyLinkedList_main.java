package chap001;

import java.util.LinkedList;

public class SinglyLinkedList_main {
	public static void main(String[] args) {
		
		LinkedList list = new LinkedList = new SinglyLinkedList();
		SinglyLinkedList singlyLinkedList = new SinglyLinkedList();
		singlyLinkedList.append(85);
		singlyLinkedList.append(59);
		singlyLinkedList.append(70);
		singlyLinkedList.append(23);
		singlyLinkedList.append(65);
		
		System.out.println("원본 단일 연결 리스트 : ");
		singlyLinkedList.printAll();
		
		singlyLinkedList.delete(85);
		System.out.println("노드 85를 삭제한 단일 연결 리스트");
		singlyLinkedList.printAll();
		

		singlyLinkedList.delete(70);
		System.out.println("노드 70를 삭제한 단일 연결 리스트");
		singlyLinkedList.printAll();
		

		singlyLinkedList.delete(65);
		System.out.println("노드 65를 삭제한 단일 연결 리스트");
		singlyLinkedList.printAll();
	}
}
