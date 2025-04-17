package com.javaex.practice;

public class Ex21 {

	public static void main(String[] args) {
		
		int i = 10;
		int n = ++i%2;
		
		System.out.println(i); //11
		System.out.println(n); //1 20번과 다르게 ++이 앞에있어서 1증가 후 대입이 되엇다
	}
}
