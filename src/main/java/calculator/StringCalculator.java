package calculator;

class StringCalculator {

    public int add(String numbers) {
    	String s =",|\n";
    	String arr[]= numbers.split(s);
    	
    	if(numbers== "")
    		return 0;
    	else if(numbers.length()==1)
    		return StringtoInt(numbers);
    	else 
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
    		 sum+=StringtoInt(s);
    	 }
    	 return sum;
     }
     
}
