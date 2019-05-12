package jck.date190511;

public class Test11 {
	
	// 1+1+2+3+5+8+13…의 순서로 나열되는 피보나치 수열의 20번째 항까지의 합계
	public static void main(String[] args) {
		
		int sum, cnt, c;
		int a=1, b=1;
		
		sum  = 2;
		cnt = 2;
		
		while(true) {
			c = a+b;
			sum += c;
			cnt++;
			
			if (cnt <20) {
				a = b;
				b = c;
			} else {
				System.out.println(sum);
				break;
			}
		}
	}
}
