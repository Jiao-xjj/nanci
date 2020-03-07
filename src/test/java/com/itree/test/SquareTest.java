package com.itree.test;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.itree.junit.Calculator;

@RunWith(Parameterized.class)
public class SquareTest {
	
	private final Calculator calculator = new Calculator();
	private int param;
	private int result;

	@Parameters
	public static Collection data() {
		return Arrays.asList(new Object[][] { { 2, 4 }, { 0, 0 }, { -3, 9 }, });
	}

	// 构造函数，对变量进行初始化
	public SquareTest(int param, int result) {
		this.param = param;
		this.result = result;
	}

	@Test
	public void square() {
		calculator.square(param);
		assertEquals(result, calculator.getResult());
		//System.out.println(param);
		//System.out.println(result);
		//System.out.println(calculator.getResult());
	}
}


