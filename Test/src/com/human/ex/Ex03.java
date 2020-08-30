package com.human.ex;

import java.util.Arrays;

//버블정렬
public class Ex03 {
	
	public static void main(String[] args) {
		int i, j, temp;
		int[] array={1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
			
		for(i=0; i<10; i++) {
			for(j=0;j<9-i;j++) {
				if(array[j]>array[j+1]) {
					temp=array[j];
					array[j] = array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println(Arrays.toString(array));
	}
	
	
}
