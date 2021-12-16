package Member_Admin_Pro;

import java.util.Scanner;

public class Member_main {
	static MemberList mem_list = new MemberList();
	static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		boolean isrun = true;
		while(isrun) {
		System.out.println("--------------------------------------------");
		System.out.println("1.ȸ������ | 2.��ü��ȸ |"
				+ " 3. ȸ���˻� |4. ȸ������| 5. ����");
		System.out.println("--------------------------------------------");
		
		int select_num = Integer.parseInt(input.nextLine());
		switch(select_num) {
		case 1: mainMember_add();       break;
		case 2: mainMember_selectall(); break;
		case 3: mainMember_select();    break;
		case 4: mainMember_delete();    break;
		case 5: isrun = false;      	break;
		
		}
	}
}

	//ȸ������ ���
	static void mainMember_add() {
		System.out.println("�̸� :");
		String name = input.nextLine();
		System.out.println("���� :");
		int age = Integer.parseInt(input.nextLine());
		
		String id = input_str("���̵�");
		String pw = input_str("��й�ȣ");
		
		
		if(mem_list.Member_add(name, age, id, pw)) {
			System.out.println("ȸ������ ����");
		}else {
			System.out.println("ȸ������ ����");
		}
		
		}
	
	//��ü��ȸ ���
	static void mainMember_selectall() {
		mem_list.Member_selectall();
	}
	//ȸ����ȸ - �̸�����
	static void mainMember_select() {
		String name = input_str("�̸�");
		//Member member = mem_list.Member_select(name);
		//member.MemberInfo_show();
		 //mem_list.Member_select(name).MemberInfo_show();
		
	}
	
	//ȸ��Ż����
	static void mainMember_delete() {
		String id = input_str("���̵�");
		if(mem_list.Member_delete(id)) {
			System.out.println("ȸ����������");
		}else {
			System.out.println("ȸ����������");
		}
	}
	
	//���ڸ� �޾� ����ϰ� �Է¹޴� ���
	static String input_str(String str) {
		System.out.println(str+":");
		return input.nextLine();
	}
}
