package basic100;

import java.util.Scanner;

public class test02_2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		String[] array_word; //��Ʈ���� ���� �迭 
		
		array_word = s.split(""); // �迭�� �ѱ��ھ� �����ϱ� 
		for(int i=0; i <=array_word.length; i++) {
			//System.out.println(array_word[i]);
		}
		
		
		char[] arr_char = new char[array_word.length];
		for(int j=0; j <array_word.length; j++) {
			arr_char[j] = s.charAt(j); //�ε����� ���ڿ��� ��ȯ
			System.out.println(arr_char[j]);
		}
	}
}
