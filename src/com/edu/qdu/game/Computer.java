package com.edu.qdu.game;

import java.util.Scanner;
 class Computer extends Player {

	//������ѡ������
	public String inputName(String name) {
		
		switch (name) {
		case "1":
			playName="����";
			break;
		case "2":
			playName="��Ȩ";
			break;
		case "3":
			playName="�ܲ�";
			break;

		default:
			System.out.println("���ѡ������!������ѡ��");
			break;
		}
		return playName;
	}

	//���Գ�ȭ
	public int myFist(int num) {
		num = (int) (Math.random()  * 2 + 1);
		if(num==1){
			System.out.println("����");
			
		}else if(num==2){
			System.out.println("ʯͷ");
			
		}else{
			System.out.println("��");
		}
		return num;
	}

	
	


	

}
