package day01;

import javaAlgorithmStudy.Algorithm;

// 1+2+4+7+11+16+22.. 20��° �ױ����� �հ�
public class algorithm07 implements Algorithm {

	@Override
	public void run() {

		int i, j = 1, sum = 1;
		
		System.out.println("1 ��° �� = " + j);
		
		for (i = 1; i < 20; i++) {
			
			j += i;
			System.out.println(i+1 + " ��° �� = " + j);
			sum += j;
		}
		
		System.out.println("sum = " + sum);
	}
}
