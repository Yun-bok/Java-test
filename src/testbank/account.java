package testbank;
/*계좌관리 프로그램

1.계좌관리 프로그램에서 계좌는 일반계좌, 이벤트 계좌가 있습니다 일반계좌는
예금주,계좌번호,잔액을 관리하고 이벤트 계좌는 일반계좌정보에 이자율
이 있습니다

2.일반계좌는 기본적인 입금 출금 기능, 이벤트 계좌는 입금할때마다
이자가 붙어서 입금됩니다.

3.계좌관리 프로그램은 계좌생성, 계좌목록조회,예금,출금이 있습니다.

4.계좌생성시 일반 계좌와 이벤트 계좌를 선택할수 있습니다.
*/
public class account {
	//필드
	
	//예금주
	private String name;
	//계좌번호
	private int accountnum;
	//잔액
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
	public void Plusmoney() {//예금
		System.out.println(); //이자?
	}
	public void Minusmoney() {
		
	}
	}
	
	//메서드
	//기본적인 입출금기능 2개
	


