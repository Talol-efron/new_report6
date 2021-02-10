package jp.ac.uryukyu.ie.e205713;

public class GameMaster {
    public GameMaster(){
        Chairperson teacher = new Chairperson();
        teacher.explain();

        Computer talol = new Computer();
        talol.ran();

        //computerがランダムに選んだ数字をprint
        //System.out.println(talol.getNum());
        
        //Player you = new Player("you");
        //teacher.start();

        teacher.userPlay();
        teacher.userJudg();
        //teacher.cpPlay();
        //teacher.cpJudg();
    }
}
