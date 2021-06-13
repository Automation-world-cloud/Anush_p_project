package Dummy;

public class Ex10 {
	public static void main(String[] args) {
		
			 int arrs[] = {1,2,3,4,3,4,0,2};
			  //Required 2  as output
			  
			  int ln = arrs[0];
			  boolean isDuplicate;
			  //Write a logic or code in java that will fetch me the required value
			  for(int i=0; i<arrs.length;i++){
			    isDuplicate = false;
			  	for(int j=0; j<arrs.length;j++){
			    	if(!isDuplicate && i!=j && arrs[i] == arrs[j]) {
			       isDuplicate = true; 
			        break;
			      }  
			  	}
			    if(!isDuplicate && ln < arrs[i])
			    {
			      ln = arrs[i];
			    }
			  }
			  System.out.println(ln);
			}
	}


