package jck.date190511;

public class Test03 {

	// 	수열2 - 1-2+3-4+5-6 … +99-100의 합계
	public static void main(String[] args) {
		
		int sum = 0;
		int flag = -1;
		
		for(int i=1; i<101; i++) {
			flag = flag*(-1);
			sum += i*flag;
			System.out.println(i*flag);
		}
		
		System.out.println(sum);
	}
}
