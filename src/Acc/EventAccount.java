package Acc;

public class EventAccount extends Account {
	//�ʵ�
	//������
	double interest_rate;
	
	
	//������
	EventAccount(String client_name, String account_number){
		super(client_name, account_number);
		interest_rate = 0.2; //������ 0.2
	}
	
	//�޼���
	//�Ա� ������
	@Override
	public void deposit(int amount) {
		this.balance += amount*(1+interest_rate);
	}
	
	//��ȸ ������
	@Override
	public void accinfo_show() {
		System.out.println(client_name + " | ���¹�ȣ : "+ account_number
				+"| �ܾ� :  "+balance+"| ������ : "+ interest_rate);
	}
}
