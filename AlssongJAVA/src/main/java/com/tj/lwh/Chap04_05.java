package com.tj.lwh;

import java.util.Scanner;

public class Chap04_05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("카운트다운 합니다.");
	
	int x = 0;
	do
	{
		System.out.print("양의 정숫값:");
		x = sc.nextInt();
	}while(x<=0);
	
	while(x>=0)
	{
		System.out.println(x--);
	}
	System.out.println("x의 값이"+x+"이 됐습니다.");
}
}
