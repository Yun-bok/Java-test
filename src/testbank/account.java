package testbank;
/*���°��� ���α׷�

1.���°��� ���α׷����� ���´� �Ϲݰ���, �̺�Ʈ ���°� �ֽ��ϴ� �Ϲݰ��´�
������,���¹�ȣ,�ܾ��� �����ϰ� �̺�Ʈ ���´� �Ϲݰ��������� ������
�� �ֽ��ϴ�

2.�Ϲݰ��´� �⺻���� �Ա� ��� ���, �̺�Ʈ ���´� �Ա��Ҷ�����
���ڰ� �پ �Աݵ˴ϴ�.

3.���°��� ���α׷��� ���»���, ���¸����ȸ,����,����� �ֽ��ϴ�.

4.���»����� �Ϲ� ���¿� �̺�Ʈ ���¸� �����Ҽ� �ֽ��ϴ�.
*/
public class account {
	//�ʵ�
	
	//������
	private String name;
	//���¹�ȣ
	private int accountnum;
	//�ܾ�
	private int balance;
	
	account(String name,int accountnum, int balace){
		this.name = name;
		this.accountnum = accountnum;
		this.balance = balace;
	}


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAccountnum() {
		return accountnum;
	}

	public void setAccountnum(int accountnum) {
		this.accountnum = accountnum;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	public void Plusmoney() {//����
		System.out.println(); //����?
	}
	public void Minusmoney() {
		
	}
	}
	
	//�޼���
	//�⺻���� ����ݱ�� 2��
	


