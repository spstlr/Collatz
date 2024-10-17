import java.util.Random;

public class Rennschnecke{

    private String name;
    private double vMax;
    private double strecke;

    public Rennschnecke(String name,double vMax){
        this.name=name;
        this.vMax=vMax;
    }

    public void krieche(){
        Random random= new Random();
        this.strecke+=vMax*(random.nextInt(100)+1)/100;
    }

    public double getvMax(){
        return vMax;
    }

    public double setvMax(double vMax){
       return this.vMax=vMax;
    }
    
    public String toString(){
        return "Name:"+name+" vMax:"+vMax+" Strecke:"+strecke;
    }

    public static void main(String[]args){
        Rennschnecke s1=new Rennschnecke("s1", 14);
        SlomoSchnecke t1=new SlomoSchnecke("t1", 42);
        for(int i=0;i<10;i++){
        s1.krieche();
        t1.krieche(10);
        System.out.println(s1.toString());
        System.out.println(t1.toString());
        }
    }
}