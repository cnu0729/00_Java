package com.kh.RunnablePre;
					//implements Runnable
public class 러너블연습 implements Runnable{
//필드 int 초;
	int 초;
	
//메서드
	//필수 생성자
	public 러너블연습(int 초) {
		this.초 = 초;
	}
	//void run() sleep 1000  1초 try catch this.초 +"스레드 시작" 스레드 종료 
	@Override
	public void run() {
		System.out.println(this.초 +"스레드 시작");
		try {
			
			Thread.sleep(3000);
		
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		
		}
		System.out.println(this.초 +"스레드 종료");
	}
}
