package com.tj.lwh;

import java.util.Scanner;

public class Chap3_16 {
public static void main(String[] args) {
	//�߾Ӱ� : ũ������� �������� ��, ����� �ִ� ��
	Scanner sc = new Scanner(System.in);
	System.out.print("����a:");
	int a = sc.nextInt();
	System.out.print("����b:");
	int b = sc.nextInt();
	System.out.print("����c:");
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
	System.out.println("�߾Ӱ��� "+med+"�Դϴ�.");
}
}
