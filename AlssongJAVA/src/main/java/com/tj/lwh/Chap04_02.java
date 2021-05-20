package com.tj.lwh;

import java.util.Scanner;

public class Chap04_02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	do
	{
		System.out.print("세 자리의 정숫값:");
		num = sc.nextInt();
	}while(num<100||num>999);
	System.out.println("입력한 값은 "+num+"입니다.");
}
}
