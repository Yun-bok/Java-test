package testbank;

import java.util.Scanner;

public class accountMain {
	static account = new account1 account();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isrun = true;
		System.out.println("------------------------------------------");
		System.out.println("1. 계좌생성 | 2. 계좌목록조회 | "
				+ "3. 예금 | 4. 출금 | 5. 종료");
		System.out.println("------------------------------------------");
		
		int select_num = Integer.parseInt(input.nextLine());
		switch(select_num) {
		case 1: //account_add		break;
		case 2: //account; break;
		case 3: //mainMember_select(); 	break;
		case 4: //mainMember_delete();	break;
		case 5: isrun = false;          break;
		}
	}
	


static void account_add() {
System.out.println("계좌명:");
String name = input.nextLine();
System.out.println("만들 계좌번호: ");
int accountnum = Integer.parseInt(input.nextLine());
}
static void accountSelect() {
	static
}
}

