package jck.date190519;

import java.util.Scanner;

public class Test26 {

	public static void main(String[] args) {
		
		int[] data = { 7,15,33,60,61,70,80,92,99 };
		Scanner sc = new Scanner(System.in);
		
		int searchNum = sc.nextInt();
		int start = 0, last = data.length, m = 0;
		
		
		while(true) {
			if (start <= last) {
				m = (start+last)/2;
				
				if (searchNum == data[m]) {
					System.out.println("�Է°� : "+searchNum+", �ε��� ��ġ : "+m);
					break;
				}
				
				if (searchNum < data[m]) {
					last = m-1;
				} else {
					start = m+1;
				}
			} else {
				System.out.println("�Է��Ͻ� "+searchNum+"�� �����ϴ�");
				break;
			}
		}
	}
}
