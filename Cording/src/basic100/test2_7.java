package basic100;

import java.util.Scanner;

public class test2_7 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		/*
		//1034 : [����-��º�ȯ] 8�� ���� 1�� �Է¹޾� 10������ ����ϱ�(����)
		String data = sc.nextLine();
		System.out.println("8������ �Է¹޾ƹ���!" + data);
		int n = Integer.valueOf(data, 8); // 10������ ��ȯ
		System.out.println("��ȯ =>" + n);
		//1035 : [����-��º�ȯ] 16�� ���� 1�� �Է¹޾� 8������ ����ϱ�(����)
		int hexN = Integer.valueOf(data,16);
		System.out.println("16������ ��ȯ�� =>" + hexN);
		*/
		//1036 : [����-��º�ȯ] ������ 1�� �Է¹޾� 10������ ����ϱ�(����)
		/*char nd = sc.nextLine().charAt(0);
		System.out.println("������ �ƽ�Ű�ڵ尪 " + nd);
		int alpa = (int)nd;
		System.out.println("��ȯ�� ���ڰ�" + alpa); */
		// �ݴ��ǰ��
		int test = sc.nextInt();
		System.out.println("������ " + test);
		char testN = (char)test;
		System.out.println(testN);
		
	}
}
