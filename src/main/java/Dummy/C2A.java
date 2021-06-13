package Dummy;

public class C2A {
	public static void main(String[] args) {
		int a[]= {1,2,3};
		int b[]= {4,5,6,7};
		int a_len=a.length;
		int b_len=b.length;
		int c_len=a_len+b_len;
		int c[]=new int[c_len];
		for(int i=0;i<a.length;i++)
		{
			c[i]=a[i];
		}
		for(int i=0;i<b.length;i++)
		{
			c[a.length+i]=b[i];
		}
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
