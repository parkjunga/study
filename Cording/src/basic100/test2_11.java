package basic100;

import java.util.Scanner;

public class test2_11 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//int n = sc.nextInt();
		//1047 : [����-��Ʈ����Ʈ����] ���� 1�� �Է¹޾� 2�� ���� ����ϱ�(����)
		/*System.out.println("��Ʈ����Ʈ4�� ");
		System.out.println(n<<2);
		System.out.println("��Ʈ����Ʈ���������� ");
		System.out.println(n>>1);
		System.out.println("��Ʈ����Ʈ 2�谪");
		System.out.println(n<<1); */
		// 1048 : [����-��Ʈ����Ʈ����] �� ���� 2�� �ŵ����� ��� ����ϱ�(����)
		/*
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		System.out.printf("%.0f",Math.pow(a, b));
		*/
		//1049 : [����-�񱳿���] �� ���� �Է¹޾� ���ϱ�1(����)
		int testN1 = sc.nextInt();
		int testN2 = sc.nextInt();
		
		/*
		if (testN1 > testN2 ) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		*/
		
		//1050 : [����-�񱳿���] �� ���� �Է¹޾� ���ϱ�2(����)
		
		if (testN1 == testN2) {
			System.out.println(1);
		} else {
			System.out.println(0);
		}
		
	}
}
