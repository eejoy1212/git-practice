package com.tj.lwh;

import java.util.Random;
import java.util.Scanner;

public class Chap3_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("��ǻ�Ͱ� �� ��:");
		int rsp = rd.nextInt(3);
		switch(rsp)
		{
		case 0: System.out.println("����"); break;
		case 1: System.out.println("����"); break;
		case 2: System.out.println("��"); break;
		}
	}
		
}
