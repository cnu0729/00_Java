package com.kh.practice.Audition.model.vo;

public class Audition {
	private String name; //이름
	private String vlaue; //분야
	private int score; //점수
	private boolean passsed; //합격유무
	
	//setter
	public void setName(String name) {
		this.name = name;
	}
	public void setVlaue(String vlaue) {
		this.vlaue = vlaue;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setPasssed(boolean passsed) {
		this.passsed = passsed;
	}
	//getter
	public String getName() {
		return name;
	}
	public String getVlaue() {
		return vlaue;
	}
	public int getScore() {
		return score;
	}
	public boolean isPasssed() {
		return passsed;
	}
	
	//생성자
	public Audition() {
		
	}
	public Audition(String name, String vlaue, int score) {
		this.name = name;
		this.vlaue = vlaue;
		this.score = score;
	}

	public String inform() {
		return "이름: " +name+ " / 분야: " +vlaue+ " / 점수: " +score;
	}
	
}
