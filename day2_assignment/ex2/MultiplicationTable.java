package day2_assignment.ex2;

public class MultiplicationTable {
    public static void printMultiplicationTable(int n) {
        System.out.println("Multiplication Table:");
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                System.out.print(i+"x"+j+"="+(i*j)+" ");
            }
            System.out.println();
        }
    }
}
