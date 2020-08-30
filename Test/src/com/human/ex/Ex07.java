package com.human.ex;

public class Ex07 {

	public static void main(String[] args) {
		//자연수 5이하의 수로 이루어진 배열을 오름차순으로 정렬
		
		int temp;
		int count[]=new int[5];
		int array[] = {1,3,2,4,3,2,5,3,1,2,
				3,4,4,3,5,1,2,3,5,2,
				3,1,4,3,5,1,2,1,1,1};
		for(int i=0; i<5; i++) {
			count[i]=0;
		}
		for(int i=0; i<30; i++ ) {
			count[array[i]-1]++;
		}
		for(int i=0; i<5; i++) {
			if(count[i] != 0) {
				for(int j=0; j<count[i]; j++) {
					System.out.print((i+1)+" ");
				}
			}
		}
		

	}

}
