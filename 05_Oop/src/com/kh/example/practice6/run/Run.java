package com.kh.example.practice6.run;

import com.kh.example.practice6.model.vo.Book;

public class Run {

	public static void main(String[] args) {
		
		System.out.println("kh서점에 오신 것을 환영합니다.");

		Book book1 = new Book();
		book1.title = "그것이 알고싶다.";
		book1.publisher = "SBS";
		book1.author = "박진아";
		book1.BookInfo();
		
		Book book2 = new Book("5월 32일", "kh T반", "T반 단체일동");
		book2.BookInfo();
		
		Book book3 = new Book("Do it! 자바 프로그래밍 입문", "이지스퍼블리싱", "박응종",
				16500, 0.34);
		book3.BookInfo();
			
	}

}
