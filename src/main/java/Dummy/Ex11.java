package Dummy;

public class Ex11 {
	public static void main(String[] args) {
		int[] a= {1,2,3,4,4,6,8,8,6};
		int ln=a[0];
		
		boolean isduplicate;
		
		for(int i=0;i<a.length;i++)
		{
			isduplicate=false;
			for(int j=0;j<a.length;j++)
			{
				if(!isduplicate && i!=j && a[i]==a[j])
				{
					isduplicate=true;
					break;
				}
				if(!isduplicate && ln<a[i])
				{
					ln=a[i];
				}
			}
		
		}
		System.out.println(ln);
	}

}
