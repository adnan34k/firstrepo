public class problem2{
	public static void main(String[] args){
		
		String[] arr = {"2022bit055","2022bcs001","2022bec023","sggsit023"};
		int ans = check(arr);
	}
	public static int check(String arr[])
	{
	//format available 2022bit,bcs,bec00x
		int j = 0;
		int k = 5;
		int flag = 0;
		int count = 0;//substring
			for(int i=0;i<arr.length;i++)
			{	
				flag = 0;
				String abc = arr[i];
				//function to check pattern 4 digit number 3 letters 3 digits
				while(j <10)
				{
					
					if(abc.charAt(j).isNumeric()){
						flag = 1;
					}
					else
					{
						flag = 0;
					}
					
					if(j==4)
					{
						j=8;
					}
					j++;
				}
				while(k<8){
					if(abc.charAt(k).isAlphabetic())
					{
						flag = 1;
					}
					else{
						flag = 0;
					}
					k++;
					
				}
				if(flag==1){
					count++;
				}
			}
			return count;
			
	}
	}
