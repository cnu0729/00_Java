package com.kh.example.practice4.run;

import com.kh.example.practice4.model.vo.Student;

public class Run {

	public static void main(String[] args) {
		
		// 학생 객체 생성
		Student 학생1 = new Student();
		
		학생1.setName("홍길동");
		학생1.setGrade(3);
		학생1.setClassroom(2);
		학생1.setHeight(200.5);
		학생1.setGender('남'); //char -> ''
		
		// void information
		학생1.inforamtion();
	}

}
