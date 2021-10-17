package calculator;

class StringCalculator {
	int count=0;
	  

    public int add(String numbers) {
    	
    	count++;
    	if(numbers== "")
    		return 0;
    	if(numbers.length()==1)
    		return StringtoInt(numbers);
    	String s =",|\n";
    	String arr[]= numbers.split(s);
    	try {
    		StringtoInt(arr[0]);
		} catch (NumberFormatException e) {
			// TODO: handle exception
			s= numbers.split("\n",2)[0];
			if(s.charAt(0)=='/');
			{
				s=s.substring(2,s.length());
			}
			arr=numbers.split("\n",2)[1].split(s);
		}
    	
           return sum(arr);
    	
    }
    
  //-------------------------------------------------------------------------------//  
    private int StringtoInt(String numbers){
		return Integer.parseInt(numbers);
    }
    
     private int getSum(String a,String b) {
    	 return StringtoInt(a)+StringtoInt(b);
     }
     
     private int sum(String arr[])
     {
    	 int sum = 0;
    	 for(String s : arr)
    	 {
    		 int temp=StringtoInt(s);
    		 if(temp<0)
    		 {
    			 System.out.println("Negative is not allowed"+s);
    			 
    		 }
    		 else
    			 
    		 sum+=temp;
    	 }
    	 return sum;
     }
     
     public int getCount() {
    	 return count;
     }
     
}
