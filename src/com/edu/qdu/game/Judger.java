package com.edu.qdu.game;

import java.util.Scanner;

public class Judger {

	static Person person = new Person();// 初始化Person
	static Computer computer = new Computer();// 初始化Computer

	static int total = 0;// 定义总局数

	public static void main(String[] args) {
		String yn = null;// 定义是否继续的y/n
		Judger j = new Judger();// 初始化Judger

		j.startGame();
		j.askName();

		System.out.println("要开始么？（y/n）");
		Scanner input = new Scanner(System.in);
		yn = input.next();
		if (yn.equals("n")) {
			System.out.println("游戏退出！");
		} else {
			do {// 控制循环
				j.playGame();
				System.out.println("是否开始下一轮（y/n）:");
				yn = input.next();
			} while (yn.equals("y"));// y时游戏继续
			if (yn == "n") {// n时游戏退出
				System.out.println("游戏已退出！");
			}
			System.out.println("------------------------");
			System.out.println("对战次数：" + total);
			System.out.println("姓名" + "\t" + "得分");
			System.out.println(person.playName + "\t" + person.winningTimes);
			System.out.println(computer.playName + "\t" + computer.winningTimes);

			String f = j.finalResult();
			System.out.println(f);
		}
	}

	public void startGame() {
		System.out.println("\t" + "******************");
		System.out.println("\t" + "**    猜拳,开始       **");
		System.out.println("\t" + "******************");
		System.out.println("出拳规则：1.剪刀  2.石头  3.布");

	}

	public void askName() {
		Scanner input = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("请选择对方的角色（1：刘备 2：孙权 3：曹操）：");
			String n = input.next();
			computer.inputName(n);// n是玩家所选的数字 传给computer类中input方法中的name
									// 这样就变成了人名
		} while (a != 1 && a != 2 && a != 3);

		System.out.print("请输入你的名字：");
		Scanner input1 = new Scanner(System.in);
		person.playName = input.next();
		System.out.println(computer.playName + "  VS  " + person.playName);

	}

	public void playGame() {
		Scanner input = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("请出拳：1.剪刀2.石头3.布（输入相应的数字）：");
			int nump = input.nextInt();//
			System.out.print("你出拳：");
			a = person.myFist(nump);
		} while (a != 1 && a != 2 && a != 3);
		System.out.print(computer.playName + "出拳：");
		int b = computer.myFist(0);//随机的电脑出拳
		
		// 判断当局胜负
		if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
			System.out.println("结果说：你赢了，真棒！");
			person.winningTimes++;
		} else if (a == 1 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1) {
			System.out.println("结果说：你输了，真笨！");
			computer.winningTimes++;
		} else {
			System.out.println("平局诶╮(╯▽╰)╭！");

		}
		total++;

	}

	public String finalResult() {
		String fr = null;
		//判断最终胜负
		if (person.winningTimes > computer.winningTimes) {
			fr = "结果：呵呵，你真聪明下次再来玩啊！";
		} else if (person.winningTimes < computer.winningTimes) {
			fr = "结果：呵呵，笨笨下次加油啊！";
		} else {
			fr = "结果：这么幸运，竟然平局！";

		}
		return fr;

	}

}
