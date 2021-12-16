package ������0923e;

import java.util.ArrayList;
import java.util.Scanner;

public class ������0923 {
	static Scanner input = new Scanner(System.in);
	static ArrayList<Integer> arrlist = new ArrayList<Integer>();
	static LinkedList<Integer> linkedList = new LinkedList<Integer>
	/*
	 * Q1) �ʱ��Է��� �޾� ������ ���� �����ϴ� ���α׷��� ����ÿ� 1.���� ����, 2����� ���� �� ���, 3����� ���� ��ü ���, 4
	 * ���� idx 1-> 1, 2, 3, 4, 5
	 * 
	 * 
	 * 1.����:(�Է�) 2.����� ������ ��: ��� 15 3.����� ���� ��ü��� 1 2 3 4 5 4.������ idx�Է� : (�Է�) 4 ->
	 * 5 �� ���� 5.������ �� �Է� : (�Է�) 4 -> 4 �� ����
	 */

	public static void main(String[] args) {
		while (true) {
			System.out.println("-----------");
			System.out.println("1.���� ����, 2����� ���� �� ���, 3����� ���� ��ü ���, 4 ���� idx");
			System.out.println("-----------");
			
			int num = Integer.parseInt(input.nextLine());
			switch(num) {
			case 1:  number_add(); break;
			case 2:  numberlist_sum();break;
			case 3:  numberlist_selectall();break;
			case 4:  numberlist_delete_fromidx();break;
			case 5:  numberlist_delete_fromvalue();break;
			}
		}

	}
	//��������
	static void number_add() {
		System.out.println("���� :");
		int inputnum = Integer.parseInt(input.nextLine());
		//ArrayList  .add(���)  ��� �߰�
		arrlist.add(inputnum);
	}
	
	//���ڸ���Ʈ ��ü ��
	static void numberlist_sum() {
		int sum = 0;
		for(int i = 0; i<arrlist.size(); i++) {
			sum += arrlist.get(i);
			//sum = sum + arrlist.get(i);
		}
		System.out.println(sum);
	//	for(int num : arrlist) {
			
//		}
	//}
}
	//���ڸ���Ʈ ��ü ��ȸ
	static void numberlist_selectall() {
		for(int num : arrlist) {
			System.out.println(num+"");
		}
	}
	//���ڸ���Ʈ �ε��� ����
	static void numberlist_delete_fromidx() {
		System.out.println("idx : ");
		int inputidx = Integer.parseInt(input.nextLine());
				arrlist.remove(inputidx);
			
		}
		//���ڸ���Ʈ ������ ����
		static void numberlist_delete_fromvalue() {
			int inputnum = Integer.parseInt(input.nextLine());
			for(int i=0; i<arrlist.size(); i++) {
				if(arrlist.get(i)== inputnum) {
					arrlist.remove(i);
					return;
				}
		}
			System.out.println("�ش簪�� �������� �ʽ��ϴ�.");
	}
}
