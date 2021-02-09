package jp.ac.uryukyu.ie.e205713;

public class GameMaster {
    public GameMaster(){
        Chairperson teacher = new Chairperson();
        teacher.explain();

        Computer talol = new Computer();
        talol.ran();
        
        Player you = new Player("you");
        you.start();
    }
}
