package Dummy;

public class PairsAdd {
	
	public static void main(String[] args) {
		int a[]= {1,4,7,9,3,6};
		int n=10;
		addPairs(a, n);
	}
	
	public static void addPairs(int [] num,int number)
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==number)
				{
					System.out.println(num[i]+" +"+num[j]+"="+number);
				}
			}
		}

	}

}
