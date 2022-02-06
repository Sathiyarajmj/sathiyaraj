package week1.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String exm1 = "stops";
		String exm2 = "posts";
if(exm1.length()==exm2.length()) {
	char[] resl1=exm1.toCharArray();
	char[] resl2=exm2.toCharArray();
Arrays.sort(resl1);
Arrays.sort(resl2);
if(Arrays.equals(resl1, resl2)) 
	System.out.println("Given string is Anagram");
}
else {
System.out.println("Given string is not Anagram");
}
}
	

}
