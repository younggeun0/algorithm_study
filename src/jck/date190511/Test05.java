package jck.date190511;

public class Test05 {
	
	// Ȧ¦ �Ǻ��� �̿��� �ݺ� ��� - (-1)x2x(-3)x4(-5)x�� x100�� �հ�
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<101; i++) {
			
			if (i%2 == 0) {
				sum += i;
			} else {
				sum += i*(-1);
			}
		}
		
		System.out.println(sum);
	}
}
