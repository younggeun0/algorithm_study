package day01;

import javaAlgorithmStudy.Algorithm;

// -1+2-4+7-11+16-22+.. 20��° �ױ����� ��
public class algorithm09 implements Algorithm {

	@Override
	public void run() {

		int i, j = 1, sw = 1, sum = -1;
		
		System.out.println("1 ��° �� = " + j*sw);
		
		for(i = 1; i < 20; i++) {
			j += i;
			sum += j*sw;
			System.out.println(i+1 + " ��° �� = " + j*sw);
			sw *= -1;
		}
		
		System.out.println("sum = " + sum);
		
	}

}
