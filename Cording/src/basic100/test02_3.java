package basic100;

import java.util.Scanner;

public class test02_3 {
	public static void main(String[] args) {
		//1028 : [����-��������] ���� 1�� �Է¹޾� �״�� ����ϱ�2(����)
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		try {
			int n = Integer.parseUnsignedInt(s);
			System.out.println(n);
		}catch(Exception e) {
			System.out.println("unsigned�� �ƴ�");
		}
		
	}
}
