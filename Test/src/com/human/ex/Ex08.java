package com.human.ex;

import java.util.Stack;

public class Ex08 {

	public static void main(String[] args) {
		Stack<Integer> s=new Stack<Integer>();
		s.push(7);
		s.push(5);
		s.push(4);
		s.pop();
		s.push(6);
		s.pop();
		
		while(!s.empty()) {
			System.out.println(s.peek());
			s.pop();
		}

	}

}
