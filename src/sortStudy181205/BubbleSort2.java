package sortStudy181205;

import javaAlgorithmStudy.Algorithm;

public class BubbleSort2 implements Algorithm{

	// 10���� ������ �� ����, ������������ ��������
	// Ư�� ȸ������ ���� ���� �� ��ȯ�� �ѹ��� �̷������ ������ ���ĿϷ�, ����
	// ��ȯȽ���� ���ĵ� �ڷḦ ���
	@Override
	public void run() {
		
		int[] arr = new int[10];
		int cnt = 0;
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = (int)(Math.random()*100)+1;
		}
		
		System.out.println("�������� �� ---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			boolean flag = false;
			for(int j=0; j<arr.length-1-i; j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
					cnt++;
					flag = true;
				}
			}
			if (flag != true) {
				System.out.println("���� ��");
				break;
			}
		}
		
		System.out.println("�������� �� ---------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		System.out.println("ȸ�� �� : "+cnt);
	}
}
