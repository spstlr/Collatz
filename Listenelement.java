public class Listenelement {
    
    private int inhalt;
    private Listenelement next;

    public Listenelement(int inhalt){
        this.inhalt=inhalt;
    }

    public void add(Listenelement neu){
        if(next==null){
        next=neu;
        }else{
        next.add(neu);
        }
    }

    public void get(){
        if(next != null){
            next.get();
        }
        System.out.println(inhalt); 
    }
}