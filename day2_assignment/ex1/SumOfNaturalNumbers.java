package day2_assignment.ex1;

public class SumOfNaturalNumbers {
    public static int sumUsingForLoop(int n) {
        int sum=0;
        for(int i=1;i<=n;i++){
            sum+=i;
        }
        return sum;
    }
    public static int sumUsingWhileLoop(int n){
        int sum=0;
        int i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        return sum;
    }
}
