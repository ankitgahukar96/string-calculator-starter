package calculator;

class StringCalculator {

    public int add(String numbers) {
    	String arr[]= numbers.split(",");
    	
    	if(numbers== "")
    		return 0;
    	else if(numbers.length()==1)
    		return Integer.parseInt(numbers);
    	else
           return Integer.parseInt(arr[0])+Integer.parseInt(arr[1]) ;
    }

}