package day01;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// 입력받은 항까지 피보나치 수열의 합을 구하는 문제
public class algorithm12 implements Algorithm {

	@Override
	public void run() {

		int a = 1, b = 1, c, sum = 2, input, count = 2;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

		for(count = 3; count <= input; count++) {
			c = a + b;
			sum += c;
			a = b;
			b = c;
		}
		
		System.out.println(count-1 + " 번째 항까지의 합 = " + sum);
	}

}
