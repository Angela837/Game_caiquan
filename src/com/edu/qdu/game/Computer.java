package com.edu.qdu.game;

import java.util.Scanner;
 class Computer extends Player {
	 Scanner input = new Scanner(System.in);
	//������ѡ������
	public void inputName() {
		int name=input.nextInt();
		switch (name) {
		case 1:
			setPlayName("����");
			break;
		case 2:
			setPlayName("��Ȩ");
			break;
		case 3:
			setPlayName("�ܲ�");
			break;

		default:
			System.out.println("���ѡ������!������ѡ��");
			break;
		}
		
	}



	//���Գ�ȭ
	public int myFist() {
		int num = (int) (Math.random()  * 3 + 1);
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
