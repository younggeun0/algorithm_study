package jck.date190511;

public class Test10 {

	// 1! + 2! + 3! + 4!+ .. + 10!�� ������ �����Ǵ� ������ 10��° �ױ����� �հ�
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
