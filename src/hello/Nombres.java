package hello;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Random;

//package java.math;

public class Nombres {

	public static void main(String[] args) {
		int i0 = 1;
		Integer i1 = new Integer(1);
		Integer i10 = Integer.valueOf(10);
		Integer.parseInt("123");
		System.out.println(String.valueOf(123));
		Double d1 = new Double(1);
		
		int i2 = Integer.parseInt("123");
		System.out.println(i2);
		
		System.out.println(Integer.toHexString(255));
		
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Integer.BYTES);
		System.out.println(Integer.SIZE);
		
		BigInteger bi1 = new BigInteger ("123456789");
		System.out.println(bi1);
		BigInteger bi2 = new BigInteger ("876543210");
		System.out.println(bi1.add(bi2));
		
		BigDecimal bd1 = new BigDecimal("0.1");
		BigDecimal bd2 = new BigDecimal("0.2");
		
		System.out.println(bd1.add(bd2));
		System.out.println(0.1+0.2);
		
		System.out.println(Math.random()); // peu utilisé
		
		Random rand = new Random();
		System.out.println(rand.nextInt(50));
		
		
		

	}

}
