package basic100;

import java.util.Scanner;

public class test2_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1038 : [기초-산술연산] 정수 2개 입력받아 합 출력하기1(설명)
		// 1039 : [기초-산술연산] 정수 2개 입력받아 합 출력하기2(설명)
		/*int n = sc.nextInt();
		int pluseN = sc.nextInt();
		int sum = n+pluseN;
		System.out.printf("정수더하기값 %d " ,sum );
		*/
		//1040 : [기초-산술연산] 정수 1개 입력받아 부호 바꿔 출력하기(설명)
		/*int n = sc.nextInt();
		System.out.printf("부호바꾸기 => %d ",n);
		System.out.printf("부호바꾸기2 => %d ",-n);
		*/
		//1041 : [기초-산술연산] 문자 1개 입력받아 다음 문자 출력하기(설명)
		//char test = sc.nextLine().charAt(0);
/*		int t = (int)test +1;
		System.out.println("테스트" +test);
		System.out.println("result => " + t);
		*/
		int Ask = sc.nextInt() + 1;
		char askC = (char)Ask;
		System.out.println("원래값 " + Ask);
		System.out.println("다음값 " +  askC);
	}
}
