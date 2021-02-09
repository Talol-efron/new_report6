package jp.ac.uryukyu.ie.e205713;

public class Chairperson {
    public void explain(){
        System.out.println("ようこそ！数字あてゲームへ");
        waitMoment(1000);
        System.out.println("今からこのゲームについて説明をします。");
        waitMoment(1000);
        System.out.println("このゲームは、コンピュータと3桁の数字を当て合う単純なゲームです。");
    }

    public void waitMoment(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
