package com.wisesoft.co.th.collection;

import java.util.HashSet;
import java.util.Set;

public class Isogram {

	private static final char HYPHEN = '-';
	private static final char WHITESPACE = ' ';

	public boolean check(String text) {
		Set<Character> check = new HashSet<>();
		char ch;
		for (int i = 0; i < text.length(); i++) {
			ch = text.toLowerCase().charAt(i);

			if (notWhitespace(ch) && notHyphen(ch)) {
				if (checkDuplicate(check, ch)) {
					return false;
				}
			}
		}
		return true;
	}

	public boolean check2(String text) {
		Set<Character> check = new HashSet<>();
		text = text.toLowerCase();
		text = text.replaceAll(" ", "");
		text = text.replaceAll("-", "");
		for (int i = 0; i < text.length(); i++) {
			if (checkDuplicate(check,  text.charAt(i))) {
				return false;
			}
		}
		return true;
	}

	private boolean checkDuplicate(Set<Character> check, char ch) {
		return !(check.add(ch));
	}

	private boolean notHyphen(char ch) {
		return HYPHEN != ch;
	}

	private boolean notWhitespace(char ch) {
		return WHITESPACE != ch;
	}

}
