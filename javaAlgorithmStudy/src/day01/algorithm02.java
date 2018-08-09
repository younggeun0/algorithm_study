package day01;

import javaAlgorithmStudy.Algorithm;

// 1+3+5+7+...+99
public class algorithm02 implements Algorithm {

	@Override
	public void run() {

		int i, sum = 0;
		
		for(i = 1; i < 100; i+=2) {
			sum += i;
			System.out.println(i);
		}
		
		System.out.println("sum = " + sum);
	}
}
