package basic100;

import java.util.Scanner;

public class test_56 {
	public static void main(String[] args) {
		
		//1056 : [기초-논리연산] 참/거짓이 서로 다를 때에만 참 출력하기(설명)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		if(!(a ==1 && b == 1) || (a != 1 && b != 1)) {
		System.out.println("정답");
		}
	}
}
