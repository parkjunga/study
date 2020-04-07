package basic100;

import java.util.Scanner;

public class test70 {
	public static void main(String[] args) {
		//1070 : [기초-조건/선택실행구조] 월 입력받아 계절 출력하기(설명)
		/**
		 * 월이 입력될 때 계절 이름이 출력되도록 해보자.
			예
			월 : 계절 이름
			12, 1, 2 : winter
			  3, 4, 5 : spring
			  6, 7, 8 : summer
			  9, 10, 11 : fall
			
			참고
			swtich( ).. case ... break; 제어문에서
			break;를 제거하면 멈추지 않고 다음 명령이 실행되는 특성을 이용할 수 있다.
		 */
		Scanner sc = new Scanner(System.in);
		String seasson = "";
		switch(sc.nextInt()) {
		case 12:
		case  1:
		case  2: 
			seasson = "winter"; break;	 
		case  3:
		case  7:
		case  8: 
			seasson = "spring"; break;
		case  9:
		case 10:
		case 11: 
			seasson = "fall"; break;
		}
		System.out.println(seasson);
	}
	
}




