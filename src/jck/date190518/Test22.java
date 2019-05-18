package jck.date190518;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Test22 {
	
	public static List<Integer> revserList(List<Integer> reversed_binary) {
		Stack<Integer> binary_stack = new Stack<Integer>();
		List<Integer> binary_list = new ArrayList<Integer>();
		
		for (Integer i : reversed_binary) {
			binary_stack.push(i);
		}
		
		int size = binary_stack.size();
		for(int i=0; i<size; i++) {
			binary_list.add(binary_stack.pop());
		}
		
		return binary_list;
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int quotient = 0, remainder = 0;
		List<Integer> reversed_binary = new ArrayList<Integer>();
		
		do {
			quotient = n/2;
			remainder = n%2;
			
			reversed_binary.add(remainder);
			n = quotient;
		} while(quotient != 0);
		
		reversed_binary = revserList(reversed_binary);
		System.out.println(reversed_binary);
	}
}
