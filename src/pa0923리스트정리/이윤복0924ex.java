package pa0923����Ʈ����;

import java.util.Scanner;
import java.util.Stack;

public class ������0924ex {

	public static void main(String[] args) {
		// q1();
		// q2();
		 q3();

	}

	/*
	 * Q1)Stack �� ����� 1,2,3 �� ���ϴ� �ݺ����� ����� �۵��ϰ� ���� Stack<intrger> stack = new
	 * Stack<integer>(); stack.push(1); stack.push(2); stack.push(3);
	 * 
	 * for(int=0; i<stack.size();i++){ ���þȿ� ��� ��ü ���}
	 */
	static void q1() {

		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		// i=0~ i<size i++

		int size = stack.size();
		for (int i = 0; i < size; i++) { // �ݺ� �״�� �ϸ� ��ü ��� �ȵȴ�
			System.out.println(stack.pop());

		}
	}

	/*
	 * Q2) Stack ����� 1,2,3,4,5 ����( for�� �ݺ�)�ϰ� ���(while ���)�ϴ� �ݺ���
	 */
	static void q2() {
		Stack<Integer> stack = new Stack<Integer>();
		for (int i = 0; i < 5; i++) {
			// i 1~5
			// 0+1~4+1
			stack.push(i + 1); // 1~5
		}
		// ��� 1 - ����ִ��� Ȯ���Ҽ� �ִ� ģ��
		// isEmpty() ��������� true, �������������(��Ұ� ������)false
		// ! ������ ���� -> true false -> false true
		while (!stack.isEmpty()) {
			System.out.println(stack.pop());

		}
		// ��� 2 - size()
		int size = stack.size(); // 5
		while (size > 0) { // ������ ���̸� �ݺ�, �����̸� ���� X
			System.out.println(stack.pop());
			System.out.println("size : " + stack.size());
			size--;
		}
	}

	static void q3() {
		//Stack<Integer> stack = new Stack<Integer>();
		//System.out.println("--------");
		//System.out.println("1.�������湮|2.����������|3.����������|4.����");
		//System.out.println("--------");
		
		Scanner input = new Scanner(System.in);
		Stack<String> previous = new Stack<String>();//���� ������ ��� ����
		Stack<String> next	   = new Stack<String>();//���� ������ ��� ����
		String now_page ="����";
		
		boolean run = true;
		while(run) {
		int num = Integer.parseInt(input.nextLine());
		switch(num) {
		case 1:
			String firstpage = "����";
			System.out.println("�湮�� ������ :");
			String page = input.nextLine();
			previous.push(now_page); //������������ ����
			now_page = page; //���������� �̵�
			break;
			
		case 2:
			if(previous.isEmpty()) {
				System.out.println("������������ �����ϴ�.");
				break;
			}
			String page2 = previous.pop();
			next.push(now_page);
			now_page = page2;
			System.out.println("���������� :" +now_page);
			break;
		case 3:
			if(next.isEmpty()) {
				System.out.println("������������ �����ϴ�");
				break;
			}
			previous.push(now_page);
			now_page= next.pop();
			System.out.println("���������� :" +now_page);
			break;
		case 4:
			run = false;
			break;
		}
		
		
		System.out.println("�湮�� ������: ");
		String page = input.nextLine();
	}
	}
}
