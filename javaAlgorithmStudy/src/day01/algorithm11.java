package day01;

import javaAlgorithmStudy.Algorithm;

// 1+1+2+3+5+8+13.. 20��° �ױ����� �հ�, �Ǻ���ġ ����
public class algorithm11 implements Algorithm {

	@Override
	public void run() {

		int a = 1, b = 1, c, sum = 2, count = 2;
		
		while(true) {
			
			c = a + b;
			sum += c;
			count++;
			System.out.println(count + " ��° �� = " + c);
			
			if(count < 20) {
				a = b;
				b = c;
			} else {
				System.out.println("sum = " + sum);
				break;
			}
		}
	}

}
