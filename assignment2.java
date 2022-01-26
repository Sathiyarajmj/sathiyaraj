package week1.day2;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[] ary = { 1, 2, 3, 4, 7, 6, 8 };

		Arrays.sort(ary);

		for (int i = 0; i < ary.length; i++) {
			int a = 1;
			a = a + i;
			if (ary[i] != a) {
				System.out.println(a);
				break;
			}
			a++;
		}
	}

}
/*
 * please clarify if I written as like result is not comming properly
 * int a=1
 * if(ary[i]!=a) 
 * { System.out.println(a);
 *  break; 
 *  }
 *  a++; }
 * 
 * }
 */
