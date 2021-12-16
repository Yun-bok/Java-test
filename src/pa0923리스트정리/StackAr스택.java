package pa0923����Ʈ����;

import java.util.Stack;

public class StackAr���� {

	public static void main(String[] args) {
		//����
		//�� ��� ����
		// -> ���� �����Ѱ��� �Ʒ� ���߿� �����Ѱ��� ����
		// ->��������(����) ������ ����
		//������� �����ϱ�
		
		//LIFO - Last In First Out
		//���������̴�
		//���Լ���   �̰͵��� ���峭�̴� ->����
		//�ֻ��� ������ (���� ���õ�����) ->Top �̶� �θ�
		//��������ܿ��
		
		//����Ҷ�
		//�������� �ؾ��� ��(ex.���� �۾� �� ������� ex)Ctrl+z �̷��ž��� ���)
		//�ǵ�����            ���� ���߿� �Է��� ������� ����
		//�����丮 (��, �������� -> ����������, ����������, �湮���� ��) ���� �Ҷ� ���
		
		//���̹� -> ���� -> ���� ->īī��
		//������������ ����(�ϴ� ������ ����? ������ ������) ->���̹� -> ���� -> ����
		//���� -> ���� -> -> ���� -> ���̹�
		
		//�ֿ� ����
		//�����Ҷ� push
		//������  pop        -> ����* �ҷ�����x -> ������ ������(����)
		//������ ������ �� Ȯ�� peek ��°� �ִ�
		
		//�˰��� ����
		//������ �ַ� ����ϴ°�
		//��ȣ �˻�, ���� ���ڿ� �����, ����ǥ��������� ��ȯ��
		//�������� ť
		//���� ����
		
		//����
		//�ڷᰡ ������ pop�ϴ� ���� -> stack underflow
		//������ ũ�� �̻��� �ڷḦ push�Ϸ� �Ҷ� ���� -> stack overflow
		//�̰� ���谢
		//
		//		  5          �����귶�� �����÷ο��
		//     |  4     |  5  4   3  2   1  1
		//     |  3     |
		//     |  2	    |
		//     |__1_____|  �̰� ��� �÷ο��
		//
		Stack01();
		Stack02();
	}
	//������ �ñ��ϰų� �������� ������ ������� -> å���ִ� 113
	//å(�迭,���Ḯ��Ʈ)����
	//�ڹٿ��� �������ִ� ���ñ��� ���
	static void Stack01() {
		//���� util ����
		Stack<Integer> stack = new Stack<Integer>(); //intŸ���� �����ϴ� ������ �����
		//���û���� �ܿ���
		//stack.add(1); add�� ����� ���� ������
		//<���ʸ�Ÿ��> -> ����Ǵ� Ÿ���� <���ʸ�Ÿ��>�̴� �Ϲ������� ����
		//���ʸ��� �������ִ°� �ڹ��� ���� ���������� �����غ���
		//�̰� ��������� �ٸ������� ���δ�
		//push ������(���) ����
		stack.push(1);  //1 
		stack.push(2);  //1 2
		stack.push(3);  //1 2 3
  		stack.push(4);  //1 2 3 4
  		
  		
  	//	for(int i=0; i<stack.size(); i++) {
  	//		int num = stack.pop();
  	//		System.out.println(num);
  	//	}
  		//�����?
  		//4
  		//3
  		//2
  		//1 ������ ����ó�� �߾ȳ��´�~
  		//size ������ũ��
  		int size = stack.size();
  		System.out.println("pop ���� size: "+size); //4
  		
  		int data1 = stack.pop();
  		System.out.println(data1); //4
  		//������ ������ �ƴ϶� ���� ������ size ��3�̵ȴ�
  		
  		//���� pop -> size ����
  		size = stack.size();
  		System.out.println("pop ���� size: "+size); //3
  		
  		//1 2 3
  		stack.pop(); // ����1 2
  
  		System.out.println(stack.pop());//���� 1 // ���2
  		
  		System.out.println("pop ���� size:"+stack.size()); // ����Ͻ� ������ �Ʒ��� �帧 ��
		//(data2)2
  		//pop���� size: 1
  		
  		//.peek()
  		//������ ��( ���� ���� �����Ͱ� Ȯ��)
  		int data3 = stack.peek(); //1
  		System.out.println(data3);
  		System.out.println("peek ���� size:"+stack.size()); //1
  		
  		//����1
  		//.contains() -> �Ű������� �� ��Ұ� �ִ��� Ȯ�� -> ������ true ������ false
  		boolean iscontain = stack.contains(1);
  		System.out.println("contains: "+iscontain);
  		
  		//�ϳ� �����ִ��� ���� ��ü���� ���
  		//.clear() //���� �ʱ�ȭ(��ü����)
  		stack.clear();
  		System.out.println("clear: "+stack.size());
  		
  		//.isEmpty() -> ����ִ��� Ȯ�� -> ��������� true, ���(������)�ֹǳ� flase
  		//stack.push(1); <- �̰� ������ false
  		boolean isempty = stack.empty();
  		System.out.println("empty() : "+isempty); //������ �����ϱ� true
  		
  		//�ݺ��ؼ� ��� - Quiz
  		
		//���� ���׸��� ����
		Stack stack2 = new Stack();
		stack2.push(1);
		int num = (int)stack2.pop(); //���ʸ��� ���������� �ϳ��ϳ� ������Ѵ�
	}

	static void Stack02() {
		Stack<String> stack = new Stack<String>();
		stack.push("a");//a
		stack.pop();
		stack.push("b");
		stack.push("c");
		stack.clear();
		stack.push("d");
		stack.pop();
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.size());
		//��� ��� �� ���ÿ�
		//���蹮��
	}
}
