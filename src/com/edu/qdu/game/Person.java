package com.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {

	 // 玩家名字
	public String inputName(String name) {
		Scanner input = new Scanner(System.in);
		name = input.next();
		return name;
	}

	 // 玩家出拳
	public int myFist(int num) {
		Scanner input2 = new Scanner(System.in);
		num = input2.nextInt();
		switch (num) {
		case 1:
			System.out.println("石头");
			break;
		case 2:
			System.out.println("剪刀");
			break;
		case 3:
			System.out.println("布");
			break;

		default:
			System.out.println("你的选择有误！");
			break;
		}

		return num;
	}

}
