package com.kh.example.practice6.model.vo;

public class Book {
	
	public String title;
	public String publisher;
	public String author;
	public int price;
	public double discountRate;
	
	// 생성자
	// 1. 기본생성자
	public Book() {
		
	}
	
	// 2. 필수생성자 필수로 매개변수를 넣어줘야 하는 생성자
	// title publisher author
	public Book(String title, String publisher, String author) {
	this.title = title;
	this.publisher = publisher;
	this.author = author;
	}
	
	public Book(String title, String publisher, String author, 
				int price, double discountRate) {
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.price = price;
		this.discountRate = discountRate;
	}
	
	
	public void BookInfo() {
		System.out.println("제목: " +title);
		System.out.println("출판사: " +publisher);
		System.out.println("작가: " +author);
		System.out.println("가격: " +price);
		System.out.println("할인율: " +discountRate);
		System.out.println("------------------------------");
	}
	
}
