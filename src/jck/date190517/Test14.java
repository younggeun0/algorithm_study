package jck.date190517;

import java.util.Scanner;

public class Test14 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 2;
		
		for(; i<=n; i++) {
			if (n % i == 0) {
				break;
			}
		}
		
		if (n == i) {
			System.out.println("소수");
		} else {
			System.out.println("소수가 아닙니다");
		}
	}
}
