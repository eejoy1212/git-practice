package com.tj.lwh;

import java.util.Scanner;

public class Chap04_01 {
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	int retry=0;
	
	do 
	{
		System.out.print("������:");
		int num = sc.nextInt();
		
		if(num>0)
		{
			System.out.println("�� ���� ����Դϴ�.");
		}
		else if(num<0)
		{
			System.out.println("�� ���� �����Դϴ�.");
		}
		else
		{
			System.out.println("�� ���� 0�Դϴ�.");
		}
		System.out.print("�ٽ��ѹ�? 1-Yes / 0-No:");
		retry = sc.nextInt();
	}
	while(retry==1);
}
	
}
