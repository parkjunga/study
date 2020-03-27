package basic100;

import java.util.Scanner;

public class test2_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1042 : [기초-산술연산] 정수 2개 입력받아 나눈 몫 출력하기(설명)
		// 1043 : [기초-산술연산] 정수 2개 입력받아 나눈 나머지 출력하기(설명)
		int fN = sc.nextInt();
		int tN = sc.nextInt();
		float test = fN%tN;
		System.out.printf("%.0f" ,test);
	}
}
