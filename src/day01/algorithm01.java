package day01;

import javaAlgorithmStudy.Algorithm;

// 1+2+3+4+...+100
public class algorithm01 implements Algorithm{

	@Override
	public void run() {
		int i, sum = 0;
		
		for(i = 1; i <= 100; i++) {
			sum += i;
			System.out.println(i);
		}
		
		System.out.println("sum = " + sum);
	}	
}
