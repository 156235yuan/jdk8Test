package cn.mytest;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Test {

	public static void main(String[] args) {

		// test1((String s) -> s.length());

		test1(String::length);

		List<String> list = new ArrayList<>();
		list.add("aa");
		list.add("bcd");
		list.add("oip");
		list.add("ereer");

		List<String> testPredicate = testPredicate(list, (String s1) -> s1.length() == 3);
		for (String string : testPredicate) {
			System.out.println(string);
		}

	}

	public static <T> List<T> testPredicate(List<T> list, Predicate<T> pi) {
		List<T> newList = new ArrayList<>();
		for (T t : list) {
			if (pi.test(t)) {
				newList.add(t);
			}
		}

		return newList;
	}

	public static void test1(DefaultInterface di) {
		String s = "abx";
		System.out.println(di.test(s));
	}
}
