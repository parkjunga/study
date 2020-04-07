package basic100;

import java.util.Scanner;

public class test65 {
	public static void main(String[] args) {
		//1065 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝수만 출력하기(설명)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int[] arr = new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		for(int i = 1; i<= arr.length-1; i++) {
			if (arr[i]%2 == 0) {
				System.out.println(arr[i]);
			}
		}
	}
	
}