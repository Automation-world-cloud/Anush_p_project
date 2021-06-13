package InterView;

public class SecondHighest {
	public static void main(String[] args) {
		int[] arr= {23,43,53,73,83,73,83};
		int highest=Integer.MIN_VALUE;
		int shighest=Integer.MIN_VALUE;
		
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>highest)
			{
				shighest=highest;
				highest=arr[i];
			}
			else if(arr[i]<highest && arr[i]>shighest)
			{
				shighest=arr[i];
			}
			
		}
		System.out.println(shighest);
	}

}
