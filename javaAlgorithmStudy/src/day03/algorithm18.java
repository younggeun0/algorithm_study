package day03;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// 두 수를 입력 받아 두 수의 최대공약수와 최소공배수를 계싼해서 출력
public class algorithm18 implements Algorithm {

	@Override
	public void run() {

		int input1, input2;
		int big, small;
		int mok, nmg;
		int gcd, lcm;	// 최대공약수, 최소공배수
		
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		
		System.out.println(input1 + "과 " + input2 + "가 입력되었습니다...");
		
		// 입력값을 비교해서 큰수, 작은수를 나눔
		if(input1 >= input2) {	
			big = input1;
			small = input2;
		} else {
			big = input2;
			small = input1;
		}
		
		while(true) {
			
			// 큰수/작은수 나머지가 0일 때 작은 수가 최대공약수
			nmg = big % small;
			
			if(nmg == 0) {
				// 나머지가 0 일 때 작은 수가 최대공약수(gcd)
				gcd = small;
				
				// 원래 입력값의 곱을 최대공약수로 나누면 최대공배수(lcm)을 구할 수 있음->유클리드 호제법
				lcm = input1*input2 / gcd;
				
				// 출력
				System.out.println("최대공약수 : " + gcd + ", 최소공배수 : " + lcm);
				break;
			}
			
			// 나머지가 0이 아니면 작은수를 큰수로 놓고, 나머지를 작은 수로 놓고 나머지가 0일때까지 반복
			big = small;
			small = nmg;
		}
	}
}
