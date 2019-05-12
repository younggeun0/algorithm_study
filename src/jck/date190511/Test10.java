package jck.date190511;

public class Test10 {

	// 1! + 2! + 3! + 4!+ .. + 10!의 순서로 나열되는 수열의 10번째 항까지의 합계
	public static void main(String[] args) {
		
		int sum = 0;
		int j = 1;
		
		for(int i=1; i<11; i++) {
		
			j *= i;
			sum += j;
		}
		
		System.out.println(sum);
	}
}
