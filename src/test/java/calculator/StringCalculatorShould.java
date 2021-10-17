package calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;

class StringCalculatorShould {
	
	private StringCalculator sc;
	@BeforeEach
	
	void init() {
		sc= new StringCalculator();
	}

    @Test
    void empty_string_should_return_0() {
       
        assertEquals(0, sc.add(""));
    }

    @Test
    void string_with_single_number_should_return_number_as_int() {
        
        assertEquals(1, sc.add("1"));
    }
    
    @Test
    void String_with_numbers_should_return_addition_as_int()
    {
    	assertEquals(4, sc.add("2,2"));
    }
    
    @Test
    void String_with_numbers_should_return_multiple_addition_as_int()
    {
    	 assertEquals(9, sc.add("2,2,5"));
    }
    
    @Test
    void String_with_numbers_should_return_multiple_newline_delimeter_addition_as_int()
    {
    	 assertEquals(9, sc.add("2,2\n5"));
    }
    
    @Test
    void String_with_multiple_delimeter()
    {
    	 assertEquals(3, sc.add("//;\n1;2"));
    }
    
    @Test
    void String_with_negative_number_not_Allowed()
    {
    	 assertEquals(1, sc.add("1,-2"));
    }
    
    @Test
    void String_with_multiple_negative_number_not_Allowed()
    {
    	 assertEquals(1, sc.add("1,-5,-2"));
    }
    
    @Test
    void test_count_check()
    {
    	StringCalculator cal = new StringCalculator();
    	cal.add("1,2,4");
    	cal.add("2,3,4");
    	 assertEquals(2, cal.getCount());
    }
    
    @Test
    void test_greater_than_thousand()
    {
    	 assertEquals(5, sc.add("1001,5"));
    }
}
