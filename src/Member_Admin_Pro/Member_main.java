package Member_Admin_Pro;

import java.util.Scanner;

public class Member_main {
	static MemberList mem_list = new MemberList();
	static Scanner input = new Scanner(System.in); 
	
	public static void main(String[] args) {
		boolean isrun = true;
		while(isrun) {
		System.out.println("--------------------------------------------");
		System.out.println("1.회원가입 | 2.전체조회 |"
				+ " 3. 회원검색 |4. 회원삭제| 5. 종료");
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

	//회원가입 기능
	static void mainMember_add() {
		System.out.println("이름 :");
		String name = input.nextLine();
		System.out.println("나이 :");
		int age = Integer.parseInt(input.nextLine());
		
		String id = input_str("아이디");
		String pw = input_str("비밀번호");
		
		
		if(mem_list.Member_add(name, age, id, pw)) {
			System.out.println("회원가입 성공");
		}else {
			System.out.println("회원가입 실패");
		}
		
		}
	
	//전체조회 기능
	static void mainMember_selectall() {
		mem_list.Member_selectall();
	}
	//회원조회 - 이름으로
	static void mainMember_select() {
		String name = input_str("이름");
		//Member member = mem_list.Member_select(name);
		//member.MemberInfo_show();
		 //mem_list.Member_select(name).MemberInfo_show();
		
	}
	
	//회원탈퇴기능
	static void mainMember_delete() {
		String id = input_str("아이디");
		if(mem_list.Member_delete(id)) {
			System.out.println("회원삭제성공");
		}else {
			System.out.println("회원삭제실패");
		}
	}
	
	//문자를 받아 출력하고 입력받는 기능
	static String input_str(String str) {
		System.out.println(str+":");
		return input.nextLine();
	}
}
