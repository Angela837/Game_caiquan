package com.edu.qdu.game;

import java.util.Scanner;

public  class Person extends Player {
	Scanner input = new Scanner(System.in);
	 // �������
	public void inputName() {
		String name=input.next();
		setPlayName(name);
	}
	 // ��ҳ�ȭ
	public int myFist() {
		int num=input.nextInt();
		switch (num) {
		case 1:
			System.out.println("���ȭ������");
			break;
		case 2:
			System.out.println("���ȭ��ʯͷ");
			break;
		case 3:
			System.out.println("���ȭ����");
			break;

		default:
			System.out.println("���ѡ������������ѡ��");
			break;
		}
		return num;
	}
	

}
