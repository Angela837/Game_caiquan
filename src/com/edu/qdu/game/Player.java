package com.edu.qdu.game;

public abstract class  Player {
	
	private String playName;//�������
	private int winningTimes;//���Ӯ����
	
	public abstract void inputName();//��������	
	public abstract int myFist();//����ȭ

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
