package day02;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// ������ �̿�, ������ ������ �Է� �޾� �Ҽ����� �Ǻ�
public class algorithm15 implements Algorithm {

	@Override
	public void run() {

		Scanner sc = new Scanner(System.in);
		
		int input = sc.nextInt();
		int j = 2;
		
		while(true) {
			// �Էµ� ���� �������� ���� ������ �� �����ٱ��� Ű��� ������������ �Ҽ��ƴ�
			// ������ �������� ������ �Ҽ�.
			
			if(j <= Math.sqrt(input)) {
				if (input % j == 0) {
					System.out.println("�Ҽ� �ƴ�");
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
