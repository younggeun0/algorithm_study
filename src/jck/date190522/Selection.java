package jck.date190522;

import java.util.Arrays;
import java.util.Scanner;

public class Selection {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int[] input = new int[10];
		
		for(int i=0; i<10; i++) {
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
			
			temp = input[i];
			input[i] = input[min_idx];
			input[min_idx] = temp;
		}
		
		System.out.println(Arrays.toString(input));
	}
}
