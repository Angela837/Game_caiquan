package com.edu.qdu.game;

import java.util.Scanner;

public class Judger {

	static Person person = new Person();// ��ʼ��Person
	static Computer computer = new Computer();// ��ʼ��Computer

	static int total = 0;// �����ܾ���

	public static void main(String[] args) {
		String yn = null;// �����Ƿ������y/n
		Judger j = new Judger();// ��ʼ��Judger

		j.startGame();
		j.askName();

		System.out.println("Ҫ��ʼô����y/n��");
		Scanner input = new Scanner(System.in);
		yn = input.next();
		if (yn.equals("n")) {
			System.out.println("��Ϸ�˳���");
		} else {
			do {// ����ѭ��
				j.playGame();
				System.out.println("�Ƿ�ʼ��һ�֣�y/n��:");
				yn = input.next();
			} while (yn.equals("y"));// yʱ��Ϸ����
			if (yn == "n") {// nʱ��Ϸ�˳�
				System.out.println("��Ϸ���˳���");
			}
			System.out.println("------------------------");
			System.out.println("��ս������" + total);
			System.out.println("����" + "\t" + "�÷�");
			System.out.println(person.playName + "\t" + person.winningTimes);
			System.out.println(computer.playName + "\t" + computer.winningTimes);

			String f = j.finalResult();
			System.out.println(f);
		}
	}

	public void startGame() {
		System.out.println("\t" + "******************");
		System.out.println("\t" + "**    ��ȭ,��ʼ       **");
		System.out.println("\t" + "******************");
		System.out.println("��ȭ����1.����  2.ʯͷ  3.��");

	}

	public void askName() {
		Scanner input = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("��ѡ��Է��Ľ�ɫ��1������ 2����Ȩ 3���ܲ٣���");
			String n = input.next();
			computer.inputName(n);// n�������ѡ������ ����computer����input�����е�name
									// �����ͱ��������
		} while (a != 1 && a != 2 && a != 3);

		System.out.print("������������֣�");
		Scanner input1 = new Scanner(System.in);
		person.playName = input.next();
		System.out.println(computer.playName + "  VS  " + person.playName);

	}

	public void playGame() {
		Scanner input = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("���ȭ��1.����2.ʯͷ3.����������Ӧ�����֣���");
			int nump = input.nextInt();//
			System.out.print("���ȭ��");
			a = person.myFist(nump);
		} while (a != 1 && a != 2 && a != 3);
		System.out.print(computer.playName + "��ȭ��");
		int b = computer.myFist(0);//����ĵ��Գ�ȭ
		
		// �жϵ���ʤ��
		if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
			System.out.println("���˵����Ӯ�ˣ������");
			person.winningTimes++;
		} else if (a == 1 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1) {
			System.out.println("���˵�������ˣ��汿��");
			computer.winningTimes++;
		} else {
			System.out.println("ƽ�����r(�s���t)�q��");

		}
		total++;

	}

	public String finalResult() {
		String fr = null;
		//�ж�����ʤ��
		if (person.winningTimes > computer.winningTimes) {
			fr = "������Ǻǣ���������´������氡��";
		} else if (person.winningTimes < computer.winningTimes) {
			fr = "������Ǻǣ������´μ��Ͱ���";
		} else {
			fr = "�������ô���ˣ���Ȼƽ�֣�";

		}
		return fr;

	}

}
