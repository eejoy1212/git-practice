package com.tj.lwh;

import java.util.Scanner;

public class Chap04_05 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in); 
	System.out.println("ī��Ʈ�ٿ� �մϴ�.");
	
	int x = 0;
	do
	{
		System.out.print("���� ������:");
		x = sc.nextInt();
	}while(x<=0);
	
	while(x>=0)
	{
		System.out.println(x--);
	}
	System.out.println("x�� ����"+x+"�� �ƽ��ϴ�.");
}
}
