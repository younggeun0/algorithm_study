package jck.date190511;

public class Test09 {
	
	// -1 +2 -4 +7 -11 + 16 -22 +�� �� ������ �����Ǵ� ������ 20��° �ױ����� �հ�
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
