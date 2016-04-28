package com.edu.qdu.game;

import java.util.Scanner;

public  class Person extends Player {
	Scanner input = new Scanner(System.in);
	 // 玩家名字
	public void inputName() {
		setPlayName(input.next());
	}
	 // 玩家出拳
	public int myFist() {
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("剪刀");
			break;
		case 2:
			System.out.println("石头");
			break;
		case 3:
			System.out.println("布");
			break;

		default:
			System.out.println("你的选择有误！请重新选择！");
			break;
		}
		return num;
	}
	

}
