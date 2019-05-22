package jck.date190522;

import java.util.Arrays;
import java.util.Scanner;

public class Insert {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int[] input = new int[10];
		
		for(int i=0; i<input.length; i++) {
			input[i] = sc.nextInt();
		}
		
		int key = 0;
		int j = 0;
		
		for(int i=1; i<input.length; i++) {
			key = input[i];
			
			for(j=i-1; j>=0; j--) {
				if(input[j] > key) {
					input[j+1] = input[j];
				} else {
					break;
				}
			}
			
			input[j+1] = key;
		}
		
		System.out.println(Arrays.toString(input));
		
		
	}

}
