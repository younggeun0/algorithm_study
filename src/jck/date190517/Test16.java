package jck.date190517;

import java.util.Scanner;

public class Test16 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int sum = 0;

		int j = 0;
		for(int i=2; i<=n; i++) {
			for(j=2; j<=i; j++) {
				if (i % j == 0) {
					break;
				}
			}
			
			if (i == j) {
				System.out.println("¼Ò¼ö : "+j);
				sum += j;
			}
		}
		
		
		System.out.println(sum);
	}
}
