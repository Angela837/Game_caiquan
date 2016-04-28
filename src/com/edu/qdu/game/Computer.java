package com.edu.qdu.game;

import java.util.Scanner;
 class Computer extends Player {
	 Scanner input = new Scanner(System.in);
	//给电脑选择名字
	public void inputName() {
		int name=input.nextInt();
		switch (name) {
		case 1:
			setPlayName("刘备");
			break;
		case 2:
			setPlayName("孙权");
			break;
		case 3:
			setPlayName("曹操");
			break;

		default:
			System.out.println("你的选择有误!请重新选择！");
			break;
		}
		
	}



	//电脑出拳
	public int myFist() {
		int num = (int) (Math.random()  * 3 + 1);
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
