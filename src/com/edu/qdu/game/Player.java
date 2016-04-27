package com.edu.qdu.game;

public abstract class  Player {
	String playName;//玩家名字
	int winningTimes;//玩家赢次数
	public abstract String inputName(String name);//输入名字
	
	
	public abstract int myFist(int num);//所出拳
		
	
}
