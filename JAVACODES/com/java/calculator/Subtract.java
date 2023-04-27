package com.java.calculator;

public class Subtract implements Operate {

	@Override
	public Double getResult(Double... numbers) {
		Double result = numbers[0];
		for(int i=1; i<numbers.length; i++) {
			result -= numbers[i];
		}
		return result;
	}
}

	
	
//	@Override
//	public Double getResult(Double... numbers) {
//		 Double sub = 0.0;
//	        for(Double num : numbers) {
//	        	sub -= num;
//	        }
//			return sub;
//	
//	}}


