package jas.date190427;

import java.util.Scanner;

public class Max3 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("�� ������ �ִ밪 ���ϱ�");
		System.out.print("a�� �� : "); int a= stdIn.nextInt();
		System.out.print("b�� �� : "); int b= stdIn.nextInt();
		System.out.print("c�� �� : "); int c= stdIn.nextInt();
		
		int max = a;
		
		if (b > max) max = b;
		if (c > max) max = c;
		
		System.out.println("�ִ밪�� "+max+" �Դϴ�.");
	}
}
