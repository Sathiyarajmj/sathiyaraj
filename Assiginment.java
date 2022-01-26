package week1.day2;

import java.util.Iterator;

//To find Fibonacci Series for a given range

public class Assiginment {
	public static void main(String[] args) {
		int range = 8, firstNum = 0, secNum = 1;
		int sum;
	
		for (int i = 1; i < range ; i++) {
			System.out.println(firstNum);
			sum = secNum + firstNum;
			firstNum = secNum;
			secNum = sum;
			

		}

	}
}
