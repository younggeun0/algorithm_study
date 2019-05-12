package jck.date190511;

public class Test07 {
	
	// 1+2+4+7+11+16+22+.. 로 증가하는 수열의 20번째 항까지의 합계
	public static void main(String[] args) {
		
		int sum  = 1;
		int j = 1;
		
		for(int i=0; i<20; i++) { // 20번 수행
			
			j += i; // 각 항을 저장할 j
			System.out.println(j);
			sum += j;
		}
		
		System.out.println(sum);
	}
}
