package com.edu.qdu.game;

import java.util.Scanner;

public class Person extends Player {

	 // �������
	public String inputName(String name) {
		Scanner input = new Scanner(System.in);
		name = input.next();
		return name;
	}

	 // ��ҳ�ȭ
	public int myFist(int num) {
		Scanner input2 = new Scanner(System.in);
		num = input2.nextInt();
		switch (num) {
		case 1:
			System.out.println("ʯͷ");
			break;
		case 2:
			System.out.println("����");
			break;
		case 3:
			System.out.println("��");
			break;

		default:
			System.out.println("���ѡ������");
			break;
		}

		return num;
	}

}
