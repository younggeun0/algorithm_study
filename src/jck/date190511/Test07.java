package jck.date190511;

public class Test07 {
	
	// 1+2+4+7+11+16+22+.. �� �����ϴ� ������ 20��° �ױ����� �հ�
	public static void main(String[] args) {
		
		int sum  = 1;
		int j = 1;
		
		for(int i=0; i<20; i++) { // 20�� ����
			
			j += i; // �� ���� ������ j
			System.out.println(j);
			sum += j;
		}
		
		System.out.println(sum);
	}
}
