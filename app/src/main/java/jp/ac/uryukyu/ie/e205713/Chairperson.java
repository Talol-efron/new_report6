package jp.ac.uryukyu.ie.e205713;

public class Chairperson {
    public void explain(){
        System.out.println("ようこそ！数字あてゲームへ");
        waitMoment(1000);
        System.out.println("今からこのゲームについて説明をします。");
        waitMoment(1000);
        System.out.println("このゲームは、コンピュータの2桁の数字を当てる単純なゲームです。");
        waitMoment(1000);
    }
    /*Scan User = new Scan();//ここでuserが入力した数字
    Computer Cp = new Computer();//はじめに生成したcomの数字
    
    
    private int userTens = User.getVal2() / 10;
    private int userOnes = User.getVal2() % 10;

    private int cpTens = Cp.getNum() / 10;
    private int cpOnes = Cp.getNum() % 10;*/

    //playerに数字を入力させるメソッド
    public void userPlay(){
        System.out.println("あなたのターン！");
        waitMoment(1000);
        System.out.println("あなたが考えるcomputerの数字を入力してください。");
        
        User.scan();
    }

    //playerが入力した数値とcomputerが生成した数値が一致しているか判定
    public void userJudg(){
        if(userTens == cpTens && userOnes == cpOnes){
            //ゲームクリア
            waitMoment(1000);
            System.out.println("君の勝利だ！！Congratulations!");
        }else if(userTens == cpTens || userOnes == cpOnes){
            waitMoment(1000);
            System.out.println("1つの数字と場所が一致している。リーチだ！");
        }else{
            if(/*場所は違うが、2つの数字が一致している場合*/ userTens == cpOnes && userOnes == cpTens){
                waitMoment(1000);
                System.out.println("場所は違うが、2つの数字が一致している。リーチだ！");
            }else if(/*１つの数字のみ一致している場合*/userTens == cpOnes || userOnes == cpTens){
                waitMoment(1000);
                System.out.println("１つの数字が一致している。手がかりが掴めてきた。");
            }else{
                waitMoment(1000);
                System.out.println("何も起きなかった。。。");
            }
        }
    }

    /**
     * @param time 　int型の時間を入力
     */
    public void waitMoment(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
