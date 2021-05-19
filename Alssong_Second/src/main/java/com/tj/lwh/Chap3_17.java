package com.tj.lwh;

import java.util.Scanner;

public class Chap3_17 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("정수a:");
		int a = sc.nextInt();
		System.out.print("정수b:");
		int b = sc.nextInt();
		
		if(a==b)
		{
			System.out.println("두 값이 같습니다.");
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
					System.out.println("작은 값은 "+min+"입니다.");
					System.out.println("큰 값은 "+max+"입니다.");
				}
		}
}
