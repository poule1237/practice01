package com.javaex.practice;

import java.util.Scanner;

public class Ex27 {

	public static void main(String[] args) {
		
		final double PI = 3.14;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("반지름을 입력하세요");
		
		double radius = sc.nextDouble();
		
		double area = PI * radius * radius;
		
		
		System.out.printf("원의 넓이는 %.2f " , area);
		
		sc.close();

	}
}
