package jck.date190511;

public class Test08 {
	
	// 1+3+6+10+15+21+28+�� �� ������ �����Ǵ� ������ 20��° �ױ����� �հ�
	public static void main(String[] args) {
		
		int sum = 0;
		int j = 0;
		
		for(int i=1; i<21; i++) {

			j += i;
			sum += j;
			
			System.out.println(i+"��° �� : "+j);
		}
		
		System.out.println(sum);
	}
}
