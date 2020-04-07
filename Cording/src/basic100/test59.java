package basic100;

import java.util.Scanner;

public class test59 {
	public static void main(String[] args) {
		//1059 : [기초-비트단위논리연산] 비트단위로 NOT 하여 출력하기(설명)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(~a&b);
		
	}
}
