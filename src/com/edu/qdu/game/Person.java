package com.edu.qdu.game;

public class Person extends Player {

	 // �������
	public String inputName(String name) {
		return name;
	}
	 // ��ҳ�ȭ
	public int myFist(int num) {
		boolean flag=false;
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
