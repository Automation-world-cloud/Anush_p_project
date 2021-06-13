package Dummy;

public class EX1 {
	public static void main(String[] args) {
		String s="I Love India";
		String[] sp = s.split(" ");
		//String rev=" ";
		for(int i=sp.length-1;i>=0;i--)
		{
		System.out.print(sp[i]+" ");
		}
		//System.out.println(rev+" ");
	}

}
