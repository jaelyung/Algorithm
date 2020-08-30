package com.human.ex;

import java.util.LinkedList;
import java.util.Vector;

public class Ex10 {
	
	int number=7;
	boolean[] c;
	Vector<Integer> a=new Vector<Integer>(number+1);

	public static void main(String[] args) {
		
				

	}
	
	public void bfs(int start) {
		LinkedList<Integer> qu =new LinkedList<Integer>();
		qu.add(start);
		c[start] = true;
		while(!qu.isEmpty()) {
			int x=qu.peek();
			qu.remove();
			System.out.print(x+" ");
			
		}
		
	}

}
