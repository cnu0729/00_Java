package com.kh.practice.token.view;

import java.util.Scanner;

import com.kh.practice.token.controller.TokenController;

public class TokenMenu {
/*
-sc:Scanner = new Scanner(System.in)
-tc:TokenController = new TokenController()
+mainMenu():void
+tokenMenu():void
+inputMenu():void
*/
	
	//1. 스캐너 만들기 완
	Scanner sc = new Scanner(System.in);
	TokenController tc = new TokenController();
	
	public void mainMenu() {
		inputMenu();
	}
	
	public void inputMenu() {
		//첫글자 대문자 //찾을 문자 입력하고 //찾을 문자 개수
	}
}
