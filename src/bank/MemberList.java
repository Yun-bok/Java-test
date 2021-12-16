package bank;

public class MemberList {
	//필드
		//memberlist
		Member[] memberlist = new Member[100];
		//생성자 - 기본생성자	
		//메서드
		//회원가입(이름,나이,아이디,비밀번호)
		public boolean Member_add(String name, int age, String id, String pw) {
			for(int i=0; i<memberlist.length; i++) {
				if(memberlist[i] == null) { //null -> 참조타입 객체 주소 X
					memberlist[i] = new Member(name,age,id,pw);
					return true;  //저장 성공
				}
			}
			return false; // 저장 실패
		}
		
		//이름으로 조회(이름)
		public Member Member_select(String name) {
			for(Member member: memberlist) {
				if((member.getName()).equals(name)) {
					return member;
				}
			}
			return null;
		}
		//아이디로 삭제(아이디)
		public boolean Member_delete(String id) {
			for(int i=0; i<memberlist.length; i++) {
				if(memberlist[i].getId().equals(id)) {
					memberlist[i] = null;
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


