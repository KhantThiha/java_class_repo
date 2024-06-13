package day2_assignment.additionalLoops;

public class zeroOneTriangle {
    public static void main(String[] args) {
        boolean state=false;
        for(int i=0;i<=4;i++){      
            for(int j=1;j<=i;j++){
                if(state){
                    System.err.print("0 ");
                    state=false;
                }else{
                    System.err.print("1 ");
                    state=true;
                }
            }
            System.out.println();
        }
    }
}
