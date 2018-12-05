package sortStudy181205;

import java.util.Random;

import javaAlgorithmStudy.Algorithm;

public class SelectionSort implements Algorithm {
	
	// 10개의 임의의 수 저장, 오름차순으로 선택정렬 후 출력
	@Override
	public void run() {
		
		int[] arr = new int[10];
		Random r = new Random();
		for(int i=0; i<arr.length; i++) {
			arr[i] = r.nextInt(100);
		}
		
		System.out.println("선택정렬 전-------------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
		
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				int temp;
				if (arr[i] > arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("선택정렬 후-------------");
		for(int i=0; i<arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}
}
