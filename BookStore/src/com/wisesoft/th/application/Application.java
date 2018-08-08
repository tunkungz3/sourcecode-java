package com.wisesoft.th.application;

import java.util.ArrayList;
import java.util.List;

import com.wisesoft.th.xxx.Base;
import com.wisesoft.th.yyy.Sub;
import com.wisesoft.th.yyy.Sub2;

public class Application {

	public static void main(String[] args) {
		List<Base> baseList = new ArrayList<>();
		baseList.add(new Base());
		baseList.add(new Sub());
		baseList.add(new Sub2());
		
		for(Base base : baseList) {
			base.call();
		}
	}

}
