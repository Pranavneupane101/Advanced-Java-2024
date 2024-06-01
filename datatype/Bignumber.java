package datatype;

import java.math.BigDecimal;
import java.math.BigInteger;

public class Bignumber {
	
	/*
	 * a>BigInteger
	 * b>BigDecimal
	 */
	public static void main(String[] args) {
		BigInteger a= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger b= BigInteger.valueOf(Long.MAX_VALUE);
		BigInteger c=a.add(b);
		System.out.println(c);
	}
	
	BigDecimal y=BigDecimal.valueOf(Double.MAX_VALUE);
	
	

}
