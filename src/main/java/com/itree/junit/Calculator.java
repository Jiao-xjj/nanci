package com.itree.junit;

/**
 * 计算机的类
 * 
 * @author GABHVTDJ
 *
 */
public class Calculator {

	private static int result; // 静态变量，用于存储运行结果

	/**
	 * 加法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int add(int a, int b) {
		return a + b;
	}

	/**
	 * 减法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int sub(int a, int b) {
		return a - b;
	}

	/**
	 * 除法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int div(int a, int b) {
		return a / b;
	}

	/**
	 * 乘法
	 * 
	 * @param a
	 * @param b
	 * @return
	 */
	public int squ(int a, int b) {
		return a * b;
	}

	/**
	 * 此方法未写好
	 * 
	 * @param a
	 * @param b
	 */
	public void mul(int a, int b) {

	}

	/**
	 * Bug : 死循环
	 * 
	 * @param n
	 */
	public void squareRoot(int n) {
		for (;;)
			;
	}

	/**
	 * 结果将清零
	 */
	public void clear() {
		result = 0;
	}

	public int getResult() {
		return result;
	}
	
	 public void square(int n) {
	        result = n * n;
	 }

}
