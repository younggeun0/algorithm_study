package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;


// �Ҽ� �Ǻ�, ������ ������ �Է��Ͽ� �Ҽ��� �Ǻ�
// ������ 2�� �ΰ� �ϳ��� Ű���� ���� �������� �� ������ �Է°��� ������ �Ҽ�
public class algorithm14 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int j = 2;
		
		while(input % j != 0) {
			j++;
		}
		
		if (input == j) {
			System.out.println("�Ҽ�");
		} else {
			System.out.println("�Ҽ��ƴ�");
		}
		
	}

}
