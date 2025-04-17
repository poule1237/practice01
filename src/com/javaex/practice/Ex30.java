package com.javaex.practice;

import java.util.Scanner;

public class Ex30 {

	public static void main(String[] args) {
		final double mile = 1.609;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("마일을 입력하세요");
		
		int km = sc.nextInt();
		
		double a = mile * km;
		
		System.out.println("10.0마일은 " + a +"킬로미터 입니다.");
		
		System.out.print("마일을 입력하세요");
		
		int b = sc.nextInt();
		
		double c = mile * b;
		
		System.out.println("15.0마일은 " + c +"킬로미터 입니다.");
		
		
		
		
		sc.close();
	}
}
