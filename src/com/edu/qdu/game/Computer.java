package com.edu.qdu.game;

import java.util.Scanner;

public class Computer extends Player {

	//������ѡ������
	public String inputName(String name) {
		Scanner input3 = new Scanner(System.in);
		name=input3.next();
		switch (name) {
		case "1":
			System.out.println("��ѡ����������");
			break;
		case "2":
			System.out.println("��ѡ������Ȩ��");
			break;
		case "3":
			System.out.println("��ѡ���˲ܲ٣�");
			break;

		default:
			System.out.println("���ѡ������");
			break;
		}
		return name;
	}

	//���Գ�ȭ
	public int myFist(int num) {
		num = (int) (Math.random() * 10 * 2 + 1);
		if(num==1){
			System.out.println("ʯͷ");
			
		}else if(num==2){
			System.out.println("����");
			
		}else if(num==3){
			System.out.println("��");
		}
		return num;
	}


	

}
