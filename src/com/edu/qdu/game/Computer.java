package com.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {

	//给电脑选择名字
	public String inputName(String name) {
		Scanner input3 = new Scanner(System.in);
		name=input3.next();
		switch (name) {
		case "1":
			System.out.println("你选择了刘备！");
			break;
		case "2":
			System.out.println("你选择了孙权！");
			break;
		case "3":
			System.out.println("你选择了曹操！");
			break;

		default:
			System.out.println("你的选择有误！");
			break;
		}
		return name;
	}

	//电脑出拳
	public int myFist(int num) {
		num = (int) (Math.random() * 10 * 2 + 1);
		if(num==1){
			System.out.println("石头");
			
		}else if(num==2){
			System.out.println("剪刀");
			
		}else if(num==3){
			System.out.println("布");
		}
		return num;
	}


	

}
