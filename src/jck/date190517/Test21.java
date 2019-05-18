package jck.date190517;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Test21 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		// ���� n�� �Է¹޾� ���μ� ���� ���
		int n = sc.nextInt();
		int sqrt = 0, quotient = 0, remainder = 0;
		int d = 2; // ����
		
		// ���μ��� ������ ����Ʈ
		List<Integer> prime = new ArrayList<Integer>();
		
		while(true) {
			
			sqrt = (int)Math.sqrt(n);
			
			while(true) {
				// ������ �����ٺ��� Ŀ���� ������ ��ü�� �Է¹��� ���� ���μ�
				if (d > sqrt) { 
					d = n;
					break;
				}
				
				quotient = n/d; // ��
				remainder = n%d; // ������
				
				if (remainder == 0) { 
					// ó������ �������� 0�� �ǰ� �ϴ� ���� ���μ�
					break;
				} else {
					d++; // ������ 2���� ������(sqrt)���� ������Ŵ
				}
			}
			
			System.out.println("���μ� : "+d);
			prime.add(d);
			
			if (n == d) {
				// ������ �Է°��� ������ ���μ����� ������ ��� ��ģ ��
				break;
			}
			
			// ���μ��� �������� �� ���� �� ���� �ٽ� ���μ��� ���ϱ� ���� ó��
			n = quotient;
		}
		
		System.out.println(prime); // ���μ� ���ص� ��� ���
	}
}
