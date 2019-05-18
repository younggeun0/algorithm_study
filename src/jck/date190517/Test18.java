package jck.date190517;

public class Test18 {
	
	public static void main(String[] args) {
		
		int[] A = new int[99];
		int cnt = 0;
		int m = 0;
		
		for (int i=2; i<99; i++) {
			A[i] = i;
		}
		
		for(int j=2; j<99; j++) {
			
			if (A[j] == 0) {
				continue;
			}
			
			cnt++;
			System.out.println("소수입니다 : "+j);
			m = j;
			
			while(true) {
				m += A[j]; // 소수의 배수의 인덱스
				
				if (m > 98) {
					break;
				}
				
				A[m] = 0; // 배수의 위치는 0으로 바꿔 체크를 안함
			}
		}
		
		System.out.println("소수의 개수 : " + cnt);
	}
}
