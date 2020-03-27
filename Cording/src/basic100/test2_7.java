package basic100;

import java.util.Scanner;

public class test2_7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//1034 : [기초-출력변환] 8진 정수 1개 입력받아 10진수로 출력하기(설명)
		String data = sc.nextLine();
		System.out.println("8진수를 입력받아버렷!" + data);
		int n = Integer.valueOf(data, 8); // 10진수로 변환
		System.out.println("변환 =>" + n);
		//1035 : [기초-출력변환] 16진 정수 1개 입력받아 8진수로 출력하기(설명)
		int hexN = Integer.valueOf(data,16);
		System.out.println("16진수를 변환행 =>" + hexN);
		*/
		//1036 : [기초-출력변환] 영문자 1개 입력받아 10진수로 출력하기(설명)
		/*char nd = sc.nextLine().charAt(0);
		System.out.println("영문자 아스키코드값 " + nd);
		int alpa = (int)nd;
		System.out.println("변환한 숫자값" + alpa); */
		// 반대의경우
		int test = sc.nextInt();
		System.out.println("원래값 " + test);
		char testN = (char)test;
		System.out.println(testN);
		
	}
}
