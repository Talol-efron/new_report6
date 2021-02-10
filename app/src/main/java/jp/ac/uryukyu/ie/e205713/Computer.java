package jp.ac.uryukyu.ie.e205713;

import java.util.Random;

public class Computer {
    private int num;
    //private int num2;

    public void ran(){
        Random rand = new Random();
        num = rand.nextInt(100);
        //computerがランダムで生成した2桁の数字をprint
        System.out.println(num);
    }

    /*public void printRan() {
        Random rand2 = new Random();
        num2 = rand2.nextInt(100);
        // computerがランダムで生成した2桁の数字をprint
        System.out.println(num2);
    }*/
    public int getNum() {
        return num;
    }

    /*public int getNum2(){
        return num2;
    }*/
    
}
