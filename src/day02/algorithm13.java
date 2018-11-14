package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// 소수 판별, 임의의 정수를 입력 하여 소수를 판별
public class algorithm13 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int j = 2;
		
		while(true) {
			
			
			if(j < input) {
				// 소수는 1보다 크고 1과 자기자시만을 약수로 갖는 수.
				// 2부터 입력받은 수-1까지 커지는 제수로 나눠떨어지지 않으면 소수.
				
				if (input % j == 0) {
					System.out.println("소수가 아님");
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
