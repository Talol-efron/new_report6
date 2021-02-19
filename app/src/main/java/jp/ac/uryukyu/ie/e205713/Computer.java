package jp.ac.uryukyu.ie.e205713;

import java.util.Random;

public class Computer {
    
    private int num;

    /**
     * ランダムで2桁(10から99まで)の数字を生成するメソッド
     */
    public int ran(){
        Random rand = new Random();
        num = rand.nextInt(90) + 10;
        return num;
        //computerがランダムで生成した2桁の数字をprint
        //System.out.println(num);

    }

    /**
     * numのgetterメソッド
     * @return num ランダムで生成した数字
     */
    public int getNum() {
        return num;
    }

    /**
     * ランダムで生成した数字の10の位のみを返すメソッド
     * @return numの10の位
     */
    public int cpTens(){
        return num / 10;
    }

    /**
     * ランダムで生成した数字の1の位のみを返すメソッド
     * @return numの1の位
     */
    public int cpOnes() {
        return num % 10;
    }
     
}
