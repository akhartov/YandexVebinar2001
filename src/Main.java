package ru.my;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int magicNumber = Math.abs(new Random().nextInt())%10;
        System.out.println("�������� �����. ��������� ���.");
        System.out.println(magicNumber);
        Scanner s = new Scanner(System.in);
        for (int i = 0; i < 3; ++i) {
            try {
                System.out.println("������� �����");
                int myInt = s.nextInt();
                if (myInt > magicNumber)
                    System.out.println("���� ����� ������");
                else if (myInt < magicNumber)
                    System.out.println("���� ����� ������");
                else {
                    System.out.println("�������");
                    break;
                }

                System.out.println("��� ���? 1/0");
                int next = s.nextInt();
                if (next == 1)
                    continue;
                break;
            } catch (java.util.InputMismatchException e) {
                s.next();
                System.out.println(e);
                System.out.println("���-�� �� �� �����");
            } catch (Exception e) {
                System.out.println("�����-�� ����� ��������!");
            }
        }
    }
}
