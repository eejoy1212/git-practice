package com.tj.lwh;

import java.util.Scanner;

public class Chap04_04 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	System.out.print("정수A:");
	int lower = sc.nextInt();
	System.out.print("정수B:");
	int upper = sc.nextInt();
	if(lower>upper)
	{
		int t = lower;
		lower = upper;
		upper = t;
	}
	do
	{
		System.out.print((lower++)+" ");
		
	}while(lower<=upper);

}
}
