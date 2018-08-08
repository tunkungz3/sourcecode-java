package com.wisesoft.co.th.implement;

import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Test;

public class RandomNumberTest {

	@Test
	public void test() {
		RandomNumber rand = new RandomNumber();
		assertEquals(5, rand.randomNumber(new Random5()));

	}
	//Override by method;	
	class Random5 extends Random{		
		@Override
		public int nextInt(int arg0) {
			return 5;
		}
	}

}
