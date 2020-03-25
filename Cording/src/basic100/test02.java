package basic100;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
    	int n = 3; 
    	// 1010 : [기초-입출력] 정수 1개 입력받아 그대로 출력하기(설명)
    	//System.out.printf("%d", n);
    	
    	// 1011 : [기초-입출력] 문자 1개 입력받아 그대로 출력하기(설명)
    	char x = 'A';
    	//System.out.printf("%c", x);
    	
    	// 1012 : [기초-입출력] 실수 1개 입력받아 그대로 출력하기(설명)
    	float f = 0.12F;
    	//System.out.println(f);
    	//System.out.printf("%f",f);
    	
    	//1013 : [기초-입출력] 정수 2개 입력받아 그대로 출력하기(설명)
    	int a = 1;
    	int b = 2;
    	//System.out.printf("%d%d",a,b);
    	
    	
    	//1014 : [기초-입출력] 문자 2개 입력받아 순서 바꿔 출력하기(설명)
    	char test1 = 'A';
    	char test2 = 'B';
    	
    	//System.out.printf("%c %c", test2,test1);
    	//1015 : [기초-입출력] 실수 입력받아 둘째 자리까지 출력하기(설명)
    	Scanner s = new Scanner(System.in);
    	float ss = s.nextFloat();
    	System.out.printf("%.2f", ss);
    }
}
