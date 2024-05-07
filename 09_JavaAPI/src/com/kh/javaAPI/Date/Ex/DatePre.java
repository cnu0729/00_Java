package com.kh.javaAPI.Date.Ex;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DatePre {

	public static void main(String[] args) {
		// SimpleDateFormat 활용해서 날짜 만들기

		
		//1. yyyy-MM-dd
		/*
		SimpleDateFormat 날짜형식 = new SimpleDateFormat("yyyy-MM-dd");
		String 날짜표시 = 날짜형식.format(new Date());
		  
		System.out.println("날짜형식 지정해서 표시하기 : " +날짜표시);
		*/
		
		SimpleDateFormat 날짜1 = new SimpleDateFormat("yyyy-MM-dd");
		Date date = new Date();
		String 글자로데이터변경 = 날짜1.format(date);
		System.out.println("현재 날짜 : " +글자로데이터변경);
		
		//2. HH:mm:ss
		/*
		SimpleDateFormat 날짜형식1 = new SimpleDateFormat("HH:mm:ss");
		String 날짜표시1 = 날짜형식1.format(new Date());
		  
		System.out.println("날짜형식 지정해서 표시하기 : " +날짜표시1);
		*/
		
		SimpleDateFormat 날짜2 = new SimpleDateFormat("HH:mm:ss");
		Date date2 = new Date();
		String 글자로데이터변경2 = 날짜2.format(date);
		System.out.println("현재 시간 : " +글자로데이터변경2);
		
		//3. yyyy-MM-dd HH:mm:ss
		
		/*SimpleDateFormat 날짜형식2 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String 날짜표시2 = 날짜형식2.format(new Date());
		  
		System.out.println("날짜형식 지정해서 표시하기 : " +날짜표시2);
		*/
		
		SimpleDateFormat 날짜3 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		Date date3 = new Date();
		String 글자로데이터변경3 = 날짜3.format(date);
		System.out.println("현재 : " +글자로데이터변경3);
		
		//4. 

	}

}
