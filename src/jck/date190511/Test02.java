package jck.date190511;

public class Test02 {

	// 1+3+5+7+.. +99 �հ踦 ���ϴ� ������
	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<100; i+=2) {
			sum += i;
			System.out.println(i);
		}
		
		System.out.println(sum);
	}
}
