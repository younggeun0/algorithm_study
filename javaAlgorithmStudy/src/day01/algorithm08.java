package day01;

import javaAlgorithmStudy.Algorithm;

// 1+3+6+10+15+21+28+.. 20��° �ױ����� �հ�
public class algorithm08 implements Algorithm {

	@Override
	public void run() {

		int i, j = 0, sum = 0;
		
		for(i = 1; i <= 20; i++) {
			j += i;
			System.out.println(i + " ��° �� = " + j);
			sum += j;
		}
		
		System.out.println("sum = " + sum);
		
	}
}
