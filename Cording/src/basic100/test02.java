package basic100;

import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
    	int n = 3; 
    	// 1010 : [����-�����] ���� 1�� �Է¹޾� �״�� ����ϱ�(����)
    	//System.out.printf("%d", n);
    	
    	// 1011 : [����-�����] ���� 1�� �Է¹޾� �״�� ����ϱ�(����)
    	char x = 'A';
    	//System.out.printf("%c", x);
    	
    	// 1012 : [����-�����] �Ǽ� 1�� �Է¹޾� �״�� ����ϱ�(����)
    	float f = 0.12F;
    	//System.out.println(f);
    	//System.out.printf("%f",f);
    	
    	//1013 : [����-�����] ���� 2�� �Է¹޾� �״�� ����ϱ�(����)
    	int a = 1;
    	int b = 2;
    	//System.out.printf("%d%d",a,b);
    	
    	
    	//1014 : [����-�����] ���� 2�� �Է¹޾� ���� �ٲ� ����ϱ�(����)
    	char test1 = 'A';
    	char test2 = 'B';
    	
    	//System.out.printf("%c %c", test2,test1);
    	//1015 : [����-�����] �Ǽ� �Է¹޾� ��° �ڸ����� ����ϱ�(����)
    	Scanner s = new Scanner(System.in);
    	float ss = s.nextFloat();
    	System.out.printf("%.2f", ss);
    }
}
