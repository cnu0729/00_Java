package com.kh.javaAPIEx;

public class StringPre {

	public static void main(String[] args) {
		
		//subString 메서드를 사용해서 문자열의 일부를 추출 Today
		String 문제1 = "Today is a beautiful day.";
		String 서브스트링1 = 문제1.substring(0, 5);
		System.out.println(서브스트링1);
		
		//toUpperCase 메서드를 사용해서 모두 대문자로 변환
		String 문제2 = "Programming is fun and challenging";
		String 대문자 = 문제2.toUpperCase();
		System.out.println(대문자);
		
		//toLowerCase 메서드를 사용해서 모두 소문자로 변환
		String 문제3 = "Learning new things is exciting";
		String 소문자 = 문제3.toLowerCase();
		System.out.println(소문자);
		
		//split 활용해서 문자열을 " "로 구분하기
		String 문제4 = "A good medicine tastes bitter";
		String[] 문장 = 문제4.split(",");
		for(String 문제:문장) {
			System.out.println(문제);
		}
		
		//replace 활용해서 more를 less로 변환
		String 문제5 = "The more, the better";
		String 변경 = 문제5.replace("more", "less");
		System.out.println(변경);
		
		//charAt 사용해서 6번째 글자를 가져오기
		String 문제6 = "Walls have ears";
		char ch = 문제6.charAt(6);
		System.out.println(ch);
		
		//subString 메서드를 사용해서 his부터 끝까지 추출
		String 문제7 = "Every dog has his day";
		String 서브스트림2 = 문제7.substring(14);
		System.out.println(서브스트림2);
	}

}
