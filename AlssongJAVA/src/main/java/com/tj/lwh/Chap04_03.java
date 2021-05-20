package com.tj.lwh;

import java.util.Random;
import java.util.Scanner;

public class Chap04_03 {
public static void main(String[] args) {
	Random rd = new Random();
	Scanner sc = new Scanner(System.in);
	System.out.println("숫자맞추기 게임 시작!\n10부터99사이의 숫자를 모두 맞추세요.");
	int input=0;
	int random = 10+rd.nextInt(90);
	do {
		System.out.print("어떤 숫자일까?:");
		input = sc.nextInt();
		if(input<random)
		{
			System.out.println("더 큰 숫자입니다.");
		}
		else if(input>random)
		{
			System.out.println("더 작은 숫자입니다.");
		}
	}while(input!=random);
	System.out.println("정답입니다.");
}
}
