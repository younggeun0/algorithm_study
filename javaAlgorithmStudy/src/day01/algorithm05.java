package day01;

import javaAlgorithmStudy.Algorithm;

// (-1)*2*(-3)*4*(-5)..*100
public class algorithm05 implements Algorithm{

	@Override
	public void run() {
		int i = 0;
		double sum = 1;
		
		while (i < 100) {
			i++;
			
			if(i % 2 == 0) {
				sum *= i;
				System.out.println(i);
			} else {
				sum *= -i;
				System.out.println(-i);
			}
		}		
		
		System.out.printf("sum = %11.4e", sum);
	}
	
}
