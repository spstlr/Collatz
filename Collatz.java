public class Collatz {


        public static void main(String[] args){
        
            int temp;
           
            boolean theend = false;
        
            for(int i=1000000;i>1;i--){
                temp=i;
                theend=false;
                int final0=0;
                int final1=0;
                int final2=0;
                System.out.println();
                System.out.println(temp+": ");
                while(theend==false){
                
                if(temp%2==0){
                    temp=temp/2;
                }
                else{temp=3*temp+1;}

                System.out.print(temp+" ");
                
                if(temp==4){
                    final0=temp;
                }
                if(temp==2){
                    final1=temp;
                }
                if(temp==1){
                    final2=temp;
                }
                if (final0==4 && final1==2 && final2 == 1||temp<0){
                    theend=true;
                }
            }    
        }
    }
}
