package jp.ac.uryukyu.ie.e205713;

import java.util.Random;

public class Computer {
    
    private int num;

    public void ran(){
        Random rand = new Random();
        num = rand.nextInt(90) + 10;
        //computerがランダムで生成した2桁の数字をprint
        System.out.println(num);

    }

    public int getNum() {
        return num;
    }

    public int cpTens(){
        return num / 10;
    }

    public int cpOnes() {
        return num % 10;
    }
     
}
