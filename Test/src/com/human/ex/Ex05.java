package com.human.ex;

import java.util.Arrays;

//퀵정렬
public class Ex05 {
	static int number=10;
	static int[] data= {1, 10, 5, 8, 7, 6, 4, 3, 2, 9};
	
	public static void quickSort(int[] data, int start, int end) {
		if(start>=end) {
			//원소가 1개인 경우
			return;
		}
		
		int key = start;//키는 첫번째 원소
		int i= start +1;
		int j=end;
		
		int temp;
		
		while(i<=j) {
			//엇갈릴 때까지 반복
			//내림차순은 key값 비교하는 부등호 방향만 바꿔주면 됨
			while(i<=end && data[i] <= data[key]) {//키값보다 큰 값을 만날때까지 오른쪽으로 이동
				i++;
			}
			while(data[j] >= data[key] && j> start) {//
				j--;
			}
			if(i>j) {
				//현재 엇갈린 상태면 키값과 교체
				temp=data[j];
				data[j]=data[key];
				data[key]=temp;
				
			}else {
				temp=data[j];
				data[j]=data[i];
				data[i]=temp;
			}
		}
		quickSort(data, start, j-1);
		quickSort(data, j + 1, end);
	}
	
	public static void main(String[] args) {
		quickSort(data, 0, number-1);
		System.out.println(Arrays.toString(data));
	}
}
