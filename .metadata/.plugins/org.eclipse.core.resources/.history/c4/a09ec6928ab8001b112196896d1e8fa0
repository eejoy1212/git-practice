package com.tj.lwh;

import java.util.Scanner;

public class Chap3_16 {
public static void main(String[] args) {
	//중앙값 : 크기순으로 나열했을 때, 가운데에 있는 값
	Scanner sc = new Scanner(System.in);
	System.out.print("정수a:");
	int a = sc.nextInt();
	System.out.print("정수b:");
	int b = sc.nextInt();
	System.out.print("정수c:");
	int c = sc.nextInt();
	int med = 0;
	if(a>=b)
	{
		if(a<=c)
		{
			med = a;
		}
		else
		{
			med = b;
		}
	}
	else if(a>c)//a<b
	{
		med = a;
	}
	else if(b>c)//a<b && a<c
	{
		med = c;
	}
	else
	{
		med = b;
	}
	System.out.println("중앙값은 "+med+"입니다.");
}
}
