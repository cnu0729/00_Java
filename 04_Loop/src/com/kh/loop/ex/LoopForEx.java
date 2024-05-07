package com.kh.loop.ex;

import java.util.Random;
import java.util.Scanner;

public class LoopForEx {
	//기본 메서드
	
	// LoopForEx 에서 출력하길 원한다면
	// public static void guguDan 으로 static을 추가해준 다음에
	// public static void main(String[] args) {
	// 	guguDan();
	// }
	
	// static을 붙이지 않고 출력하길 원한다면
	// 출력용 클래스를 만들어서 출력하기 LoopForRun
	// 종료를 하기 전까지 반복해서 출력
	public void guguDan() {
		//사용자로부터 숫자를 입력받고 숫자에 해당하는 구구단을 출력하기
		Scanner sc = new Scanner(System.in);
		System.out.println("구구단 세계로 오신 것을 환영합니다.");
		
		// 구구단을 0을 입력하기 전까지 반복해서 출력하기
		// 반복하기 위해 while문 사용
		
		while(true) {
			System.out.println("프로그램 종료를 원하면 0을 입력해주세요.");
			System.out.print("원하는 수를 입력해주세요 : ");
			int dan = sc.nextInt();
			
			// 만약에 숫자 0이 들어오면 프로그램 종료하기
			if (dan==0) {
				System.out.println("프로그램을 종료합니다.");
				break;
			}
			
			// 받은 수를 for문 이용해서 출력
			for (int i = 1; i <= 9; i++) {
				System.out.println(dan + "단: " +dan+ " * " +i+ " = " + (dan * i));
			}
		
		}
	}

	public void guguDan2() {
		/*
		 1. 스캐너로 구구단 값 입력 받기
		 2. int dan = sc.nextInt();
		 3. for문을 활용해서 9번부터 1번까지 출력하기
		 	for (int a = 1; 조건 ; a--) {
		 		System.out.println(거꾸로출력하기);
		 	}
		 4. 종료를 원할 경우 0을 입력해주면 종료하기 while문 추가하기
		*/
		
		Scanner sc = new Scanner(System.in);
		System.out.println("거꾸로 구구단 세계로 오신 것을 환영합니다@.@");
		
		while(true) {
			System.out.println("프로그램 종료를 원하면 0을 입력해주세요.");
			System.out.print("원하는 수를 입력해주세요 : ");
			int dan = sc.nextInt();
			
			if (dan == 0) {
				System.out.println("프로그램을 종료합니다");
				break; // for while switch 사용 가능 if 단독 불가능 -> while 사용
			}
			
			//continue 자주 사용되지 않음
			//if 1~9 까지만 입력 가능하도록 조건
			if (dan<1 || dan>9) {
				System.out.println("1부터 9까지의 숫자를 입력해주세요.");
				continue; // 건너뛰고 계속하기
			}
			for (int a=9; a>=1; a--) {
				System.out.println(dan + "단: " +dan+ " * " +a+ " = " + (dan * a));
			}
		}
	}

	/*
	 구구단을 1단부터 9단까지 모두 출력 
	*/
	public void guguDan3() {
		// int dan = 원하는 단만 지정해서 출력
		for (int dan = 1; dan <= 9; dan++) {
			System.out.println("*** " + dan + "단 ***");
		// 1단에서부터 1~9를 곱해준 값을 출력
			for (int i = 1; i <= 9; i++) {
				
				System.out.println(dan+ "*" +i+ "=" + (dan * i));
				
			}
		}
	}
	
	// 구구단을 2단부터 9단까지 출력
/*
 for (int 단=2; 단<=9; 단++) {
 	System.out.println("====" +단+ "====");
 	
 	for (int 숫자 = 1; 숫자 <= 9; 숫자++) {
 	
 		System.out.println(단 +"*"+ 숫자 +"="+ (단*숫자));
 		
 	}
 }
*/
	public void guguDan4() {
		
		for (int dan = 2; dan <= 9; dan++) {
			System.out.println("~~~" +dan+ "단~~~");
			
			for (int i=1; i<=9; i++) {
				System.out.println(dan+ "*" +i+ "=" + (dan * i));
			}
		}
	}
	
	/*
	 10개의 숫자 랜덤으로 출력하기
	*/
	public void randomNumber() {
		// Random 불러와 내가 지정한 범위에서 숫자를 랜덤으로 출력하기
		Random 랜덤 = new Random(); //로또 번호 생성
		//nextInt() 안에 숫자를 넣어서 어디서부터 어디 사이에 랜덤으로 숫자가 나오는지 범위 지정할 수 있음
		int 랜덤숫자 = 랜덤.nextInt(5); // 0~5 사이에 숫자가 나옴
		// 숫자를 셀 때 코드 안에서는 -1 ~ 정수 양수 0 부터 시작
		// 랜덤으로 지정한 숫자 -1
		System.out.println("랜덤숫자 : " +랜덤숫자);
		
	}
	
	// 랜덤으로 숫자 3개 출력하기 1~10 사이의 숫자
	public void randomFor() {
		
		// Random 호출
		Random ran = new Random();
		
		// 랜덤숫자 3개 출력 1~10 사이의 숫자
		for (int num = 1; num <= 3; num++) {
			
			// 랜덤으로 숫자 만들어주기
			//							10을 적어주면 0~9
			//							10 + 1    1~10
			int randomNumber = ran.nextInt(10) + 1;
			System.out.println("랜덤숫자 : " +randomNumber);
		}
	}
	
	
	/*
	 public void radomFor2() {
	 
	 	// 랜덤으로 1 ~ 45 번호 6자리를 for문 출력
	 
	 } 
	 
	*/
	
	public void randomFor2() {
		Random ran = new Random();
		
		for (int i = 1; i <= 6; i++) {
			
			int randomNumber = ran.nextInt(45) + 1;
			System.out.println("랜덤추첨번호"+ "(" +i+ ")"+ ": " +randomNumber);
			
		}
	}
	
	/*
	 홀수 : odd
	 1~10까지의 숫자 중에서 홀수만 출력하기
	*/
	public void oddNum() {
		
		for (int num = 1; num <= 10; num++) {
			// 만약에 숫자가 홀수라면 출력하기
			if (num % 2 != 0) {
				System.out.println(num);
			}
		}
		
	}
	
	public void evenNum() {
		
		for (int num = 1; num <= 10; num++) {
			// 만약에 숫자가 짝수라면 출력하기
			if (num % 2 == 0) {
				System.out.println(num);
			}
		}
		
	}

	// 정사각형 모양의 별 출력
	public void squareStar() {
		int star = 3;
		for (int i = 0; i < star; i++) { //한줄출력 0 1 2
			
			for (int j = 0; j <star; j++) {
				System.out.print("* ");
			}
			System.out.println(); // 가로로 별을 출력한 다음 줄 바꿈
		}
	}
	
	
	// 정사각형 모양의 별 출력 가로로 5개씩 출력
	public void fivestar() {
		int star = 5;
		for (int i = 0; i < star; i++) {
			
			for (int j = 0; j < star; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}

	}
	
	//LoopForEx.java
	public void numberGame() {
		// 랜덤으로 만들어진 숫자가 무엇인지 키보드로 맞추는 게임
		// 숫자를 맞출 떄까지 계속 문제를 풀도록 하기
		// if문 수정해서 숫자값이 정답보다 작으면 숫자가 작습니다.
		// hint 숫자값이 정ㄷ바보다 높으면 숫자가 너무 큽니다.
		Scanner sc = new Scanner(System.in);
		
		// 랜덤으로 숫자 만들기
		Random random = new Random();
		
		while(true) {
			int randomNumber = random.nextInt(5) + 1; // 1 ~ 5
			System.out.println("숫자를 맞춰보세요!!!");
			
			// 공격을 몇번까지 허용할 것인가? 공격을 두번만 허용한다.
			for (int attack = 1; attack <= 2 ; attack++) {
				System.out.print("공격을 " +attack+ " 회 시도합니다. (숫자 적기) : ");
				int guest = sc.nextInt(); // 게스트가 입력할 숫자 가져오기
				//for 을이용해서 횟수 제한 2회안에 맞춰라
				
				// 만약에 숫자를 맞췄다면 숫자를 맞췄습니다.
				if (guest == randomNumber) {
					System.out.println("축하합니다~!~!~! 숫자를 맞췄습니다 !!!");
					break;
				} else if (guest > randomNumber) {
					System.out.print("숫자를 틀렸습니다. ");
					System.out.println("숫자가 정답보다 큽니다.");
				} else if (guest < randomNumber) {
					System.out.print("숫자를 틀렸습니다. ");
					System.out.println("숫자가 정답보다 작습니다.");
				}
			}
			
		System.out.println("정답은 " +randomNumber+ "입니다.");
		System.out.print("게임을 다시 시작하시겠습니까? (1.Yes/2.No) : ");
		int playAgain = sc.nextInt();
		
		if (playAgain == 2) {
			System.out.println("게임을 종료합니다.");
			break;		
		}

		}		
	}
	
	public void 실습문제3() {
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.print("1이상의 숫자를 입력하세요 : ");
			int num = sc.nextInt();
			
			if (num < 1) {
				System.out.println("입력한 숫자가 1보다 작습니다.");
			} else {
				for (int i = num; i>=1; i--) {
					System.out.println(i);
				}
			}
			System.out.print("다시 진행하시겠습니까? (1.Yes/2.No) : ");
			int playAgain = sc.nextInt();
			
			if (playAgain == 2) {
				System.out.println("종료하겠습니다.");
				break;
			}
			
			
			
		}
		
	}


	
	
	
	
	
}





















