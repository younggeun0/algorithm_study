package jck.date190519;

import java.util.Arrays;
import java.util.Scanner;

public class Test23 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		
		for(int i=0; i<10; i++) {
			System.out.print("입력해주세요["+i+"] : ");
			input[i] = sc.nextInt();
		}

		System.out.println(Arrays.toString(input));
		
		int min = 0;
		int minIdx = 0;
		int temp = 0;
		for(int i=0; i<input.length; i++) {
			min = 9999999;
			// 최저값을 갖는 녀석과 교환을 수행
			for(int j=i; j<input.length; j++) {
				if (input[j] < min) {
					min = input[j];
					minIdx = j;
				}
			}
			
			temp = input[minIdx];
			input[minIdx] = input[i];
			input[i] = temp;
		}
		
		System.out.println(Arrays.toString(input));
	}
}
