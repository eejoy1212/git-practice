package com.tj.lwh;

import java.util.Random;
import java.util.Scanner;

public class Chap04_03 {
public static void main(String[] args) {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("���ڸ��߱� ���� ����!\n10����99������ ���ڸ� ��� ���߼���.");
	int input=0;
	int random = 10+rd.nextInt(90);
	do {
		System.out.print("� �����ϱ�?:");
		input = sc.nextInt();
		if(input<random)
		{
			System.out.println("�� ū �����Դϴ�.");
		}
		else if(input>random)
		{
			System.out.println("�� ���� �����Դϴ�.");
		}
	}while(input!=random);
	System.out.println("�����Դϴ�.");
}
}
