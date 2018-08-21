package day03;

import java.util.Scanner;

import javaAlgorithmStudy.Algorithm;

// �� ���� �Է� �޾� �� ���� �ִ������� �ּҰ������ ����ؼ� ���
public class algorithm18 implements Algorithm {

	@Override
	public void run() {

		int input1, input2;
		int big, small;
		int mok, nmg;
		int gcd, lcm;	// �ִ�����, �ּҰ����
		
		Scanner sc = new Scanner(System.in);
		input1 = sc.nextInt();
		input2 = sc.nextInt();
		
		System.out.println(input1 + "�� " + input2 + "�� �ԷµǾ����ϴ�...");
		
		// �Է°��� ���ؼ� ū��, �������� ����
		if(input1 >= input2) {	
			big = input1;
			small = input2;
		} else {
			big = input2;
			small = input1;
		}
		
		while(true) {
			
			// ū��/������ �������� 0�� �� ���� ���� �ִ�����
			nmg = big % small;
			
			if(nmg == 0) {
				// �������� 0 �� �� ���� ���� �ִ�����(gcd)
				gcd = small;
				
				// ���� �Է°��� ���� �ִ������� ������ �ִ�����(lcm)�� ���� �� ����->��Ŭ���� ȣ����
				lcm = input1*input2 / gcd;
				
				// ���
				System.out.println("�ִ����� : " + gcd + ", �ּҰ���� : " + lcm);
				break;
			}
			
			// �������� 0�� �ƴϸ� �������� ū���� ����, �������� ���� ���� ���� �������� 0�϶����� �ݺ�
			big = small;
			small = nmg;
		}
	}
}
