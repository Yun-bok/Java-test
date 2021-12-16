package Acc;//은행시스템

import java.util.Scanner;

public class Account_main {
	static Scanner input = new Scanner(System.in);
	static Account[] account_arr = new Account[100]; //배열
	public static void main(String[] args) {
		boolean isrun = true;
		while(isrun) {
			System.out.println("--------------------------------");
			System.out.println("1. 계좌 생성 | 2. 계좌전체조회 | 3.예금"
					+ " | 4.출력 | 5.종료");
			System.out.println("--------------------------------");
			
			int num = Integer.parseInt(input.nextLine());
			//스위치를 써도 좋다
			if(num==1) {
				account_Create();
			}else if (num==2) {
				account_SelectAll();
			}else if (num==3) {
				deposit();
			}else if (num==4) {
				withdraw();
			}else if (num==5) {
				isrun = false; // while 의 반복종료
			}
		}
	}
	//계좌생성
	static void account_Create() {
		System.out.println("--------------------------------");
		System.out.println("계좌생성 | 1.일반계좌 | 2. 이벤트 계좌");
		System.out.println("--------------------------------");
		int num = Integer.parseInt(input.nextLine());
		System.out.println("계좌번호");
		String account_number = input.nextLine();
		System.out.println("예금주: ");
		String client_name = input.nextLine();
		
		Account account = null;
		
		if(num == 1) {
			account = new Account(client_name,account_number);
		}else if (num==2) {
			account = new EventAccount(client_name,account_number);
		}else {
			System.out.println("잘못입력");
			return;
		}
		for(int i = 0; i<account_arr.length; i++) {
			if(account_arr[i]==null) {
				account_arr[i] = account;
				System.out.println("계좌생성");
				break;
			}
		}
	}
	
	//계좌 목록조회
	static void account_SelectAll() {
		System.out.println("----------");
		System.out.println("계좌목록");
		System.out.println("----------");
		for(int i = 0; i<account_arr.length; i++) {
			if(account_arr[i]==null) {
				break;
			}else {
				account_arr[i].accinfo_show();
			}
			/*//방법2
			if(account_arr[i]!=null) { //null이 아니면
				account_arr[i].accinfo_show();
			}
			//방법3
			if(!(account_arr[i]==null)) {//앞에!를 빼논것뿐 비슷한방식이다)
				account_arr[i].accinfo_show();
			}*/
		}
	}
	//계좌 입금기능
	static void deposit() {
	System.out.println("----------");
	System.out.println("계좌목록");
	System.out.println("----------");
	
	System.out.println("계좌번호: ");
	String account_num = input.nextLine();
	
	System.out.println("입금금액: ");
	int amount = Integer.parseInt(input.nextLine());
	
	Account acc = account_select(account_num);
	if(acc == null) {
		System.out.println("입력한 계좌를 찾지 못했습니다.");
	}else {
		acc.deposit(amount);
	}
	
	
	}
	//출금
	static void withdraw() {
		System.out.println("----------");
		System.out.println("출금");
		System.out.println("----------");
		
		System.out.println("계좌번호: ");
		String acc_num = input.nextLine();
		System.out.println("출금금액");
		int amount = Integer.parseInt(input.nextLine());
		
		Account acc = account_select(acc_num);
		if(acc == null) {
			System.out.println("잘못된 계좌");
		}else {
			acc.withdraw(amount);
		}
		
	}
	
	//계좌조회 - 계좌번호
	static Account account_select(String account_num) {
		
		for(int i =0; i<account_arr.length; i++) {
			if(account_arr[i] == null) {
				break;
			}
			
			//account_arr[i].account_number -> String타입의 계좌번호 반환
			if(account_arr[i].account_number.equals(account_num)) {
				return account_arr[i];
			}
		}
		return null;
	}
}
