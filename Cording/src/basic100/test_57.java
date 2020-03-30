package basic100;

import java.util.Scanner;

public class test_57 {
	public static void main(String[] args) {
		//1057 : [기초-논리연산] 참/거짓이 서로 같을 때에만 참 출력하기
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if ((a == 1 && b == 1) || ( a == 0 && b == 0)) {
			System.out.println("참");
		}
	}
}
