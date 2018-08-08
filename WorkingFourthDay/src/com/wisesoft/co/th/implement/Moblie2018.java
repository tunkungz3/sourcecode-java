package com.wisesoft.co.th.implement;

public interface Moblie2018 {
	void takePhoto();
}
interface Mobile2019 extends Moblie,Moblie2018{
	void gps() ;
}
class Samsung implements Moblie{

	@Override
	public void phone() {
	}

	@Override
	public void playMusic() {
	}
	
}
class IphoneX implements Moblie,Moblie2018{

	@Override
	public void takePhoto() {
	}

	@Override
	public void phone() {
	}

	@Override
	public void playMusic() {
	}
	
}
class IphoneXV implements Mobile2019{

	@Override
	public void phone() {
	}

	@Override
	public void playMusic() {
	}

	@Override
	public void takePhoto() {
	}

	@Override
	public void gps() {
	}
	
}
