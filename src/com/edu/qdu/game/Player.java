package com.edu.qdu.game;

public abstract class  Player {
	
	private String playName;//玩家名字
	private int winningTimes;//玩家赢次数
	
	public abstract void inputName();//输入名字	
	public abstract int myFist();//所出拳

	public String getPlayName() {
		return playName;
	}

	public  void setPlayName(String playName) {
		 this.playName = playName;
	}

	public int getWinningTimes() {
		return winningTimes;
	}

	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
		
	
}
