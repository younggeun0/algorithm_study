package jas.date190427;

import java.util.Scanner;

public class Median {
	
	static int med3(int a, int b, int c) {
		if (a >= b) { // 첫째 값이 두번째 값보다 크거나 같으면
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) { // 첫번째 값이 세번째 값보다 크면
			return a;
		} else if (b > c) { // 두번째 값이 세번째 값보다 크면
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("세 정수의 중앙값을 구합니다");
		System.out.print("a의 값 : ");
		int a = stdIn.nextInt();
		System.out.print("b의 값 : ");
		int b = stdIn.nextInt();
		System.out.println("c의 값 : ");
		int c = stdIn.nextInt();
		
		System.out.println("중앙값은 "+med3(a, b, c)+"입니다.");
		
	}

}
