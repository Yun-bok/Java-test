package Acc;//����ý���

import java.util.Scanner;

public class Account_main {
	static Scanner input = new Scanner(System.in);
	static Account[] account_arr = new Account[100]; //�迭
	public static void main(String[] args) {
		boolean isrun = true;
		while(isrun) {
			System.out.println("--------------------------------");
			System.out.println("1. ���� ���� | 2. ������ü��ȸ | 3.����"
					+ " | 4.��� | 5.����");
			System.out.println("--------------------------------");
			
			int num = Integer.parseInt(input.nextLine());
			//����ġ�� �ᵵ ����
			if(num==1) {
				account_Create();
			}else if (num==2) {
				account_SelectAll();
			}else if (num==3) {
				deposit();
			}else if (num==4) {
				withdraw();
			}else if (num==5) {
				isrun = false; // while �� �ݺ�����
			}
		}
	}
	//���»���
	static void account_Create() {
		System.out.println("--------------------------------");
		System.out.println("���»��� | 1.�Ϲݰ��� | 2. �̺�Ʈ ����");
		System.out.println("--------------------------------");
		int num = Integer.parseInt(input.nextLine());
		System.out.println("���¹�ȣ");
		String account_number = input.nextLine();
		System.out.println("������: ");
		String client_name = input.nextLine();
		
		Account account = null;
		
		if(num == 1) {
			account = new Account(client_name,account_number);
		}else if (num==2) {
			account = new EventAccount(client_name,account_number);
		}else {
			System.out.println("�߸��Է�");
			return;
		}
		for(int i = 0; i<account_arr.length; i++) {
			if(account_arr[i]==null) {
				account_arr[i] = account;
				System.out.println("���»���");
				break;
			}
		}
	}
	
	//���� �����ȸ
	static void account_SelectAll() {
		System.out.println("----------");
		System.out.println("���¸��");
		System.out.println("----------");
		for(int i = 0; i<account_arr.length; i++) {
			if(account_arr[i]==null) {
				break;
			}else {
				account_arr[i].accinfo_show();
			}
			/*//���2
			if(account_arr[i]!=null) { //null�� �ƴϸ�
				account_arr[i].accinfo_show();
			}
			//���3
			if(!(account_arr[i]==null)) {//�տ�!�� ����ͻ� ����ѹ���̴�)
				account_arr[i].accinfo_show();
			}*/
		}
	}
	//���� �Աݱ��
	static void deposit() {
	System.out.println("----------");
	System.out.println("���¸��");
	System.out.println("----------");
	
	System.out.println("���¹�ȣ: ");
	String account_num = input.nextLine();
	
	System.out.println("�Աݱݾ�: ");
	int amount = Integer.parseInt(input.nextLine());
	
	Account acc = account_select(account_num);
	if(acc == null) {
		System.out.println("�Է��� ���¸� ã�� ���߽��ϴ�.");
	}else {
		acc.deposit(amount);
	}
	
	
	}
	//���
	static void withdraw() {
		System.out.println("----------");
		System.out.println("���");
		System.out.println("----------");
		
		System.out.println("���¹�ȣ: ");
		String acc_num = input.nextLine();
		System.out.println("��ݱݾ�");
		int amount = Integer.parseInt(input.nextLine());
		
		Account acc = account_select(acc_num);
		if(acc == null) {
			System.out.println("�߸��� ����");
		}else {
			acc.withdraw(amount);
		}
		
	}
	
	//������ȸ - ���¹�ȣ
	static Account account_select(String account_num) {
		
		for(int i =0; i<account_arr.length; i++) {
			if(account_arr[i] == null) {
				break;
			}
			
			//account_arr[i].account_number -> StringŸ���� ���¹�ȣ ��ȯ
			if(account_arr[i].account_number.equals(account_num)) {
				return account_arr[i];
			}
		}
		return null;
	}
}
