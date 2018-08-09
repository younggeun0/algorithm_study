package day01;

import javaAlgorithmStudy.Algorithm;

// 1-2+3-4+5-6..+99-100
public class algorithm03 implements Algorithm {

	@Override
	public void run() {

		int i, sum, sw;
		
		sw = 1;
		sum = 0;
		
		for(i = 1; i <= 100; i++) {
			sum += i*sw;
			System.out.println(i*sw);
			sw *= -1;
		}
		
		System.out.println("sum = " + sum);
	}

}
