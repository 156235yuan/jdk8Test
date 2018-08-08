package cn.chap2.main;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		List<Apple> inventory = Arrays.asList(new Apple(80, "green"), new Apple(155, "green"), new Apple(120, "red"));
		prettyPrintApple(inventory, new MyFilterApple());

	}

	public static void prettyPrintApple(List<Apple> inventory, FilterApple fa) {
		for (Apple apple : inventory) {
			String output = fa.sysoApple(apple);
			System.out.println(output);
		}
	}
}
