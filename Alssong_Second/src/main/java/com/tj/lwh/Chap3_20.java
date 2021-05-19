package com.tj.lwh;

import java.util.Random;
import java.util.Scanner;

public class Chap3_20 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random rd = new Random();
		System.out.print("컴퓨터가 낸 것:");
		int rsp = rd.nextInt(3);
		switch(rsp)
		{
		case 0: System.out.println("가위"); break;
		case 1: System.out.println("바위"); break;
		case 2: System.out.println("보"); break;
		}
	}
		
}
