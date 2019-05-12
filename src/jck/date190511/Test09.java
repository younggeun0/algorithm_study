package jck.date190511;

public class Test09 {
	
	// -1 +2 -4 +7 -11 + 16 -22 +… 의 순서로 나열되는 수열의 20번째 항까지의 합계
	public static void main(String[] args) {
		
		int sum = 0;
		int j = 1;
		int k = 0;
		int sw = -1;
		
		for(int i=0; i<20; i++) {
			
			j += i;
			k = j*(sw);
			sum += k;
			
			sw *= -1;
		}
		
		System.out.println(sum);
	}
}
