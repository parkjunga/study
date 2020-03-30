package basic100;

import java.util.Scanner;

public class test_58 {
	public static void main(String[] args) {
		//1058 : [기초-논리연산] 둘 다 거짓일 경우만 참 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if (!(a==1 && b== 1) || (a ==0 && b ==0)) {
			System.out.println("참");
		}
	}
}
