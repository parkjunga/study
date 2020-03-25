package basic100;

import java.util.Scanner;

public class test02_4 {
	public static void main(String[] args) {
		
		// 1029 : [기초-데이터형] 실수 1개 입력받아 그대로 출력하기2(설명)
		Scanner sc = new Scanner(System.in);
		float f = sc.nextFloat();
		//	if ( Float.MAX_VALUE < f ) {
					System.out.printf("실수 :%.11f\n",f);
		//	}
		
	}

}
