package com.tj.lwh;

import java.util.Scanner;
//ascending order
public class Chap3_19 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수a:");
	int a = sc.nextInt();
	System.out.print("정수b:");
	int b = sc.nextInt();
	System.out.print("정수c:");
	int c = sc.nextInt();
	int t = 0;
	if(a>b)
	{
		t = a;
		a = b;
		b = t;
	}
	if(b>c)
	{
		t = b;
		b = c;
		c = t;
	}
	if(a>b)
	{
		t = a;
		a = b;
		b = t;
	}
	System.out.println("a<=b<=c가 되도록 정렬했습니다.");
	System.out.println("변수 a는 "+a+"입니다.");
	System.out.println("변수 b는 "+b+"입니다.");
	System.out.println("변수 c는 "+c+"입니다.");
}
}
