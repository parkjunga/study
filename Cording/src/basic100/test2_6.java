package basic100;

import java.util.Scanner;

public class test2_6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//1031 : [����-��º�ȯ] 10�� ���� 1�� �Է¹޾� 8������ ����ϱ�(����),
		//1033 : [����-��º�ȯ] 10�� ���� �Է¹޾� 16������ ����ϱ�2(����)
		int data =sc.nextInt();
		System.out.println("10���� �� =>" + data);
		String octal = Integer.toOctalString(data);
		//System.out.println("8������ ��ȯ�ϸ�? " + octal);
		//1032 : [����-��º�ȯ] 10�� ���� �Է¹޾� 16������ ����ϱ�1(����)
		String hexString = Integer.toHexString(data);
		System.out.println("16���� ��ȯ�ϸ� =>" + hexString);
		
	}

}
