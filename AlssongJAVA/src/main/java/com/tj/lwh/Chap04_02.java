package com.tj.lwh;

import java.util.Scanner;

public class Chap04_02 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int num = 0;
	do
	{
		System.out.print("�� �ڸ��� ������:");
		num = sc.nextInt();
	}while(num<100||num>999);
	System.out.println("�Է��� ���� "+num+"�Դϴ�.");
}
}
