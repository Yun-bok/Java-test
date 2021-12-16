package chap003;

import java.util.Scanner;

public class ex03 {
	// ����ó
	static ArrayList<Member> memList = new ArrayList<Member>();
	static Scanner input = new Scanner(System.in);

	public static void main(String[] args) {
		Start: while (true) { // Start ��
			System.out.println("----------");
			System.out.println("1.����ó ����, 2. ����ó ����, 3. ����ó ��ü��ȸ, 4.����ó �˻�");
			System.out.println("----------");

			int inputnum = Integer.parseInt(input.nextLine());
			switch (inputnum) {
			case 1:
				add_insert();
				break;
			case 2:
				add_delete();
				break;
			case 3:
				add_selectall();
				break;
			case 4:
				add_select();
				break;
			case 5:
				break Start; // ��

			}
		}
	}

	static void add_insert() {
		System.out.println("�̸�:");
		String name = input.next();
		System.out.println("��ȭ��ȣ: ");
		String phone = input.next();

		// �����ؼ� ����~
		// Member mem = new Member(name,phone);
		// memlist.add(mem);
		memlist.add(new Member(name, phone));
	}

	static void add_delete() {
		System.out.println("1. �̸����� ����, 2. ��ȭ��ȣ�� ����");
		int num = Integer.parseInt(input.nextLine());
		if (num == 1) {
			System.out.println("�̸�:");
			String name = input.next();

			for (int i = 0; i < memlist.size(); i++) {
				// memlist.get(i) Member Ŭ���� ��ü
				// Member Ŭ���� ��ü.getName() getter
				member mem = memlist.get(i);
				String mem_name = mem.getName();
				if(mem_name.equals(name)) {
					memlist.remove(i);
					return;
				}
		//		if (memlist.get(i).getName().equals(name)) {
		//			memlist.remove(i);
		//			return;

		//		}
			}
			System.out.println("�ش��ϴ� �̸��� �����ϴ�.");
		} else if (num == 2) {
			System.out.println("��ȭ��ȣ :");
			String phone = input.next();
			for(Member mem: memlist) {
				if(mem.getPhone().equals(phone)) {
					memlist.remove(mem);
					return;
				}
		}

	}
		
		static void add_selectall() {
			for(Member mem:memlist) {
				System.out.println("�̸�: "+mem.getName()+",��ȭ��ȣ: "+mem.getPhone());
			}
		}
		static void add_select() {
			System.out.println("�̸�: ");
			String name = input.next();
			for(Member mem : memlist) {
				if(mem.getName().equals(name)) {
					System.out.println("�̸� : "+mem.getName()+ ",��ȭ��ȣ : "+mem.getPhone());
					return;
				}
			}
				
			}
		}

	public static ArrayList<Member> getMemList() {
		return memList;
	}

	public static void setMemList(ArrayList<Member> memList) {
		ex03.memList = memList;
	}

	public static Scanner getInput() {
		return input;
	}

	public static void setInput(Scanner input) {
		ex03.input = input;
	}

}

class Member {
	private String name; // �̸�
	private String phone; // ��ȭ��ȣ

	Member(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}
}
