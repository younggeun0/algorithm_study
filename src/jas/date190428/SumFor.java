package jas.date190428;

import java.util.Scanner;

public class SumFor {
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("1���� n������ ���� ����");
		System.out.println("n�� �� : ");
		int n = stdIn.nextInt();
		
		int sum = 0;
		
		for (int i=1; i<=n; i++) {
			sum+=i;
		}
		
		System.out.println("1���� "+n+"������ ���� "+sum+"�Դϴ�.");
	}
}
