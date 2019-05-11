package jck.date190511;

public class Test01 {

	// 수열 1 - 1+2+3+4+… +100까지의 합계
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0; i<101; i++) {
			sum+=i;
			System.out.println(i);
		}
		
		System.out.println(sum);
	}
}
