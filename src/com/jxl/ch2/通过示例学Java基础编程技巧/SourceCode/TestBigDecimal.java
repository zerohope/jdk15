package com.jxl.ch2.通过示例学Java基础编程技巧.SourceCode;
import java.math.BigDecimal;

public class TestBigDecimal
{
	public static void main(String[] args) 
	{
		BigDecimal f1 = new BigDecimal("0.05");
		BigDecimal f2 =new BigDecimal("0.01");
		System.out.println("使用String作为BigDecimal构造器参数的计算结果：");
		System.out.println("0.05 + 0.01 = " + f1.add(f2));
		System.out.println("0.05 - 0.01 = " + f1.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f1.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f1.divide(f2));

		System.out.println("使用double作为BigDecimal构造器参数的计算结果：");
		BigDecimal f3 = new BigDecimal(0.05);
		System.out.println("0.05 + 0.01 = " + f3.add(f2));
		System.out.println("0.05 - 0.01 = " + f3.subtract(f2));
		System.out.println("0.05 * 0.01 = " + f3.multiply(f2));
		System.out.println("0.05 / 0.01 = " + f3.divide(f2));
	}
}
