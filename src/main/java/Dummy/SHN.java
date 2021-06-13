package Dummy;

public class SHN {
	public static void main(String[] args) {
		int num[]= {10,12,-1,-2,13,14};
		int temp;
		for(int i=0;i<num.length;i++)
		{
			for(int j=i+1;j<num.length;j++)
			{
				if(num[i]<num[j])
				{
					temp=num[i];
					num[i]=num[j];
					num[j]=temp;
				}
			}
			
			
		}
		System.out.println(num[2]);
		
	}

}
