package week1.day2;

public class duplicat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {14,12,13,11,15,14,18,16,17,19,18,17,20};
		int a= array.length;
		int count;
		for (int i = 0; i < array.length-1; i++) {
			count=0;
			for (int j =i+ 1; j < array.length; j++) {
				if(array[i]==array[j]) {
				count=count+1;
				}
			}
			
		if(count==1) {
			System.out.println(array[i]);
		}
		}
					
		}
			
		}
		
		