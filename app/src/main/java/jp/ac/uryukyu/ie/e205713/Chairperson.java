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
    //Scan defultUser = new Scan();//はじめにuserが入力した数字
    Scan searchUser = new Scan();//ここでuserが入力した数字
    Computer defultCp = new Computer();//はじめに生成したcomの数字
    //Computer searchCp = new Computer();//ここでcomが生成した数字

    private int userTens = searchUser.getVal2() / 10;
    private int userOnes = searchUser.getVal2() % 10;

    private int cpTens = defultCp.getNum() / 10;
    private int cpOnes = defultCp.getNum() % 10;

    //private int DuserTens = defultUser.getVal() / 10;
    //private int DuserOnes = defultUser.getVal() % 10;

    //private int ScpTens = searchCp.getNum2() / 10;
    //private int ScpOnes = searchCp.getNum2() % 10;

    /*public void start() {
        System.out.println("2桁の数値を入力して下さい。");
        defultUser.scan();

    }*/

    //playerに数字を入力させるメソッド
    public void userPlay(){
        System.out.println("あなたのターン！");
        waitMoment(1000);
        System.out.println("あなたが考えるcomputerの数字を入力してください。");
        
        searchUser.scan2();
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

    /*public void cpPlay(){
        System.out.println("computerのターン!");
        waitMoment(500);
        System.out.println("computerが考えるあなたの数字");
        waitMoment(500);
        System.out.println("入力中");

        for(int i=0;i < 3;i++){
            waitMoment(500);
            System.out.println("。");
        }

        searchCp.printRan();
    }*/

    /*public void cpJudg(){
        if (DuserTens == ScpTens && DuserOnes == ScpOnes) {
            // ゲームクリア
            waitMoment(1000);
            System.out.println("computerの勝利だ..you lose..");
        } else if (DuserTens == ScpTens || DuserOnes == ScpOnes) {
            waitMoment(1000);
            //System.out.println("1つの数字と場所が一致している。リーチだ！");
        } else {
            if (DuserTens == ScpOnes && DuserOnes == ScpTens) {
                waitMoment(1000);
                //System.out.println("場所は違うが、2つの数字が一致している。リーチだ！");
            } else if (DuserTens == ScpOnes || DuserOnes == ScpTens) {
                waitMoment(1000);
                //System.out.println("１つの数字が一致している。手がかりが掴めてきた。");
            } else {
                waitMoment(1000);
                //System.out.println("何も起きなかった。。。");
            }
        }
    }*/


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
