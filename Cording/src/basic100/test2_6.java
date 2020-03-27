package basic100;

import java.util.Scanner;

public class test2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1031 : [기초-출력변환] 10진 정수 1개 입력받아 8진수로 출력하기(설명),
		//1033 : [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기2(설명)
		int data =sc.nextInt();
		System.out.println("10진수 값 =>" + data);
		String octal = Integer.toOctalString(data);
		//System.out.println("8진수로 변환하면? " + octal);
		//1032 : [기초-출력변환] 10진 정수 입력받아 16진수로 출력하기1(설명)
		String hexString = Integer.toHexString(data);
		System.out.println("16진수 변환하면 =>" + hexString);
		
	}

}
