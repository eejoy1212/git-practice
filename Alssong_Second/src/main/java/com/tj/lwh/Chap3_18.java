package com.tj.lwh;

import java.util.Scanner;

public class Chap3_18 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수a:");
	int a = sc.nextInt();
	System.out.print("정수b:");
	int b = sc.nextInt();
	int upper = 0;
	int lower = 0;
	if(a<b)
	{
		upper = b;
		lower = a;
		System.out.println("a>=b가 되도록 정렬했습니다.");
		System.out.println("변수 a는 "+upper+"입니다.");
		System.out.println("변수 b는 "+lower+"입니다.");
	}
	else
	{
		System.out.println("이미 a>=b 입니다."
				+ "변수 a는 "+a+"입니다."
						+ "변수 b는 "+b+"입니다.");
		
	}
}
}
