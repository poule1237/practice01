package com.javaex.practice;

public class Ex13 {

	public static void main(String[] args) {
		
		System.out.println(13/5); //1 13과5는 정수여서 2가 나온다.
		System.out.println((double)13/5); //2
		System.out.println(13/(double)5); //3
		System.out.println((double)13/(double)5); //4
		System.out.println(13.0/5); //5
		System.out.println(13/5.0); //6
		System.out.println((double)(13/5)); //7:13과5 둘다 정수이므로 2가 계산이되는데 더블로 형변환하여 2.0이 된것이다.		   

	}
}
