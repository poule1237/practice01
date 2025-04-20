package com.javaex.practice;

import java.util.Scanner;

public class Ex32 {

	public static void main(String[] args) {
		
	Scanner scanner = new Scanner(System.in);	
	
	double width, height, area;
	
	System.out.print("가로: ");
    width = scanner.nextDouble();

    System.out.print("세로: ");
    height = scanner.nextDouble();
    
    area = (width * height) / 2;
    
    System.out.println("삼각형의 넓이는" + area + "입니다");
	
    
    scanner.close();
	}
        
	
}
