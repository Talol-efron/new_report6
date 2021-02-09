package jp.ac.uryukyu.ie.e205713;

import java.util.Scanner;
import java.util.InputMismatchException;

public class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }
    /**
     * 
     * @return name
     */
    public String getName(){
        return name;
    }

    public void start(){
        System.out.println("3桁の数値を入力して下さい。");

        Scanner scan = new Scanner(System.in);

        try {
            int val = scan.nextInt();
            boolean value = false;
            while(value == false){
                if (100 <= val && val <= 999) {
                    System.out.println(name + "が入力した数字は: " + val + " です");
                    scan.close();
                    value = true;
                } else {
                    System.out.println("3桁の数値ではありません。再度、3桁の数値を入力してください。");
                    val = scan.nextInt();
                }
            }
            
        } catch (InputMismatchException e) {
            System.out.println("型が違います：" + e);
        }
    }
}
