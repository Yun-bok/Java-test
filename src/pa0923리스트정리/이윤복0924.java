package pa0923����Ʈ����;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;

public class ������0924 {

	public static void main(String[] args) {
		Q1();
		//Q2();
		//Q3();

	}

	/* 
	 * Q1)Stack �� ����� 1,2,3 �����ϴ� �ݺ����� ����� �۵��ϰ� ���� Stack<intrger> stack = new
	 * Stack<integer>(); stack.push(1); stack.push(2); stack.push(3);
	 * 
	 * for(int=0; i<stack.size();i++){ ���þȿ� ��� ��ü ���} ���û���� ����ؼ� ��ü ��� ���λ��ٴ���?
	 */
	static void Q1() {
		int num = 0;
		int sum = 0;
		int data = 0;
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1); //1
		stack.push(2); //2
		stack.push(3); //3 ����
		
		//1,2,3�� ���ϴ� �ݺ����� �۵��ϰԲ�
		int data1 = stack.pop();
		int data2 = stack.pop();
		int data3 = stack.pop();
			//0���� ���û����� ���� ����
		int size = stack.size();
		for(int i=0; i<stack.size();i++) { //3���� �ݺ�
			 sum =+ i;
			System.out.println();
			
			//######
			i �� stack.push���� ������ 
			
				
			//	num =+ size; 
			//System.out.println(data); //�̷��� �Ǹ� ����� 3��������
			//�Ǻ���ġ?
			
			
			
		//	sum =+ data1+data2+data3) �̷��� �ǹ̾���
		}
		
		
		
		
	}
	

	// Q2) Stack ����� 1,2,3,4,5 ����(for�� �ݺ�)�ϰ� ���(while ���)�ϴ� �ݺ���
	//Stack<integer> s = new
	//s.push(1) - �ݺ������� 1~5����
	//s.pop -> while�� ��ü���
	static void Q2() {
		Stack<Integer> stack = new Stack<Integer>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		stack.push(4);
		stack.push(5);
		int size = stack.size();
		for(int i=0; i<stack.size(); i++) { //�ݺ�
			boolean run;
			//while(run) {
				
		//	}
			
		}

	}
	/*
	 * Q3) �� �������� ������ ����, �ڷΰ��� ��� ����(�����̿�) 1.�������湮(���ڿ� �Է�) 2.������������ ����(���) ����:
	 * ������������ �����ϴ�.(����) (ó���� ������������ ���� 1������ �湮�ߴٴ� �����Ͽ�) 3.������������ ����(���) *���û�� ����:
	 * ������������ �����ϴ�(����)
	 * 
	 */

	static void Q3() {
		Queue<String> queue = new LinkedList<String>();
		Scanner input = new Scanner(System.in);
		System.out.println("---------------");
		System.out.println("1.google | 2.naver | 3.daum");
		System.out.println("---------------");
		System.out.println("������ �������� �Է�:");
		String url1 = input.nextLine();
		
		queue.offer(url1); // �Է¹��� �ּ� ����
		System.out.println("���� ������:"+url1);
		int num = input.nextInt();
		switch(num) {
		case 1:
			System.out.println("����������"); break;
		case 2: System.out.println("����������"); break;
		}
		
		
		if(url1)
		//������ ������ �ƴ϶� ������ �����ȴ�
		//�׷���???
		
		
		if(url1 == null) {//
			System.out.println("���� �������� ����");
		}
		
		boolean isEmpty = url1.isEmpty(); //���� url���� ����ִٸ�
		if(isEmpty) {
			
		System.out.println("������������ �����ϴ�");//���� ������ ��
		}else if(isEmpty) {
			System.out.println("������������ �����ϴ�"); //������������
			
		}
		

	}
	static void q4() {
		Stack<String> stack = new Stack<String>();
		
	}
	
}
