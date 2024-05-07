package com.kh.oop.constructor;
//1. 회원가입
public class Join {
	// 필드 회원번호 아이디 이름 연락처
	public int memberNo; // 회원가입한 순서
	public String memberId; // 회원이 작성한 아이디 nickname
	public String memberName; // 회원 이름
	public String phoneNo;
	
	// 생성자 기본 필수
	public Join() { // 필수 X
		
	}
	public Join(int memberNo, String memberId, String memberName, String phoneNo) { // 필수 O 우리 회사에서 필요한 내용을 모두 담을 것
	//  필드에있는 memberNo에 = 나중에 작성한 memberNo를 넣겠습니다.
			this.memberNo = memberNo;
			this.memberId = memberId;
			this.memberName = memberName;
			this.phoneNo = phoneNo;
	}
	
	// 메서드 = 클래스 안에 존재하고, 특정 기능을 할 수 있도록 묶어놓은 코드 모음
		//void 메서드 : 결과를 전달하지 않음
	public void memberInfo() {
		System.out.println("멤버 번호 : " +memberNo);
		System.out.println("멤버 ID : " +memberId);
		System.out.println("멤버 이름 : " +memberName);
		System.out.println("멤버 폰번 : " +phoneNo);
		System.out.println("============================");
	}
	
	// 최종으로 실행해주는 메인 메서드
	public static void main(String[] args) {
		System.out.println("==== 쇼핑 회원 정보 확인 ====");
		
		// 회원1에 대한 정보 확인
		// 회원가입 객체 생성
		Join member1 = new Join();
		
		// 필수가 없음
		member1.memberId = "do0_nct";
		member1.memberName = "김도영";
		member1.phoneNo = "010-1996-0201";
		member1.memberInfo();
		
		Join member2 = new Join();
		
		// 필수가 없음
		member2.memberId = "_jeongjaehyun";
		member2.memberName = "정재현";
		member2.memberInfo();
		
		// 회원가입 할 때 필수로 작성해야하는 필수 작성이 생김
		// 회원번호 아이디 이름 핸드폰번호
		Join member3 = new Join(3, "sugaringcandy","김정우","010-1998-0219");
		member3.memberInfo();
		
		// member4 member5 회원가입 시킴
		// member4 기본 생성자 가지고 회원가입 시키기
		// 멤버번호 멤버 이름 memberInfo() member4
		// 4 블랙아담
		Join member4 = new Join();
		member4.memberNo = 4;
		member4.memberId = "블랙아담";
		member4.memberInfo();
		
		// member5 필수 생성자 가지고 회원가입 시키기
		// member5 info()
		// 5 "슈퍼맨" "딘 케인" "010-1938-1932"
		Join member5 = new Join(5, "슈퍼맨", "딘 케인", "010-1938-1932");
		member5.memberInfo();
		
	}

}
