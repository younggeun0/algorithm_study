package day03;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// ������ �Է� �޾� ����� ���� ���
public class algorithm19 implements Algorithm {

	@Override
	public void run() {

		int input;
		int[] a = new int[100];	// ����� ���� �迭
		int end = -1;			// ��� �迭 �ε���
		int c = 0; 				// ����
		int nmg;
		
		Scanner sc = new Scanner(System.in);
		input = sc.nextInt();
		System.out.println(input + " �ԷµǾ����ϴ�.");
		
		while(true) {
			c++;
			
			if(c <= input) {
				// ������ input�� �������� �� �������� 0 �� �� �� ������ ���
				nmg = input%c;
				
				if (nmg == 0) {
					end++;
					a[end] = c;
				}
				
			} else {					// ������ input���� Ŀ���� break;
				System.out.println("���� : " + c);
				System.out.print(input + "�� ����� : ");
				for (int i = 0; i <= end; i++) {
					System.out.print(a[i] + " ");
				}
				break;
				
			}
		}
	}
}
