package Member_Admin_Pro;

public class Member {
	//���Ŭ����
	// �ʵ�
	// �̸� , ����, ���̵� , ��й�ȣ
	// �ּ��ٴ� ������ ���� �������� ���� �ι�����
	
	
	// �̸�
	private String name;
	//����
	private int age;
	//���̵�
	private String id;
	//��й�ȣ     
	private String pw; //private ó�� �ܺο��� ���� ����
	
	//������ == ���� �ʱ�ȭ
	Member(String name,int age,String id,String pw){
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
		//�̷������� �ʱ�ȭ�� ���ִ� ���� ���� ������ �����ϴ�
	}
	// �޼��� ==�ʵ���ȸ�����ѱ��
		// MemberInfo_show ��ȸ���
		//ex) vip ��������� ����� ������� �ְ� �������̵� ���� ������ ���ϰ� ������
		public void MemberInfo_show() {
			System.out.println("�̸�: "+name+", ����: "+age+", ���̵�: "+id);
		}
	
// ��� Source Generate gettet and setter ������ ���� �ʵ�� �����ϸ� �ڵ����� ����
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
