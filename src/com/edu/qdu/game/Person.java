package com.edu.qdu.game;

import java.util.Scanner;

public  class Person extends Player {
	Scanner input = new Scanner(System.in);
	 // �������
	public void inputName() {
		setPlayName(input.next());
	}
	 // ��ҳ�ȭ
	public int myFist() {
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("����");
			break;
		case 2:
			System.out.println("ʯͷ");
			break;
		case 3:
			System.out.println("��");
			break;

		default:
			System.out.println("���ѡ������������ѡ��");
			break;
		}
		return num;
	}
	

}
