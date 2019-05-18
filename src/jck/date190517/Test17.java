package jck.date190517;

public class Test17 {
	
	public static void main(String[] args) {
		
		int[] A = new int[99];
		int cnt = 0;
		
		for (int i=2; i<99; i++) {
			A[i] = i;
		}
		
		for(int n : A) {
			
			int j = 0;
			for(j=2; j<=n; j++) {
				if (n % j == 0) {
					break;
				}
			}
			
			if (n == j) {
				cnt++;
				System.out.println("소수입니다 : "+j);
			}
 		}
		
		System.out.println("소수의 개수 : " + cnt);
	}
}
