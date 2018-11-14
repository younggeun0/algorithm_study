package day01;

import javaAlgorithmStudy.Algorithm;

// -(1/2) + (2/3) - (3/4) + (4/5) - (5/6).. -(99/100)
public class algorithm06 implements Algorithm {

	@Override
	public void run() {

		float i, sum = 0;
		
		for(i = 1; i < 100; i++) {
			
			if((int)(i/2) == i/2) {
				sum += i/(i+1);
				System.out.println((int)i + "/" + (int)(i + 1));
			} else {
				sum -= i/(i+1);
				System.out.println(-(int)i + "/" + (int)(i + 1));
			}
		}
		
		System.out.println("sum = " + sum);
		
	}

}
