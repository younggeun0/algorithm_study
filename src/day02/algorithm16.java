package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// 소수의 합 구하기, 임의의 정수 입력 받아 그 안에 포함된 소수의 합을 구하기.
public class algorithm16 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int sum = 0;
		int k = 2; // 소수인지 판별할 숫자가 저장될 변수
		
		while(true) {
			
			int j = 2; // 소수인지 판별할 때 사용할 제수

			// 피제수가 나누어 떨어질때까지 제수를 키우고
			while(k % j != 0) {
				j++;
			}

			// 피제수랑 제수가 같으면 소수
			if (k == j) {
				System.out.println("소수 : " + k);
				sum += k;
			}
			
			// 입력값보다 피제수가 작으면 키워서 반복
			if (k < input) {
				k++;
			} else {
				System.out.println("소수의 합 : " + sum);
				break;
			}
		}
	}
}
