package jck.date190517;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// 정수 n을 입력받아 소인수 구해 출력
		int n = sc.nextInt();
		int sqrt = 0, quotient = 0, remainder = 0;
		int d = 2; // 제수
		
		// 소인수를 저장할 리스트
		List<Integer> prime = new ArrayList<Integer>();
		
		while(true) {
			
			sqrt = (int)Math.sqrt(n);
			
			while(true) {
				// 제수가 제곱근보다 커지면 피제수 자체가 입력받은 수의 소인수
				if (d > sqrt) { 
					d = n;
					break;
				}
				
				quotient = n/d; // 몫
				remainder = n%d; // 나머지
				
				if (remainder == 0) { 
					// 처음으로 나머지가 0이 되게 하는 수가 소인수
					break;
				} else {
					d++; // 제수를 2부터 제곱근(sqrt)까지 증가시킴
				}
			}
			
			System.out.println("소인수 : "+d);
			prime.add(d);
			
			if (n == d) {
				// 제수가 입력값과 같으면 소인수분해 과정이 모두 마친 것
				break;
			}
			
			// 소인수를 구했으면 그 때의 몫에 대해 다시 소인수를 구하기 위한 처리
			n = quotient;
		}
		
		System.out.println(prime); // 소인수 분해된 결과 출력
	}
}
