package basic100;

import java.util.Scanner;

public class test_55 {
	public static void main(String[] args) {
		//1055 : [기초-논리연산] 하나라도 참이면 참 출력하기(설명)
	Scanner sc= new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		
		if((a == 1 && b== 1) || (a != 1 && b != 1)  ) {
			System.out.println("참");
		}
		
	}
}
