package com.wisesoft.co.th.collection;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class IsogramTest {

	@Test
	public void test() {
		Isogram isogram = new Isogram();
		String text = "lumberjacks";
		assertTrue(isogram.check(text));
	}
	@Test
	public void test1() {
		Isogram isogram = new Isogram();
		String text = "six-year-old";
		assertTrue(isogram.check(text));
	}
	
	@Test
	public void test2() {
		Isogram isogram = new Isogram();
		String text = "six year old";
		assertTrue(isogram.check(text));
	}
	
	@Test
	public void test3() {
		Isogram isogram = new Isogram();
		String text = "six year-old";
		assertTrue(isogram.check(text));
	}
	
	@Test
	public void test4() {
		Isogram isogram = new Isogram();
		String text = "six-year old";
		assertTrue(isogram.check(text));
	}
	@Test
	public void test5() {
		Isogram isogram = new Isogram();
		String text = "laumberjack";
		assertFalse(isogram.check(text));
	}

}
