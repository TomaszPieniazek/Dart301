package test;
import dart.Player;
import org.junit.Assert;
import org.junit.Test;

//0-20,21,22,24,25,26,27,28,30,32,33,34,36,38,39,40,42,45,48,50,51,54,57,60

public class PlayerTest {
    @org.junit.Test
    public void singleThrowGood(){
        Player p1 = new Player(1,"Tomasz");
        boolean expectedThrowResult=p1.singleThrow(10);
        int expectedPoints = 291;
        int expectedThrows = 1;
        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrows,p1.getCounterOfThrows());
        Assert.assertTrue(expectedThrowResult);
    }

    @Test
    public void singleThrowMiss(){
        Player p1 = new Player(1,"Tomasz");
        boolean expectedThrowResult=p1.singleThrow(23);
        int expectedPoints = 301;
        int expectedThrows = 1;
        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrows,p1.getCounterOfThrows());
        Assert.assertTrue(expectedThrowResult);
    }

    @Test
    public void singleThrowMinusPoints(){
        Player p1 = new Player(1,"Tomasz");
        p1.setPoints(10);
        boolean expectedThrowResult=p1.singleThrow(20);
        int expectedPoints = 10;
        int expectedThrows = 1;
        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrows,p1.getCounterOfThrows());
        Assert.assertFalse(expectedThrowResult);
    }

    @org.junit.Test
    public void threeThrows() throws Exception {
    }

    @org.junit.Test
    public void checkPointsGood(){
        Player p1 = new Player(1,"Tomasz");
        boolean expectedBoolean= p1.checkPoints(21);
        int expectedPoints = 280;
        int expectedThrows = 0;
        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrows,p1.getCounterOfThrows());
        Assert.assertTrue(expectedBoolean);
    }

    @org.junit.Test
    public void checkPointsBad(){
        Player p1 = new Player(1,"Tomasz");
        p1.setPoints(2);
        boolean expectedBoolean= p1.checkPoints(10);
        int expectedPoints = 2;
        int expectedThrows = 0;

        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrows,p1.getCounterOfThrows());
        Assert.assertFalse(expectedBoolean);
    }

    @Test
    public void onePlayerRoundGood(){
        Player p1 = new Player(1,"Tomasz");
        int[] throwss = {1,15,25};
        boolean didHeWin =p1.onePlayerRound(throwss);
        int expectedPoints = 260;
        int expectedThrowsCounter = 3;

        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrowsCounter,p1.getCounterOfThrows());
        Assert.assertFalse(didHeWin);
    }

    @Test
    public void onePlayerRoundMiss(){
        Player p1 = new Player(1,"Tomasz");
        int[] throwss ={1,23,25};
        boolean didHeWin =p1.onePlayerRound(throwss);
        int expectedPoints = 275;
        int expectedThrowsCounter = 3;

        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrowsCounter,p1.getCounterOfThrows());
        Assert.assertFalse(didHeWin);
    }

    @Test
    public void onePlayerRoundMinus(){
        Player p1 = new Player(1,"Tomasz");
        int[] throwss = {23,25,23};
        p1.setPoints(10);
        boolean didHeWin =p1.onePlayerRound(throwss);
        int expectedPoints = 10;
        int expectedThrowsCounter = 2;

        Assert.assertEquals(expectedPoints,p1.getPoints());
        Assert.assertEquals(expectedThrowsCounter,p1.getCounterOfThrows());
        Assert.assertFalse(didHeWin);
    }

}