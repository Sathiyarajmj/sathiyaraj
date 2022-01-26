package week1.day2;

public class factorial {
	public static void main(String[] args) {
		int input=5;
		int factr=1;
		for (int i = 1; i <=input; i++) {
			factr=factr*i;
		}
		System.out.println("factorial of 5=" +factr);
	}

}
