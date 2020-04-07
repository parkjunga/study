
package basic100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test66 {
	public static void main(String[] args) {
		//1066 : [기초-조건/선택실행구조] 정수 3개 입력받아 짝/홀 출력하기(설명)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b= sc.nextInt();
		int c= sc.nextInt();
		int[] arr= new int[3];
		arr[0] = a;
		arr[1] = b;
		arr[2] = c;
		for(int i=0; i<= arr.length-1; i++) {
			if(arr[i]%2 == 0) {
				System.out.println("짝수 =>" + arr[i]);
			} else {
				System.out.println("홀수 =>" + arr[i]);
			}
		}
	}
	
}
