package com.kh.practice.student.run;

import com.kh.practice.student.view.StudentMenu;
/*
Student 클래스를 작성하고 관리 클래스에서 Student 객체를 다섯 개 생성하여
각 점수의 합, 평균, 시험 결과를 실행 클래스에서 실행한다.
*/
public interface Run {
	//최종으로 학생 실행하기
	public static void main(String[] args) {
		StudentMenu sm = new StudentMenu();
		sm.printStudentMenu();
		
	}
}
