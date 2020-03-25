package basic100;

import java.util.Scanner;

public class test02_3 {
	public static void main(String[] args) {
		//1028 : [기초-데이터형] 정수 1개 입력받아 그대로 출력하기2(설명)
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try {
			int n = Integer.parseUnsignedInt(s);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println("unsigned가 아님");
		}
		
	}
}
