public class List {
    private Listenelement Kopf;

    public List(int inhalt){
        Kopf=new Listenelement(inhalt);
    }

    public void add(int inhalt){
        Kopf.add(new Listenelement(inhalt));
    }

    public void get(){
        Kopf.get();
    }

    public static void main(String[]args){
        List L1=new List(0);
        L1.add(1);
        L1.add(2);
        L1.add(3);
        L1.add(4);
        L1.get();
    }
}