package jp.ac.uryukyu.ie.e205713;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Scan {
    Scanner scan = new Scanner(System.in);
    //private int val = scan.nextInt();
    private int val2 = scan.nextInt();

    /*public void scan(){
        try {
            boolean value = false;
            while (value == false) {
                if (10 <= val && val <= 99) {
                    System.out.println("あなたが入力した数字は: " + val + " です");
                    //scan.close();
                    value = true;
                } else {
                    System.out.println("2桁の数値ではありません。再度、2桁の数値を入力してください。");
                    val = scan.nextInt();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("型が違います：" + e);
        }
    }*/

    public void scan2() {
        try {
            boolean value = false;
            while (value == false) {
                if (10 <= val2 && val2 <= 99) {
                    System.out.println("あなたが入力した数字は: " + val2 + " です");
                    // scan.close();
                    value = true;
                } else {
                    System.out.println("2桁の数値ではありません。再度、2桁の数値を入力してください。");
                    val2 = scan.nextInt();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("型が違います：" + e);
        }
    }

    /*public int getVal(){
        return val;
    }*/

    public int getVal2() {
        return val2;
    }
}
