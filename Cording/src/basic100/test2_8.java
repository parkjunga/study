package basic100;

import java.util.Scanner;

public class test2_8 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		//1038 : [����-�������] ���� 2�� �Է¹޾� �� ����ϱ�1(����)
		// 1039 : [����-�������] ���� 2�� �Է¹޾� �� ����ϱ�2(����)
		/*int n = sc.nextInt();
		int pluseN = sc.nextInt();
		int sum = n+pluseN;
		System.out.printf("�������ϱⰪ %d " ,sum );
		*/
		//1040 : [����-�������] ���� 1�� �Է¹޾� ��ȣ �ٲ� ����ϱ�(����)
		/*int n = sc.nextInt();
		System.out.printf("��ȣ�ٲٱ� => %d ",n);
		System.out.printf("��ȣ�ٲٱ�2 => %d ",-n);
		*/
		//1041 : [����-�������] ���� 1�� �Է¹޾� ���� ���� ����ϱ�(����)
		//char test = sc.nextLine().charAt(0);
/*		int t = (int)test +1;
		System.out.println("�׽�Ʈ" +test);
		System.out.println("result => " + t);
		*/
		int Ask = sc.nextInt() + 1;
		char askC = (char)Ask;
		System.out.println("������ " + Ask);
		System.out.println("������ " +  askC);
	}
}
