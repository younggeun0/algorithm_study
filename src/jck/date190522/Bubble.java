package jck.date190522;

import java.util.Arrays;
import java.util.Scanner;

public class Bubble {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		
		for(int i=0; i<10; i++) {
			input[i] = sc.nextInt();
		}
		
		int temp = 0;
		for(int i=0; i<input.length-1; i++) {
			for(int j=i+1; j<input.length; j++) {
				if (input[i] > input[j]) {
					temp = input[i];
					input[i] = input[j];
					input[j] = temp;
				}
			}
		}
		
		System.out.println(Arrays.toString(input));
	}

}
