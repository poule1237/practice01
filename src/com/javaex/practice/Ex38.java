package com.javaex.practice;

	import java.util.Scanner;

	public class Ex38 {

		public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("전체 금액을 입력해주세요");
		int a = sc.nextInt();
		
		System.out.println("실제 지불 금액은 " + (a - (a % 1000)) + " 입니다.");
		
		sc.close();
		
	}

}
