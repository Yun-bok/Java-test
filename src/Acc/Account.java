package Acc;

public class Account {
	//필드
	//예금주, 계좌번호, 잔액
	public String client_name; //예금주
	public String account_number; //계좌번호
	public int balance; //잔액
	
	
	//생성자
	Account(String client_name, String account_number) {
		this.client_name = client_name;
		this.account_number = account_number;
		this.balance = 0;
	}
	
	//메서드 입금, 출금, 조회
	//입금
	public void deposit(int amount) { // 잔액
		this.balance += amount; //this.balance = balance+amount;
	}
	
	//출금
	public void withdraw(int amount) {
		if(balance>=amount) {
			this.balance -= amount;
			System.out.println("출금완료");
		}else {
			System.out.println("<<<잔액 부족>>>");
		}
	}
	//조회
	public void accinfo_show() {
		System.out.println(client_name + " | 계좌번호 : "+ account_number
				+"| 잔액 :  "+balance);
	}
	

}
