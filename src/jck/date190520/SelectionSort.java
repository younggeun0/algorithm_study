package jck.date190520;

import java.util.Arrays;
import java.util.Scanner;

public class SelectionSort {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		int min = 0;
		int min_idx = 0;
		int temp = 0;
		
		for(int i=0; i<input.length; i++) {
			min = 999999;
			
			for(int j=i; j<input.length; j++) {
				if (input[j] < min) {
					min = input[j];
					min_idx = j;
				}
			}
			
			temp = input[min_idx];
			input[min_idx] = input[i];
			input[i] = temp;
		}
		
		System.out.println(Arrays.toString(input));
	}

}
