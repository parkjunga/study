package basic100;

import java.util.Scanner;

public class test2_10 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1044 : [����-�������] ���� 1�� �Է¹޾� 1 ���� ����ϱ�(����)
		/*int testN = sc.nextInt();
		testN ++;
		System.out.println("���������� �׽�Ʈ =" + testN);
		 */
		
		//1045 : [����-�������] ���� 2�� �Է¹޾� �ڵ� ����ϱ�
		/*
		int testN = sc.nextInt();
		int testN2 = sc.nextInt();
		System.out.println(testN-testN2);
		System.out.println(testN*testN2);
		System.out.println(testN/testN2);
		System.out.println(testN+testN2);
		*/
		//1046 : [����-�������] ���� 3�� �Է¹޾� �հ� ��� ����ϱ�
		int fN = sc.nextInt();
		int tN = sc.nextInt();
		int thrN = sc.nextInt();
		int sum = fN + tN + thrN;
		System.out.println(sum);
		System.out.println((float)sum/3);
	}
}
