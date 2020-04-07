package basic100;

import java.util.Scanner;

public class test63 {
	public static void main(String[] args) {
//		1063 : [기초-삼항연산] 두 정수 입력받아 큰 수 출력하기(설명)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a > b ? a : b ;
		System.out.println(c);
	}
}
