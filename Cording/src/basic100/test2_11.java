package basic100;

import java.util.Scanner;

public class test2_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//1047 : [기초-비트시프트연산] 정수 1개 입력받아 2배 곱해 출력하기(설명)
		/*System.out.println("비트시프트4배 ");
		System.out.println(n<<2);
		System.out.println("비트시프트반으로줄임 ");
		System.out.println(n>>1);
		System.out.println("비트시프트 2배값");
		System.out.println(n<<1); */
		// 1048 : [기초-비트시프트연산] 한 번에 2의 거듭제곱 배로 출력하기(설명)
		/*
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.printf("%.0f",Math.pow(a, b));
		*/
		//1049 : [기초-비교연산] 두 정수 입력받아 비교하기1(설명)
		int testN1 = sc.nextInt();
		int testN2 = sc.nextInt();
		
		/*
		if (testN1 > testN2 ) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		*/
		
		//1050 : [기초-비교연산] 두 정수 입력받아 비교하기2(설명)
		
		if (testN1 == testN2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
}
