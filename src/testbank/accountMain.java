package testbank;

import java.util.Scanner;

public class accountMain {
	static account = new account1 account();
	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		boolean isrun = true;
		System.out.println("------------------------------------------");
		System.out.println("1. ���»��� | 2. ���¸����ȸ | "
				+ "3. ���� | 4. ��� | 5. ����");
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
System.out.println("���¸�:");
String name = input.nextLine();
System.out.println("���� ���¹�ȣ: ");
int accountnum = Integer.parseInt(input.nextLine());
}
static void accountSelect() {
	static
}
}

