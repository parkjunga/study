package basic100;

import java.util.Scanner;

public class test2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1044 : [기초-산술연산] 정수 1개 입력받아 1 더해 출력하기(설명)
		/*int testN = sc.nextInt();
		testN ++;
		System.out.println("증감연산자 테스트 =" + testN);
		 */
		
		//1045 : [기초-산술연산] 정수 2개 입력받아 자동 계산하기
		/*
		int testN = sc.nextInt();
		int testN2 = sc.nextInt();
		System.out.println(testN-testN2);
		System.out.println(testN*testN2);
		System.out.println(testN/testN2);
		System.out.println(testN+testN2);
		*/
		//1046 : [기초-산술연산] 정수 3개 입력받아 합과 평균 출력하기
		int fN = sc.nextInt();
		int tN = sc.nextInt();
		int thrN = sc.nextInt();
		int sum = fN + tN + thrN;
		System.out.println(sum);
		System.out.println((float)sum/3);
	}
}
