package bank;

public class Member {
	//�ʵ�
		//�̸�, ����, ���̵�, ��й�ȣ
		//�̸�
		private String name;
		//����
		private int age;
		//���̵�
		private String id;
		//��й�ȣ
		private String pw;
		
		//������
		Member(String name, int age, String id, String pw){
			this.name = name;
			this.age = age;
			this.id = id;
			this.pw = pw;
		}
		
		//�޼���
		//MemberInfo_show ��ȸ���
		public void MemberInfo_show() {
			System.out.println("�̸�: "+name+", ����: "+age+ ", ���̵�: "+id);
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public int getAge() {
			return age;
		}

		public void setAge(int age) {
			this.age = age;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getPw() {
			return pw;
		}

		public void setPw(String pw) {
			this.pw = pw;
		}
	}


