package com.edu.qdu.game;

import java.util.Scanner;

public class Judger {

	private static Person person = new Person();// 初始化Person
	private static Computer computer = new Computer();// 初始化Computer
	private static int total = 0;// 定义总局数

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String yn = null;// 定义是否继续的y/n
		Judger j = new Judger();// 初始化Judger

		j.startGame();
		j.askName();

		System.out.print("要开始么？（y/n）");
		yn = input.next();
		if (yn.equals("n")) {
			System.out.println("游戏退出！");
		} else {
			do {// 控制循环
				j.playGame();
				System.out.print("是否开始下一轮（y/n）:");
				yn = input.next();
			} while (yn.equals("y"));// y时游戏继续
			if (yn == "n") {// n时游戏退出
				System.out.println("游戏已退出！");
			}
			System.out.println("------------------------");
			System.out.println("对战次数：" + total);
			System.out.println("姓名" + "\t" + "得分");
			System.out.println(person.getPlayName() + "\t" + person.getWinningTimes());
			System.out.println(computer.getPlayName() + "\t" + computer.getWinningTimes());

			String f = j.finalResult();
			System.out.println(f);
		}
	}

	// 开始游戏
	public void startGame() {
		System.out.println("\t" + "******************");
		System.out.println("\t" + "**   猜拳,开始       **");
		System.out.println("\t" + "******************");
		System.out.println("出拳规则：1.剪刀  2.石头  3.布");

	}

	// 询问名字
	public void askName() {
		Scanner input = new Scanner(System.in);
		String n = null;

		System.out.print("请选择对方的角色（1：刘备 2：孙权 3：曹操）：");
		computer.inputName();

		System.out.print("请输入你的名字：");
		person.inputName();
		System.out.println(computer.getPlayName() + "  VS  " + person.getPlayName());

	}

	// 进行游戏
	public void playGame() {
		Scanner input = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("请出拳：1.剪刀2.石头3.布（输入相应的数字）：");
			a = person.myFist();

		} while (a != 1 && a != 2 && a != 3);
		System.out.print(computer.getPlayName() + "出拳：");
		int b = computer.myFist();// 随机的电脑出拳

		// 判断当局胜负
		if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
			System.out.println("结果说：你赢了，真棒！");
			person.setWinningTimes(person.getWinningTimes() + 1);
		} else if (a == 1 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1) {
			System.out.println("结果说：你输了，真笨！");
			computer.setWinningTimes(computer.getWinningTimes() + 1);
		} else {
			System.out.println("结果说：平局诶╮(╯▽╰)╭！");

		}
		total++;

	}

	// 最终结果
	public String finalResult() {
		String fr = null;
		// 判断最终胜负
		if (person.getWinningTimes() > computer.getWinningTimes()) {
			fr = "结果：呵呵，你真聪明下次再来玩啊！";
		} else if (person.getWinningTimes() < computer.getWinningTimes()) {
			fr = "结果：呵呵，笨笨下次加油啊！";
		} else {
			fr = "结果：这么幸运，竟然平局！";

		}
		return fr;

	}

}
