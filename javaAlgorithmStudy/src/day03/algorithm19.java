package day03;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// 정수를 입력 받아 약수를 구해 출력
public class algorithm19 implements Algorithm {

	@Override
	public void run() {

		int input;
		int[] a = new int[100];	// 약수를 담을 배열
		int end = -1;			// 약수 배열 인덱스
		int c = 0; 				// 제수
		int nmg;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		System.out.println(input + " 입력되었습니다.");
		
		while(true) {
			c++;
			
			if(c <= input) {
				// 제수로 input을 나누었을 때 나머지가 0 일 때 그 제수가 약수
				nmg = input%c;
				
				if (nmg == 0) {
					end++;
					a[end] = c;
				}
				
			} else {					// 제수가 input보다 커지면 break;
				System.out.println("제수 : " + c);
				System.out.print(input + "의 약수들 : ");
				for (int i = 0; i <= end; i++) {
					System.out.print(a[i] + " ");
				}
				break;
				
			}
		}
	}
}
