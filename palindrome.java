package week1.day2;

public class palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sample = "madam";
		String sample2 = "";
		for (int i = sample.length()-1; i >= 0; i--) {
			sample2 = sample2+sample.charAt(i);
		}
		if(sample.equals(sample2)) {
			System.out.println("given string is palindrome");
		}else {
			System.out.println("given string is not palindrome");
		}
			
		
	}

}
