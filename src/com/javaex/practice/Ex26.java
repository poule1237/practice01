package com.javaex.practice;

import java.util.Scanner;

public class Ex26 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("월급을 입력하세요");
		int money = sc.nextInt();
		
		int monthlysalar = money * 120;
		
		System.out.println("10년동안 최대 저축액은 " + monthlysalar + "원 입니다");
	}
}
