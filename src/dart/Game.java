package dart;

import java.util.ArrayList;

public class Game {
     private ArrayList<Player> players;
     private int rounds;
     private Player winner;
    public Game() {
        this.players = new ArrayList<>();
        this.rounds =0;
        this.winner=null;

    }

    public void addPlayer(Player p){
        this.players.add(p);
    }


    private void playRound(){
        boolean isThereWinner= false;
        this.rounds++;
        int playerID=0;
        System.out.print("ROUND "+this.rounds+"\n");
        while(playerID< this.players.size() && !isThereWinner){
            isThereWinner=this.players.get(playerID).threeThrows();
            playerID++;
        }
        if(isThereWinner){
            this.winner=this.players.get(playerID-1);
        }
        System.out.print(this.toString()+"\n");
    }

    public void playGame(){
        while(this.winner==null && this.players.size()>=2){
            this.playRound();
        }
        System.out.print("\nAND THE WINNER IS...\n"+this.winner.toString());
    }

    @Override
    public String toString() {
        return "\ndart.Game{" +
                "players=" + players +
                '}';
    }
}
