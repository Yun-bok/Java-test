package Acc;

public class Account {
	//�ʵ�
	//������, ���¹�ȣ, �ܾ�
	public String client_name; //������
	public String account_number; //���¹�ȣ
	public int balance; //�ܾ�
	
	
	//������
	Account(String client_name, String account_number) {
		this.client_name = client_name;
		this.account_number = account_number;
		this.balance = 0;
	}
	
	//�޼��� �Ա�, ���, ��ȸ
	//�Ա�
	public void deposit(int amount) { // �ܾ�
		this.balance += amount; //this.balance = balance+amount;
	}
	
	//���
	public void withdraw(int amount) {
		if(balance>=amount) {
			this.balance -= amount;
			System.out.println("��ݿϷ�");
		}else {
			System.out.println("<<<�ܾ� ����>>>");
		}
	}
	//��ȸ
	public void accinfo_show() {
		System.out.println(client_name + " | ���¹�ȣ : "+ account_number
				+"| �ܾ� :  "+balance);
	}
	

}
