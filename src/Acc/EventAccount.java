package Acc;

public class EventAccount extends Account {
	//필드
	//이자율
	double interest_rate;
	
	
	//생성자
	EventAccount(String client_name, String account_number){
		super(client_name, account_number);
		interest_rate = 0.2; //이자율 0.2
	}
	
	//메서드
	//입금 재정의
	@Override
	public void deposit(int amount) {
		this.balance += amount*(1+interest_rate);
	}
	
	//조회 재정의
	@Override
	public void accinfo_show() {
		System.out.println(client_name + " | 계좌번호 : "+ account_number
				+"| 잔액 :  "+balance+"| 이자율 : "+ interest_rate);
	}
}
