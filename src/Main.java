import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x;
        float y;
        float result;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter 2 Numbers to add!");
        x=sc.nextFloat();
        y=sc.nextFloat();

        result=x+y;
        System.out.println("Result: " + result);
    }
}
