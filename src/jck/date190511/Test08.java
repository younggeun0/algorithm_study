package jck.date190511;

public class Test08 {
	
	// 1+3+6+10+15+21+28+… 의 순서로 나열되는 수열의 20번째 항까지의 합계
	public static void main(String[] args) {
		
		int sum = 0;
		int j = 0;
		
		for(int i=1; i<21; i++) {

			j += i;
			sum += j;
			
			System.out.println(i+"번째 항 : "+j);
		}
		
		System.out.println(sum);
	}
}
