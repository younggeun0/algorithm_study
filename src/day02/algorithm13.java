package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// �Ҽ� �Ǻ�, ������ ������ �Է� �Ͽ� �Ҽ��� �Ǻ�
public class algorithm13 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int j = 2;
		
		while(true) {
			
			
			if(j < input) {
				// �Ҽ��� 1���� ũ�� 1�� �ڱ��ڽø��� ����� ���� ��.
				// 2���� �Է¹��� ��-1���� Ŀ���� ������ ������������ ������ �Ҽ�.
				
				if (input % j == 0) {
					System.out.println("�Ҽ��� �ƴ�");
					break;
				} else {
					j++;
				}
				
				
			} else {
				System.out.println("�Ҽ�");
				break;
			}
			
		}
		
		
	}

}
