package basic_algorism;

import java.util.Stack;

public class Stacktest {
	
	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		stack.push(1);
		stack.push(2);
		stack.push(3);
		System.out.println("가장최근에 넣은값");
		System.out.println(stack.pop());
		stack.push(4);
		stack.push(5);
		System.out.println("가장 최근에 보관한값이지만 꺼내진 앖음");
		System.out.println(stack.peek());
		System.out.println(" 데이터를 보관한 순번 반환");
		System.out.println(stack.search(1));
		while(stack.empty() == false) {
			System.out.println("비어있을때까지");
			System.out.println(stack.pop());
		}
	
	}
}
