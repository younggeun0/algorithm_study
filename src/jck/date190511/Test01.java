package jck.date190511;

public class Test01 {

	// ���� 1 - 1+2+3+4+�� +100������ �հ�
	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=0; i<101; i++) {
			sum+=i;
			System.out.println(i);
		}
		
		System.out.println(sum);
	}
}
