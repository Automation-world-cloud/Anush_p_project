package InterView;

public class SecondHighest2 {
	public static void main(String[] args) {
		int [] arr= {12,22,32,42,52,42,52};
		int temp;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]<arr[j])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
				
			}
			
		}
		System.out.println(arr[1]);
	}

}
