package jck.date190517;

public class Test18 {
	
	public static void main(String[] args) {
		
		int[] A = new int[99];
		int cnt = 0;
		int m = 0;
		
		for (int i=2; i<99; i++) {
			A[i] = i;
		}
		
		for(int j=2; j<99; j++) {
			
			if (A[j] == 0) {
				continue;
			}
			
			cnt++;
			System.out.println("�Ҽ��Դϴ� : "+j);
			m = j;
			
			while(true) {
				m += A[j]; // �Ҽ��� ����� �ε���
				
				if (m > 98) {
					break;
				}
				
				A[m] = 0; // ����� ��ġ�� 0���� �ٲ� üũ�� ����
			}
		}
		
		System.out.println("�Ҽ��� ���� : " + cnt);
	}
}
