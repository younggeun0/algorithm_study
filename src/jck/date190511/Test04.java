package jck.date190511;

public class Test04 {

	public static void main(String[] args) {
		
		int sum = 0;
		
		for(int i=1; i<100; i++) {
			
			sum += i;
			
			i++;
			if (i == 100) {
				break;
			}
			
			sum += i*(-1);
		}
		
		
		System.out.println(sum);
	}
}
