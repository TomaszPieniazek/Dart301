package dart;

import java.util.Random;

public class Player {
    private int number;
    private String name;
    private int points=301;
    private int counterOfThrows=0;
    private DartboardPoints dartboard = DartboardPoints.getInstance();
    public Player(int number, String name) {
        this.number = number;
        this.name = name;

    }

    public boolean singleThrow(int points){
        boolean result = true;
        this.counterOfThrows++;
        if(dartboard.points.get(points)!=null ){
            System.out.print("\n"+this.name+" throw number ["+this.counterOfThrows+"] for: "+(points));
            result= checkPoints(points);
        }else {
            System.out.print("\n" + this.name + " throw number [" + this.counterOfThrows + "] for: Ahh you missed!"+points);
        }
        return  result;
    }

    public boolean threeThrows(){
        boolean won=false;
        Random r = new Random();
        int counter = 0;
        while(this.singleThrow(r.nextInt(60) + 1) && counter<2 && this.points>0){
            counter++;
        }
        if(this.points==0){
            won=true;
        }
        return won;
    }

    public boolean onePlayerRound(int[] a){
        boolean won=false;
        Random r = new Random();
        int counter = 0;
        while(this.singleThrow(a[counter]) && counter<2 && this.points>0){
            counter++;
        }
        if(this.points==0){
            won=true;
        }
        return won;
    }

    public boolean checkPoints(int throwPoints){
        boolean result = false;
        if(this.points>=throwPoints){
            this.points-=throwPoints;
            result= true;
        }else{
            System.out.print("\tYou scored more than you need to win!");
        }
        return result;
    }

    @Override
    public String toString() {
        return "dart.Player{" +
                "number=" + number +
                ", name='" + name + '\'' +
                ", points=" + points +
                '}';
    }

    public void setPoints(int points) {
        this.points = points;
    }

    public void setCounterOfThrows(int counterOfThrows) {
        this.counterOfThrows = counterOfThrows;
    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public int getPoints() {
        return points;
    }

    public int getCounterOfThrows() {
        return counterOfThrows;
    }
}
