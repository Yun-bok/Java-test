package pa0923����Ʈ����;

import java.util.ArrayDeque;
import java.util.Deque;

public class Deque_ex01��ũ {
	public static void main(String[] args) {
		//��ũ, ��
		//Deque(Double Ended Queue)
		//ť�� ���
		//ť - ���ʿ��� ����, �ٸ� ���ʿ��� ����
		//��ũ - ���ʿ��� ����, ���� ����
		
		//����
		//�糡 �������� ���԰� ������ ������
		//��, �ڿ��� �����͸� ����/���� �� �� �ִ�.
		
		//����
		//������ ��ƴ�.
		//�߰������� ����/������ ��ƴ�.
		
		//����Ҷ�
		//�հ� �ڿ��� ����, ������ ���� �Ͼ�� ���
		
		//�ֿ� ����
		//�����Ҷ� offerFirst() ��������, offerLast() ���� ����, offer - offerlast()����
		//������ pollFirst() ���� ������, pollLast() ���� ������, poll - pollFirst()����
		//������ �� Ȯ�� Peek
		//
		Deque01();
	}
	static void Deque01() {
		//�ڹٿ��� Deque �������̽� ���� (Ŭ���� �ƴ�) -> �����Ұ�
		//DequeŸ���� ������ ģ������ ������ �ִ�.
		Deque<String> deque = new ArrayDeque<String>();
		deque.offerFirst("1");  //"1" ����
		deque.offerFirst("2");  //"2" "1" 
		deque.offerLast("3");   //"2" "1" "3"
		deque.offer("4");       //"2" "1" "3" "4"
		
		
		//poll
		System.out.println(deque.pollFirst()); // �� "2" ��µǰ� �����  ������ 1, 3, 4 
		System.out.println(deque.pollLast());  // �� "4"                  1, 3
		System.out.println(deque.pollLast());  // �� "3"                  1
		
		
		deque.offer("5"); //"1" "5"
		//isEmpty() -> ����ִ��� Ȯ�� ������� true, ��Ұ� ������ false
		while(!deque.isEmpty()) {
			System.out.println(deque.poll()); // �տ��� ���� 1 , 5
		}
		
		
	}
}
