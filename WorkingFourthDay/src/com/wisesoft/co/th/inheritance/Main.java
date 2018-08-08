package com.wisesoft.co.th.inheritance;

abstract class Template {
	public abstract void header();
	public abstract void body();
	public abstract void footer();
	public void generateTemplate() {
		header();
		body();
		footer();
	}
}

class Reporter extends Template{

	@Override
	public void header() {
		System.out.println("Header");
	}
	@Override
	public void body() {
		System.out.println("Body");
	}

	@Override
	public void footer() {
		System.out.println("Footer");
	}
	
}

public class Main{
	public static void main(String[] arg) {
		
	}
}