package jp.ac.uryukyu.ie.e205713;

//import java.util.Scanner;
//import java.util.InputMismatchException;

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

    Scan value = new Scan();

    public void Generate(){
        System.out.println("あなたが考えるcomputerの数字を入力してください");
        waitMoment(1000);
        value.scan();
    }
}
