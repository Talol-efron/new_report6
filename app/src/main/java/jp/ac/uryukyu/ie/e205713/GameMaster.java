package jp.ac.uryukyu.ie.e205713;

public class GameMaster {
    public GameMaster(){
        Chairperson teacher = new Chairperson();
        teacher.explain();

        System.out.println("あなたが思うcomputerの数字を入力してください。");
        Pleyar you = new Pleyar("you");
        you.scan();

        Computer talol = new Computer();
        talol.ran();
        System.out.println(talol.getNum());

        
    }
}
