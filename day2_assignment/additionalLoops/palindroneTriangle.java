package day2_assignment.additionalLoops;

public class palindroneTriangle {
    public static void main(String[] args) {
        for(int i=1;i<=5;i++){
            int dec=i+1;
            int inc=1;
            for(int k=5;k>=i;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){   
                while(dec>1){
                    System.out.print(dec-1);
                    dec--;
                }
                while(inc<i){
                    System.out.print(inc+1);
                    inc++;
                }
            }
            System.out.println();
        }
    }
}
