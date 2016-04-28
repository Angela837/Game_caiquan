package com.edu.qdu.game;

import java.util.Scanner;
 class Computer extends Player {

	//给电脑选择名字
	public String inputName(String name) {
		
		switch (name) {
		case "1":
			playName="刘备";
			break;
		case "2":
			playName="孙权";
			break;
		case "3":
			playName="曹操";
			break;

		default:
			System.out.println("你的选择有误!请重新选择！");
			break;
		}
		return playName;
	}

	//电脑出拳
	public int myFist(int num) {
		num = (int) (Math.random()  * 2 + 1);
		if(num==1){
			System.out.println("剪刀");
			
		}else if(num==2){
			System.out.println("石头");
			
		}else{
			System.out.println("布");
		}
		return num;
	}

	
	


	

}
