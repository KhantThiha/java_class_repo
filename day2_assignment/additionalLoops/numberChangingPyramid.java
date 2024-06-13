package day2_assignment.additionalLoops;

public class numberChangingPyramid {
    public static void main(String[] args) {
        int val=1;
        for(int i=0;i<=4;i++){      
            for(int j=1;j<=i;j++){
                System.out.print(val+" ");
                val++;
            }
            System.out.println();

        }
    }
}
