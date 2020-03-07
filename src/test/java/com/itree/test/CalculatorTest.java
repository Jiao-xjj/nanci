package com.itree.test;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import com.itree.junit.Calculator;

import junit.framework.Assert;

public class CalculatorTest {

	private static Calculator calculator = new Calculator();

	@BeforeClass
	public static void beforeClass() {
		System.out.println("qianqianqianqianqian");
	}

	@AfterClass
	public static void afterbeforeClass() {
		System.out.println("后后后后后后后后");
	}

	@Before
	public void setUp() throws Exception {
		calculator.clear();
		System.out.println("我是before！！！！！！！");
	}

	@After
	public void setdown() {
		System.out.println("我是after？？？？？？");
	}

	@Ignore("test() Not yet implemented")
	@Test
	public void test() {
		fail("Not yet implemented");
		System.out.println("我是被忽略的");
	}

	@Test
	public void testAdd() {
		int result = calculator.add(1, 2);
		Assert.assertEquals(3, result);
		System.out.println("我是test01");
	}

	@Test
	public void testSub() {
		int result = calculator.sub(1, 2);
		Assert.assertEquals(-1, result);
		System.out.println("我是test02");
	}

	@Test
	public void testDiv() {
		int result = calculator.div(6, 2);
		Assert.assertEquals(3, result);
		System.out.println("我是test03");
	}

	@Test
	public void testSqu() {
		int result = calculator.squ(6, 2);
		Assert.assertEquals(12, result);
		System.out.println("我是test04");
	}

	@Ignore("testmul() Not yet implemented")
	@Test
	public void testmul() {
		fail("Not yet implemented");
	}

	@Ignore("squareRoot() Not yet implemented")
	// 限时测试
	@Test(timeout = 10000)
	public void squareRoot() {
		calculator.squareRoot(4);
		Assert.assertEquals(12, calculator.getResult());
	}

	// 异常测试
	@Test(expected = ArithmeticException.class)
	public void divideByZero() {
		calculator.div(1, 0);
	}

	// @Ignore(" Not yet implemented")
	// 参数化测试
	@RunWith(Parameterized.class)
	public static class SquareTest {
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
		}
	}

}
