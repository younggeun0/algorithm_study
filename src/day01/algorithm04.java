package day01;

import javaAlgorithmStudy.Algorithm;

// 1-2+3-4+5-6.. -98+99
public class algorithm04 implements Algorithm {

	@Override
	public void run() {

		int i = 0, sum = 0;
		
		while(true) {
			i++;
			sum += i;
			
			System.out.println(i);
			
			if (i >= 99) {
				System.out.println("sum = " + sum);
				break;
			} else {
				i++;
				sum -= i;
				System.out.println(-i);
			}
		}
	}

}
