package day01;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// �Է¹��� �ױ��� �Ǻ���ġ ������ ���� ���ϴ� ����
public class algorithm12 implements Algorithm {

	@Override
	public void run() {

		int a = 1, b = 1, c, sum = 2, input, count = 2;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();

		for(count = 3; count <= input; count++) {
			c = a + b;
			sum += c;
			a = b;
			b = c;
		}
		
		System.out.println(count-1 + " ��° �ױ����� �� = " + sum);
	}

}
