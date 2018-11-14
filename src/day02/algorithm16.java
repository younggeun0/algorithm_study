package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// �Ҽ��� �� ���ϱ�, ������ ���� �Է� �޾� �� �ȿ� ���Ե� �Ҽ��� ���� ���ϱ�.
public class algorithm16 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		int sum = 0;
		int k = 2; // �Ҽ����� �Ǻ��� ���ڰ� ����� ����
		
		while(true) {
			
			int j = 2; // �Ҽ����� �Ǻ��� �� ����� ����

			// �������� ������ ������������ ������ Ű���
			while(k % j != 0) {
				j++;
			}

			// �������� ������ ������ �Ҽ�
			if (k == j) {
				System.out.println("�Ҽ� : " + k);
				sum += k;
			}
			
			// �Է°����� �������� ������ Ű���� �ݺ�
			if (k < input) {
				k++;
			} else {
				System.out.println("�Ҽ��� �� : " + sum);
				break;
			}
		}
	}
}
