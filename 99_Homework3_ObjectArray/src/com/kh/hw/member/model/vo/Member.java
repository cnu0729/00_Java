package com.kh.hw.member.model.vo;
/*
+Member() 기본 생성자
+Member(id:String, name:String, password:String, 
email:String, gender:char, age:int) 6개의 초기값을 받는 매개변수
있는 생성자

+getXXX() 필드의 값을 리턴하는 메소드
+setXXX() 필드의 값을 초기화/변경하는 메소드

+inform():String Member 클래스의 모든 필드값들을 합쳐 반환
*/
public class Member {
	private String id;
	private String name;
	private String password;
	private String email;
	private char gender;
	private int age;
	
//메소드
	//setter
	public void setId(String id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	//getter
	public String getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getPassword() {
		return password;
	}

	public String getEmail() {
		return email;
	}

	public char getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}
	
	// 생성자 : 기본
	public Member() {
		
	}
	// 생성자 : 필수
	public Member(String id, String name, String password, 
			String email, char gender, int age) {
		this.id = id;
		this.name = name;
		this.password = password;
		this.email = email;
		this.gender = gender;
		this.age = age;
	}
	/*
	public String inform() {
	}
	*/
	
}
