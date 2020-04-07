package basic100;

import java.util.Scanner;

public class test69 {
	public static void main(String[] args) {
		//1069 : [기초-조건/선택실행구조] 평가 입력받아 다르게 출력하기(설명)
		/**
		 * 평가를 문자(A, B, C, D, ...)로 입력받아 내용을 다르게 출력해보자.
			
			평가 내용
			평가 : 내용
			A : best!!!
			B : good!!
			C : run!
			D : slowly~
			나머지 문자들 : what?
		 */
		Scanner sc = new Scanner(System.in);
		String ans = sc.nextLine();
		String ansTo = "";
		
			switch(ans) {
			case "A" :  ansTo =  "best!!!"; break;
			case "B" :  ansTo = "good!!"; break;
			case "C" : ansTo = "run!"; break;
			case "D" : ansTo = "slowly~"; break;
			} 
			System.out.println(ansTo);
	
	}
	
}