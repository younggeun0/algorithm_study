package jas.date190427;

import java.util.Scanner;

public class Median {
	
	static int med3(int a, int b, int c) {
		if (a >= b) { // ù° ���� �ι�° ������ ũ�ų� ������
			if (b >= c) {
				return b;
			} else if (a <= c) {
				return a;
			} else {
				return c;
			}
		} else if (a > c) { // ù��° ���� ����° ������ ũ��
			return a;
		} else if (b > c) { // �ι�° ���� ����° ������ ũ��
			return c;
		} else {
			return b;
		}
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �߾Ӱ��� ���մϴ�");
		System.out.print("a�� �� : ");
		int a = stdIn.nextInt();
		System.out.print("b�� �� : ");
		int b = stdIn.nextInt();
		System.out.println("c�� �� : ");
		int c = stdIn.nextInt();
		
		System.out.println("�߾Ӱ��� "+med3(a, b, c)+"�Դϴ�.");
		
	}

}
