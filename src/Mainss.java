import dart.Game;
import dart.Player;

public class Mainss {
    public static void main(String[] args){
        Game g= new Game();
        Player p1 = new Player(1,"Tomasz");
        Player p2 = new Player(2,"Tegoniemasz");

        g.addPlayer(p1);
        g.addPlayer(p2);

        g.playGame();

//p1.singleThrow(33);
//System.out.print(p1.toString());
        //0-20,21,22,24,25,26,27,28,30,32,33,34,36,38,39,40,42,45,48,50,51,54,57,60

    }

}
