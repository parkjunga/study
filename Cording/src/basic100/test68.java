
package basic100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test68 {
	public static void main(String[] args) {
		//1068 : [기초-조건/선택실행구조] 정수 1개 입력받아 평가 출력하기(설명)
		/**
		 * 평가 기준
			점수 범위 : 평가
			 90 ~ 100 : A
			 70 ~  89 : B
			 40 ~  69 : C
			  0 ~ 39 : D
			로 평가되어야 한다. 
		 */
		Scanner sc = new Scanner(System.in);
		int total = sc.nextInt();
		if ( 90 <= total || total >= 100) {
			System.out.println("A");
		} else if ( 70 <= total || total >= 89) {
			System.out.println("B");
		} else if (40 <= total || total >= 69) {
			System.out.println("C");
		} else if (0 <= total || total >= 39) {
			System.out.println("D");
		} else {
			System.out.println("성적잘못입력");
		}
	}
	
}


