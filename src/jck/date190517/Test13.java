package jck.date190517;

import java.util.Scanner;

public class Test13 {
	
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int i = 2;
		
		for(; i<n; i++) {
			if (n % i == 0) {
				System.out.println("�Ҽ��� �ƴմϴ�");
				break;
			}
		}
		
		if (i == n) {
			System.out.println("�Ҽ�");
		}
	}
}
