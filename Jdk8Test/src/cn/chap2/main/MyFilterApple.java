package cn.chap2.main;

public class MyFilterApple implements FilterApple {

	@Override
	public String sysoApple(Apple apple) {
		return apple.toString();
	}

}
