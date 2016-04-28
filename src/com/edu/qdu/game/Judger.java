package com.edu.qdu.game;

import java.util.Scanner;

public class Judger {

	private static Person person = new Person();// ��ʼ��Person
	private static Computer computer = new Computer();// ��ʼ��Computer
	private static int total = 0;// �����ܾ���

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		String yn = null;// �����Ƿ������y/n
		Judger j = new Judger();// ��ʼ��Judger

		j.startGame();
		j.askName();

		System.out.print("Ҫ��ʼô����y/n��");
		yn = input.next();
		if (yn.equals("n")) {
			System.out.println("��Ϸ�˳���");
		} else {
			do {// ����ѭ��
				j.playGame();
				System.out.print("�Ƿ�ʼ��һ�֣�y/n��:");
				yn = input.next();
			} while (yn.equals("y"));// yʱ��Ϸ����
			if (yn == "n") {// nʱ��Ϸ�˳�
				System.out.println("��Ϸ���˳���");
			}
			System.out.println("------------------------");
			System.out.println("��ս������" + total);
			System.out.println("����" + "\t" + "�÷�");
			System.out.println(person.getPlayName() + "\t" + person.getWinningTimes());
			System.out.println(computer.getPlayName() + "\t" + computer.getWinningTimes());

			String f = j.finalResult();
			System.out.println(f);
		}
	}

	// ��ʼ��Ϸ
	public void startGame() {
		System.out.println("\t" + "******************");
		System.out.println("\t" + "**   ��ȭ,��ʼ       **");
		System.out.println("\t" + "******************");
		System.out.println("��ȭ����1.����  2.ʯͷ  3.��");

	}

	// ѯ������
	public void askName() {
		Scanner input = new Scanner(System.in);
		String n = null;

		System.out.print("��ѡ��Է��Ľ�ɫ��1������ 2����Ȩ 3���ܲ٣���");
		computer.inputName();

		System.out.print("������������֣�");
		person.inputName();
		System.out.println(computer.getPlayName() + "  VS  " + person.getPlayName());

	}

	// ������Ϸ
	public void playGame() {
		Scanner input = new Scanner(System.in);
		int a = 0;
		do {
			System.out.print("���ȭ��1.����2.ʯͷ3.����������Ӧ�����֣���");
			a = person.myFist();

		} while (a != 1 && a != 2 && a != 3);
		System.out.print(computer.getPlayName() + "��ȭ��");
		int b = computer.myFist();// ����ĵ��Գ�ȭ

		// �жϵ���ʤ��
		if (a == 1 && b == 3 || a == 2 && b == 1 || a == 3 && b == 2) {
			System.out.println("���˵����Ӯ�ˣ������");
			person.setWinningTimes(person.getWinningTimes() + 1);
		} else if (a == 1 && b == 2 || a == 2 && b == 3 || a == 3 && b == 1) {
			System.out.println("���˵�������ˣ��汿��");
			computer.setWinningTimes(computer.getWinningTimes() + 1);
		} else {
			System.out.println("���˵��ƽ�����r(�s���t)�q��");

		}
		total++;

	}

	// ���ս��
	public String finalResult() {
		String fr = null;
		// �ж�����ʤ��
		if (person.getWinningTimes() > computer.getWinningTimes()) {
			fr = "������Ǻǣ���������´������氡��";
		} else if (person.getWinningTimes() < computer.getWinningTimes()) {
			fr = "������Ǻǣ������´μ��Ͱ���";
		} else {
			fr = "�������ô���ˣ���Ȼƽ�֣�";

		}
		return fr;

	}

}
