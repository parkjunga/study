package basic100;

import java.util.Scanner;

public class test2_12 {
	//1051 : [기초-비교연산] 두 정수 입력받아 비교하기3(설명)
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		float b = sc.nextFloat();
		
		if(a >= b) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
	}
}
