package com.edu.qdu.game;

public abstract class  Player {
	
	private String playName;//�������
	private int winningTimes;//���Ӯ����
	public abstract void inputName();//��������
		
	public abstract int myFist();//����ȭ

	public String getPlayName() {
		return playName;
	}

	public  String setPlayName(String playName) {
		return this.playName = playName;
	}

	public int getWinningTimes() {
		return winningTimes;
	}

	public void setWinningTimes(int winningTimes) {
		this.winningTimes = winningTimes;
	}
		
	
}
