package com.tj.lwh;

import java.util.Scanner;

public class Chap04_01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int retry=0;
	
	do 
	{
		System.out.print("정숫값:");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("이 값은 양수입니다.");
		}
		else if(num<0)
		{
			System.out.println("이 값은 음수입니다.");
		}
		else
		{
			System.out.println("이 값은 0입니다.");
		}
		System.out.print("다시한번? 1-Yes / 0-No:");
		retry = sc.nextInt();
	}
	while(retry==1);
}
	
}
