package bank;

public class MemberList {
	//�ʵ�
		//memberlist
		Member[] memberlist = new Member[100];
		//������ - �⺻������	
		//�޼���
		//ȸ������(�̸�,����,���̵�,��й�ȣ)
		public boolean Member_add(String name, int age, String id, String pw) {
			for(int i=0; i<memberlist.length; i++) {
				if(memberlist[i] == null) { //null -> ����Ÿ�� ��ü �ּ� X
					memberlist[i] = new Member(name,age,id,pw);
					return true;  //���� ����
				}
			}
			return false; // ���� ����
		}
		
		//�̸����� ��ȸ(�̸�)
		public Member Member_select(String name) {
			for(Member member: memberlist) {
				if((member.getName()).equals(name)) {
					return member;
				}
			}
			return null;
		}
		//���̵�� ����(���̵�)
		public boolean Member_delete(String id) {
			for(int i=0; i<memberlist.length; i++) {
				if(memberlist[i].getId().equals(id)) {
					memberlist[i] = null;
					return true;
				}
			}
			return false;
		}
		
		//��ü��ȸ
		public void Member_selectall() {
			for(Member member: memberlist) {
				if(member!=null) {
					member.MemberInfo_show();
				}
			}
		}
	}


