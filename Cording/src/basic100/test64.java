package basic100;

import java.util.Scanner;

public class test64 {
	public static void main(String[] args) {
		//1064 : [기초-삼항연산] 정수 3개 입력받아 가장 작은 수 출력하기(설명)
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int tmp = 0;
		int[] arr = new int[3];
		arr[0] = a;
		tmp = arr[0];
		arr[1] = b;
		arr[2] = c;
		for(int i = 1; i<= arr.length-1; i++) {
			if (tmp > arr[i]) {
				tmp = arr[i];
			}
		}
		System.out.println(tmp);
	}
	
}
