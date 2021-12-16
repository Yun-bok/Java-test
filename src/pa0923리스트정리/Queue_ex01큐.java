package pa0923����Ʈ����;

import java.util.LinkedList;
import java.util.Queue;

public class Queue_ex01ť {
	public static void main(String[] args) {
		// ť
		// ���ǥ(��)
		// -> ���� �� ����� ���� ���´�.
		// FIFO -> first in first out
		// ���Լ���
		// ù��° ������( ������ ������) front
		// ������ ������ rear

		// ����
		// �������� ����/ ������ ������
		// ����
		// Ž�� ������ - ���Ҹ� �ϳ��ϳ� ������ �Űܰ��鼭 �ؾ��Ѵ�.
		// queue�� �߰��� ��ġ�� ���(������)�� ������ ��ƴ�.

		// �ֿ� ����(�Ϲ����� ���)
		// �ڹٿ����� �����Ҷ� ������ �޼��� �ٸ�
		// �����Ҷ� Enqueue
		// ������ Dequeue -�ҷ����� X , ������ ������(����)
		// ������ �� Ȯ�� peek

		// ť�� ����(���� ť�� �Ϲ�����(�⺻) ť ������ ������ �����ϱ� ���� ���𰡸� �߰�)
		// Linear Queue(���� ť )
		// Circular Queue(���� ť)
		// Priority Queue (�켱���� ť)

		// �˰��� ����
		// BFS����, �ݼ��� ��� ����, ���μ��� ����
		// BFS(�ʺ� �켱 Ž��) , DFS(���� �켱 Ž��) ---> �˰��� ���� �ϰ������ ã�ƺ���
		// 5���� ���� *������
		Queue01();
	}
	static void Queue01() {
		//�ڹٿ��� Queue �������̽� ����(Ŭ������ �ƴ�) -> �����Ұ� Queue��� Ŭ���������̾ƴ� �������̽���
		//�ڹٿ��� �����Ҷ��� offer��� Ű����
		//������ poll ��� Ű����     - ������(������ ����)
		//������ �� Ȯ�� peek
		Queue<String> queue =  new LinkedList<String>();
		//.offer() ����
		//Queue �� push X
		queue.offer("������");   // "������"
		queue.offer("ȫ�浿");   // "������" "ȫ�浿"
		queue.offer("�׽�Ʈ");   // "������" "ȫ�浿" "�׽�Ʈ"
		System.out.println(queue.peek()); //ó�����ð� ��ȸ���� = ������
		//������ "������" "ȫ�浿" "�׽�Ʈ" ���������̴�
		
		//.poll() - ������ ������(������ ����)
		System.out.println(queue.poll());
		//"ȫ�浿" "�׽�Ʈ"
		queue.offer("�̼���"); // "ȫ�浿" "�׽�Ʈ" "�̼���" <- ������ ������ �̼��ŵ���
		System.out.println(queue.size()); // ��� => 3�� �������� 3 ����
		
		//.isEmpty() - ����ִ��� Ȯ��
		boolean isEmpty =  queue.isEmpty();
		System.out.println(isEmpty);
		
		//.contains("��") ��Ұ� �ִ��� üũ
		boolean iscontain = queue.contains("�̼���");
		System.out.println(iscontain);
		
		//queue - > ����ִ��� Ȯ�� -> ��������� true, ��Ұ� ������ false
		//while(����) ���� true �ݺ� false �ݺ� X
		//!������ true->false , false -> true
		while(!queue.isEmpty()) {
			System.out.println(queue.poll());
		}
	}
}
