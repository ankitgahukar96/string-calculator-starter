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
}
