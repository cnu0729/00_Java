package com.kh.example.pracrtice1.model.vo;

public class Member {
	public String memberId; 	//아이디
	public String memberPwd; 	// 비밀번호
	public String memberName; 	//이름
	public    int age; 			// 나이
	public   char gender; 		// 성별
	public String phone; 		// 핸드폰번호
	public String email; 		// 이메일
	
	// 생성자 메서드
	public Member() {
		
	}
	
	// 출력 메서드
	public void changeName(String name) {
		this.memberName = name;
		System.out.println("변경된 이름 : " +name);
	}
	
	/*
	// 값을 받아서 전달하는 메서드
	public String changeEmail(String 수정이메일) {
		this.email = 수정이메일;
		
		return email;
	
	}
	*/
	
	public void printName() {
		System.out.println("이름 : " +memberName);
	}
	// ctrl + s

	
	// 출력 메서드
	/*
		memberId : String
		memberPwd : String
		memberName : String
		age : int
		gender : char
		phone : String
		email : String
		+ Member()
		+ changeName(name:String):void
		+ printName():void
	*/
	
	
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

