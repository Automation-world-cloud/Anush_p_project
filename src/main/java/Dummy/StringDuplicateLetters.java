package Dummy;

import java.util.HashSet;
import java.util.Set;

public class StringDuplicateLetters {
	public static void main(String[] args) {
	String s="ANUSHREDDY";
	char[] ch = s.toCharArray();
	Set ss=new HashSet();
	for(int i=0;i<ch.length;i++)
	{
		if(ss.add(ch[i]))
		{
			System.out.print(ch[i]);
		}
	}
	


}
}