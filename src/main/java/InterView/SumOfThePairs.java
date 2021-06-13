package InterView;

public class SumOfThePairs {
	public static void main(String[] args) {
		int [] a= {10,-20,5,4,5,6,3,7,12,-2};
		int n=10;
		sumPair(a, n);
		
	}
	public static void sumPair(int[] num,int number )
	{
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]+num[j]==number)
				{
					System.out.println(num[i]+"+"+num[j]+" =" +number);
				}
			}
		}
	}

}
