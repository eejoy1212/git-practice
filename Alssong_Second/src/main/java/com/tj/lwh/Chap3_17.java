package com.tj.lwh;

import java.util.Scanner;

public class Chap3_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("����a:");
		int a = sc.nextInt();
		System.out.print("����b:");
		int b = sc.nextInt();
		
		if(a==b)
		{
			System.out.println("�� ���� �����ϴ�.");
		}
		else
		{
			int max = 0;
			int min = 0;
				if(a<b)
				{
					min=a;
					max=b;
				}
				else
				{
					min=b;
					max=a;
				}
					System.out.println("���� ���� "+min+"�Դϴ�.");
					System.out.println("ū ���� "+max+"�Դϴ�.");
				}
		}
}
