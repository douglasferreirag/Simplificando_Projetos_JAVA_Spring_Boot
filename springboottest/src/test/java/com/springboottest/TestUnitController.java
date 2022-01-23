package com.springboottest;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.springboottest.Controller.TestController;

public class TestUnitController {

	@Test
	public void TestUnit() {
		
		TestController controller = new TestController();
		
		String resultado = controller.saudacao("DIO");
		
		assertEquals("Bem-vindo, DIO", resultado);
		
		
		
	}

}
