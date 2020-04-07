
package basic100;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class test67 {
	public static void main(String[] args) {
		//정수 1개가 입력되었을 때, 음(minus)/양(plus)과 짝(even)/홀(odd)을 출력해보자.
		Scanner sc = new Scanner(System.in);
		int a =sc.nextInt();
		String print = "";
		if (a < 0) {
			System.out.println("minus");
		} else {
			System.out.println("plus");
			
		}
		print = evenOdd(a);
		System.out.println(print);

	}
	
	public static String evenOdd(int num) {
		String print = "";
		if(num % 2 == 0) {
			return "짝수";
		} else {
			return "홀수";
		}
	}
	
}


