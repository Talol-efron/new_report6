package jp.ac.uryukyu.ie.e205713;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    /**
     * nameのgetterメソッド
     * @return name
     */
    public String getName(){
        return name;
    }

    Scanner scan = new Scanner(System.in);
    int val = scan.nextInt();

    /**
     * ユーザーに2桁（10から99）を入力させる。
     * 数字が範囲外であれば、もう一度範囲内の数字を入力させる。
     * ユーザーが数字以外を入力した場合は、catchに移る。
     * ユーザーが2桁の数字を入力するまで、無限ループ
     */
    public int scan() {
        try {
            boolean value = false;
            while (value == false) {
                if (10 <= val && val <= 99) {
                    System.out.println("あなたが入力した数字は: " + val + " です");
                    // scan.close();
                    value = true;
                } else {
                    System.out.println("2桁の数値ではありません。再度、2桁の数値を入力してください。");
                    val = scan.nextInt();
                }
            }

        } catch (InputMismatchException e) {
            System.out.println("型が違います：" + e);
        }return val;
    }

    /**
     * valのgetterメソッド
     * @return val
     */
    public int getVal() {
        return val;
    }

    /**
     * valの10の位のみを返す
     * @return valの10の位
     */
    public int playerTens(){
        return val / 10;
    }

    /**
     * valの1の位のみを返す
     * @return valの1の位
     */
    public int playerOnes() {
        return val % 10;
    }

    

    /**
     * timeに数値を入力することによって、その数値分、時間を開けて処理を行うことができる。
     * @param time int型の時間を入力
     */
    public void waitMoment(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
