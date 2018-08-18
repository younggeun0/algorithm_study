package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;


// 소수 판별, 임의의 정수를 입력하여 소수를 판별
// 제수를 2로 두고 하나씩 키워서 나눠 떨어졌을 때 제수와 입력값이 같으면 소수
public class algorithm14 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int j = 2;
		
		while(input % j != 0) {
			j++;
		}
		
		if (input == j) {
			System.out.println("소수");
		} else {
			System.out.println("소수아님");
		}
		
	}

}
