package com.javaex.practice;

import java.util.Scanner;

public class Ex34 {

	 public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        double fahrenheit, celsius;
	        
	        System.out.print("화씨 : ");
	        fahrenheit = scanner.nextDouble();

	        
	        celsius = (5.0 / 9.0) * (fahrenheit - 32);

	        
	        System.out.println("화씨" + fahrenheit + "의 섭씨 온도는" + celsius + "입니다" );

	        scanner.close();
	    }
}
