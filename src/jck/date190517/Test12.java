package jck.date190517;

import java.util.Scanner;

public class Test12 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int a=1, b=1, c=0;
		int sum = 2;
		
		int n = sc.nextInt();
		
		for(int i=3; i <= n; i++) {
			c = a + b;
			System.out.println(c);
			
			sum += c;
			
			a = b;
			b = c;
		}
		
		System.out.println(sum);
	}

}
