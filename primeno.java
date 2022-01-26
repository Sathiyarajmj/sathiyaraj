package week1.day2;

public class primeno {
	public static void main(String[] args) {
		int input = 13;
		boolean value = true;
		for (int i = 2; i < input; i++) {
			if (input % i == 0) {
				value = false;
				break;
			}

		}

		if (value == true) {
			System.out.println("given no is prime");
		} else {
			System.out.println("given no is not prime");
		}
	}
}
