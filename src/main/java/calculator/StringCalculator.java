package calculator;

class StringCalculator {

    public int add(String numbers) {
    	String arr[]= numbers.split(",");
    	
    	if(numbers== "")
    		return 0;
    	else if(numbers.length()==1)
    		return StringtoInt(numbers);
    	else
           return getSum(arr[0],arr[1]);
    }
    
    
    private int StringtoInt(String numbers){
		return Integer.parseInt(numbers);
    }
    
     private int getSum(String a,String b) {
    	 return StringtoInt(a)+StringtoInt(b);
     }
	}
