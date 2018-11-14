package day02;

import javaAlgorithmStudy.Algorithm;

// 소수의 개수 구하기, 배열a[99]에 2~100 사이 정수를 기억 시킨 후 배열을 이용 소수의 개수를 구하기
public class algorithm17 implements Algorithm {

	@Override
	public void run() {
		
		int i, count, m, k;
		int[] a = new int[100];
		
		// 2에서 100까지 a배열에 초기화
		for(k = 2; k < 101; k++) {
			System.out.println("a[" + (k - 2) + "] = " + k);
			a[k-2] = k;
		}
		
		i = -1;
		count = 0;
		
		while(true) {
			
			i++;
			if(i > 98) {
				System.out.println("count : " + count);
				break;
			}
			
			if (a[i] == 0) {
				continue;
			}
			
			System.out.println("a[" + i + "]는 " + a[i] + " 값을 갖는 소수입니다." );
			count++;
			m = i;
			
			while(true) {
				
				m += a[i];
				if(m > 98) {
					break;
				}
				
				a[m] = 0;
				
			}
		}			
	}
}
