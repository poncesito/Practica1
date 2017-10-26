package com.operaciones;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestSuma {

	@Test
	public void test() {
		OperacionesMatematicas test; 
		test= new OperacionesMatematicas();
		
		test.setNumero1(1);
		test.setNumero2(2);
		
		float result = test.sumar();
		//assertEquals(3,0f, result);
		
	    assertTrue( result==3);
	    
	    

	}

}
