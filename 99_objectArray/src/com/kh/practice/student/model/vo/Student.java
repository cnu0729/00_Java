package com.kh.practice.student.model.vo;

public class Student {
	/*
	 * Student 클래스를 작성하고 관리 클래스에서 Student 객체를 다섯 개 생성하여 각 점수의 합, 평균, 시험 결과를 실행 클래스에서
	 * 실행한다.
	 */
//필드
	// 이름 과목 점수
	private String name;
	private String subject;
	private int score;
	private boolean passed; //합격여부 boolean 최초 값이 false

	public boolean isPassed() {
		return passed;
	}

	public void setPassed(boolean passed) {
		this.passed = passed;
	}

	//메서드
	// Setter
	public void setName(String name) {
		this.name = name;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public void setScore(int score) {
		this.score = score;
	}

	// Getter
	public String getName() {
		return name;
	}

	public String getSubject() {
		return subject;
	}

	public int getScore() {
		return score;
	}

	// 생성자 : 기본
	public Student() {
		
	}

	// 생성자 : 필수
	public Student(String name, String subject, int score) {
		this.name = name;
		this.subject = subject;
		this.score = score;
	}
	// 자동정렬 단축키 : ctrl + shift + f
	// return String inform()

	public String inform() { //Student 클래스의 모든 필드 값들을 합쳐 반환
		return "이름:" + name + ", 과목:" + subject + ", 점수:" + score;
	}

}
