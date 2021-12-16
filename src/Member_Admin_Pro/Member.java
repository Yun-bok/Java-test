package Member_Admin_Pro;

public class Member {
	//멤버클래수
	// 필드
	// 이름 , 나이, 아이디 , 비밀번호
	// 주석다는 습관은 좋다 많을수록 좋다 두번하자
	
	
	// 이름
	private String name;
	//나이
	private int age;
	//아이디
	private String id;
	//비밀번호     
	private String pw; //private 처리 외부에서 접근 못함
	
	//생성자 == 만들어서 초기화
	Member(String name,int age,String id,String pw){
		this.name = name;
		this.age = age;
		this.id = id;
		this.pw = pw;
		//이런식으로 초기화를 해주는 게터 세터 생성이 가능하다
	}
	// 메서드 ==필드조회가능한기능
		// MemberInfo_show 조회기능
		//ex) vip 멤버쉽같은 기능이 생길수도 있고 오버라이딩 으로 쓸려고 편하게 만들자
		public void MemberInfo_show() {
			System.out.println("이름: "+name+", 나이: "+age+", 아이디: "+id);
		}
	
// 상단 Source Generate gettet and setter 선택후 만들 필드들 선택하면 자동으로 만듬
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
