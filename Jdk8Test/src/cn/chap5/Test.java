package cn.chap5;

import java.util.Arrays;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		Trader raoul = new Trader("Raoul", "Cambridge");
		Trader mario = new Trader("Mario", "Milan");
		Trader alan = new Trader("Alan", "Cambridge");
		Trader brian = new Trader("Brian", "Cambridge");
		List<Transaction> transactions = Arrays.asList(new Transaction(brian, 2011, 300),
				new Transaction(raoul, 2012, 1000), new Transaction(raoul, 2011, 400),
				new Transaction(mario, 2012, 710), new Transaction(mario, 2012, 700), new Transaction(alan, 2012, 950));

		// 1、找出2011年发生的所有交易，并按交易额排序（从低到高）。
		transactions.stream().filter(t -> t.getYear() == 2011).sorted(comparing(Transaction::getValue))
				.collect(toList());

		// (2) 交易员都在哪些不同的城市工作过？
		transactions.stream().map(t -> t.getTrader().getCity()).distinct().collect(toList());

		// (3) 查找所有来自于剑桥的交易员，并按姓名排序
		transactions.stream().filter(t -> t.getTrader().getCity().equals("剑桥")).sorted().collect(toList());

		// (4) 返回所有交易员的姓名字符串，按字母顺序排序
		transactions.stream().map(t -> t.getTrader().getName()).sorted(comparing(String)).collect(toList());
		
		// (5) 有没有交易员是在米兰工作的？
		transactions.stream().filter(t -> t.getTrader().getCity().equals("米兰")).findAny();
		
		// (6) 打印生活在剑桥的交易员的所有交易额
		transactions.stream().filter(t -> t.getTrader().getCity().equals("剑桥")).forEach(System.out::print());
		
		// 所有交易中，最高的交易额是多少？ 

		/**
		 * 4) 返回所有交易员的姓名字符串，按字母顺序排序。 (5) 有没有交易员是在米兰工作的？ (6) 打印生活在剑桥的交易员的所有交易额。 (7)
		 * 所有交易中，最高的交易额是多少？ (8) 找到交易额最小的交易。
		 */

	}

}
