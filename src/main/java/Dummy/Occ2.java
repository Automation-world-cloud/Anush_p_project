package Dummy;

public class Occ2 {
	public static void main(String[] args) {
		String s="abcda";
		char[] ch=s.toCharArray();
		int count=0;
		for( Character c:ch)
		{
			if(c=='a')
			{
				count++;
			}
		}
		System.out.println(count);
	}

}
