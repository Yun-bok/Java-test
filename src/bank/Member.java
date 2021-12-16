package bank;

public class Member {
	//필드
		//이름, 나이, 아이디, 비밀번호
		//이름
		private String name;
		//나이
		private int age;
		//아이디
		private String id;
		//비밀번호
		private String pw;
		
		//생성자
		Member(String name, int age, String id, String pw){
			this.name = name;
			this.age = age;
			this.id = id;
			this.pw = pw;
		}
		
		//메서드
		//MemberInfo_show 조회기능
		public void MemberInfo_show() {
			System.out.println("이름: "+name+", 나이: "+age+ ", 아이디: "+id);
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


