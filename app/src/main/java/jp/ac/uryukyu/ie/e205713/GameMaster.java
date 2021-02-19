package jp.ac.uryukyu.ie.e205713;

public class GameMaster {
    
    public GameMaster(){
        Chairperson teacher = new Chairperson();
        teacher.explain();

        System.out.println("あなたが思うcomputerの数字を入力してください。");

        Player you = new Player("you");
        Computer talol = new Computer();

        boolean kusa = false;
        
        you.scan();    
        talol.ran();
 
        while(kusa == false){
            if (you.playerTens() == talol.cpTens() && you.playerOnes() == talol.cpOnes()) {
                // ゲームクリア
                waitMoment(1000);
                System.out.println("computerがランダムで生成した数字と一致した！！\n");
                waitMoment(1000);
                System.out.println("君の勝利だ！！Congratulations!\n");
                kusa = true;
            } else if (you.playerTens() == talol.cpTens() || you.playerOnes() == talol.cpOnes()) {
                waitMoment(1000);
                System.out.println("1つの数字と場所が一致している。\n");
                you.val = talol.getNum();
                System.out.println("が、しかしあなたが入力した数字は" + you.val + "です!");
            } else {
                if (/* 場所は違うが、2つの数字が一致している場合 */ you.playerTens() == talol.cpOnes()&& you.playerOnes() == talol.cpTens()) {
                    waitMoment(1000);
                    System.out.println("場所は違うが、2つの数字が一致している。\n");
                    you.val = talol.getNum();
                    System.out.println("が、しかしあなたが入力した数字は" + you.val + "です!");
                } else if (/* １つの数字のみ一致している場合 */you.playerTens() == talol.cpOnes()|| you.playerOnes() == talol.cpTens()) {
                    waitMoment(1000);
                    System.out.println("１つの数字が一致している。\n");
                    you.val = talol.getNum();
                    System.out.println("が、しかしあなたが入力した数字は" + you.val + "です!");
                } else {
                    waitMoment(1000);
                    System.out.println("全く数字があっていない。。。\n");
                    you.val = talol.getNum();
                    System.out.println("が、しかしあなたが入力した数字は" + you.val + "です!");

                }
            }
        }
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
