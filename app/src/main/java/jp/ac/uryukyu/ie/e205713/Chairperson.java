package jp.ac.uryukyu.ie.e205713;

public class Chairperson {
    /**
     * 一番初めにゲームの説明を行うメソッド
     */
    public void explain(){
        System.out.println("ようこそ！数字あてゲームへ");
        waitMoment(1000);
        System.out.println("今からこのゲームについて説明をします。");
        waitMoment(1000);
        System.out.println("このゲームは、コンピュータの2桁の数字を当てる単純なゲームです。");
        waitMoment(1000);
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
