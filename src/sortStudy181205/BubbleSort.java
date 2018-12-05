package sortStudy181205;

import java.util.Random;

import javaAlgorithmStudy.Algorithm;

public class BubbleSort implements Algorithm{

	// 10개의 임의의 수 저장, 오름차순으로 버블정렬 후  출력
	@Override
	public void run() {
		
		int[] arr = new int[10];
		
		Random r = new Random();
		
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		
		System.out.println("버블정렬 전 --------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

		for(int i=0; i<arr.length-1; i++) {
			for(int j=0; j<arr.length-1-i; j++) {
				int temp;
				if(arr[j] > arr[j+1]) {
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}		
		
		System.out.println("버블정렬 후 --------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
}
