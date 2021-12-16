package Member_Admin_Pro;

public class MemberList {
		//필드
		//memberlist
	Member[] memberlist = new Member[100];
	//생성자 - 기본생성자 ex(아무것도 안쓰면생김
	//메서드
	//회원가입(이름,나이,아이디,비밀번호)
	public boolean Member_add(String name,int age, String id ,String pw) {
		//boolean ischeck = false;
		for(int i = 0; i<memberlist.length; i++) {
			if(memberlist[i]==null) {
				memberlist[i] = new Member(name,age,id,pw);
			//	ischeck = true;
				return true; //저장 성공
			}
		}
		return false; //저장실패
		//if(!ischeck) {
			//System.out.println("저장 공간 부족");
		}
		
	
	//이름으로 조회(이름)
	public void Member_select(String name) {
		for(Member member: memberlist) {
			if((member.getName()).equals(name)) {
				return member;
			}
		}
		return null;
	}
	//아이디로 삭제(아이디)
	public boolean Member_delete(String id) {
		for(Member member : memberlist) {
			if(member.getId().equals(id)) {
				member = null;
				return true;
			}
		}
		return false;
	}
	//전체조회
	public void Member_selectall() {
		for(Member member: memberlist) {
			if(member!=null) {
				member.MemberInfo_show();
			}
		}
	}
}
