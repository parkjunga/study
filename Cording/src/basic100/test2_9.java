package basic100;

import java.util.Scanner;

public class test2_9 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1042 : [����-�������] ���� 2�� �Է¹޾� ���� �� ����ϱ�(����)
		// 1043 : [����-�������] ���� 2�� �Է¹޾� ���� ������ ����ϱ�(����)
		int fN = sc.nextInt();
		int tN = sc.nextInt();
		float test = fN%tN;
		System.out.printf("%.0f" ,test);
	}
}
