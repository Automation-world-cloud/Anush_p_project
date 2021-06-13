package JavaInt;

public class RemoveJunkInString {
	public static void main(String[] args) {
		
	
	String s="!@#$%^^&&&***AnushKumarReddyGosula";
	System.out.println(s.replaceAll("[^A-Za-z0-9]", ""));
	}
}
