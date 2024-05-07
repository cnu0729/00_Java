package com.kh.ThreadPre;
					// extends Thread
public class 스레드연습 extends Thread{
//필드 
	int 초;
//메서드
	//생성자 필수로 초가 들어가게 만듬
	public 스레드연습(int 초) {
		this.초 = 초;
	}
	//void run(){try catch 3초 대기하고  sysout 시작과 종료}
	public void run() {
		System.out.println(this.초 + " 스레드 시작ing...");
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(this.초 +" 스레드 종료ing...");
	}
}
