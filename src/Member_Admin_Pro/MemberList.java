package Member_Admin_Pro;

public class MemberList {
		//�ʵ�
		//memberlist
	Member[] memberlist = new Member[100];
	//������ - �⺻������ ex(�ƹ��͵� �Ⱦ������
	//�޼���
	//ȸ������(�̸�,����,���̵�,��й�ȣ)
	public boolean Member_add(String name,int age, String id ,String pw) {
		//boolean ischeck = false;
		for(int i = 0; i<memberlist.length; i++) {
			if(memberlist[i]==null) {
				memberlist[i] = new Member(name,age,id,pw);
			//	ischeck = true;
				return true; //���� ����
			}
		}
		return false; //�������
		//if(!ischeck) {
			//System.out.println("���� ���� ����");
		}
		
	
	//�̸����� ��ȸ(�̸�)
	public void Member_select(String name) {
		for(Member member: memberlist) {
			if((member.getName()).equals(name)) {
				return member;
			}
		}
		return null;
	}
	//���̵�� ����(���̵�)
	public boolean Member_delete(String id) {
		for(Member member : memberlist) {
			if(member.getId().equals(id)) {
				member = null;
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
