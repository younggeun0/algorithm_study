package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// 제곱근 이용, 임의의 정수를 입력 받아 소수인지 판별
public class algorithm15 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int j = 2;
		
		while(true) {
			// 입력된 수의 제곱근을 구해 제수를 이 제곱근까지 키우며 나눠떨어지면 소수아님
			// 나누어 떨어지지 않으면 소수.
			
			if(j <= Math.sqrt(input)) {
				if (input % j == 0) {
					System.out.println("소수 아님");
					break;
				} else {
					j++;
				}
			} else {
				System.out.println("소수");
				break;
			}
			
		}
	}

}
