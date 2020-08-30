package com.human.ex;

import java.util.LinkedList;

public class Ex09 {

	public static void main(String[] args) {
		LinkedList<Integer> qu = new LinkedList<Integer>();
		qu.add(7);
		qu.add(5);
		qu.add(4);
		qu.remove();
		qu.add(6);
		qu.remove();
		
		while(!qu.isEmpty()) {
			System.out.println(qu.peek());
			qu.remove();
		}
		

	}

}
