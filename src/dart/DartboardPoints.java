package dart;

import java.util.HashMap;

public class DartboardPoints {
    private static DartboardPoints instance;
    public HashMap<Integer, Integer> points;
    private DartboardPoints() {
        this.points = new HashMap<>();
        for(int i=1;i<=20;i++){
            this.points.put(i,i);
        }
        for(int i=1;i<=20;i++){
            this.points.put(i*2,i*2);
        }
        for(int i=1;i<=20;i++){
            this.points.put(i*3,i*3);
        }
        this.points.put(25,25);
        this.points.put(50,50);
    }
    public static DartboardPoints getInstance(){
        if(instance==null){
            instance = new DartboardPoints();
        }
        return instance;
    }
}
