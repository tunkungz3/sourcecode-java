package com.wisesoft.co.th.implement;

import java.util.Random;

public class RandomNumber {
	public int randomNumber(Random random) {
		return random.nextInt(10);
	}

	public static void main(String[] args) {
		RandomNumber randomNumber = new RandomNumber();
		int i = 0;
		while(i<10) {
			System.out.print(String.format("%d ", randomNumber.randomNumber(new Random())));
			i++;
		}
	}

}
