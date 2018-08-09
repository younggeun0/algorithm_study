package day01;

import javaAlgorithmStudy.Algorithm;

// 1! + 2! + 3! + 4! + 5! .. + 10!
public class algorithm10 implements Algorithm {

	@Override
	public void run() {
		
		int i, j = 1, sum = 0;
		
		for (i = 1; i <= 10; i++) {
			j *= i;
			System.out.println(i + "! = " + j);
			sum += j;
		}
		
		System.out.println("sum = " + sum);
		
	}
}
