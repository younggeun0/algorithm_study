package day02;

import javaAlgorithmStudy.Algorithm;

// �Ҽ��� ���� ���ϱ�, �迭a[99]�� 2~100 ���� ������ ��� ��Ų �� �迭�� �̿� �Ҽ��� ������ ���ϱ�
public class algorithm17 implements Algorithm {

	@Override
	public void run() {
		
		int i, count, m, k;
		int[] a = new int[100];
		
		// 2���� 100���� a�迭�� �ʱ�ȭ
		for(k = 2; k < 101; k++) {
			System.out.println("a[" + (k - 2) + "] = " + k);
			a[k-2] = k;
		}
		
		i = -1;
		count = 0;
		
		while(true) {
			
			i++;
			if(i > 98) {
				System.out.println("count : " + count);
				break;
			}
			
			if (a[i] == 0) {
				continue;
			}
			
			System.out.println("a[" + i + "]�� " + a[i] + " ���� ���� �Ҽ��Դϴ�." );
			count++;
			m = i;
			
			while(true) {
				
				m += a[i];
				if(m > 98) {
					break;
				}
				
				a[m] = 0;
				
			}
		}			
	}
}
