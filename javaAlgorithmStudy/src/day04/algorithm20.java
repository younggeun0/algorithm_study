package day04;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// ������ �Է� �޾� ���μ��� ���� ���?? �̰� ���� �ٽ� ������ �ҵ�
public class algorithm20 implements Algorithm {

	@Override
	public void run() {

		int[] a = new int[100];
		int num, a_index, d, e, mok, nmg;
		
		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		a_index = -1;
		d = 2;				// ����
		
		while(true) {
			
			e = (int)Math.sqrt(num);
			System.out.println("�Է°��� �������� : " + e);
			
			if(d > e) {
				d = num;
				break;
			}
			
			mok = num / d;
			nmg = num - mok * d;
			
			if(nmg == 0) {
				break;
			} else {
				d++;
			}
			
			a_index++;
			a[a_index] = d;
			
			if(num == d) {
				break;
			}
			
			num = mok;
		}
		
		for(int i = 0; i <= a_index; i++) {
			System.out.println(a[a_index]);
		}
	}

}
