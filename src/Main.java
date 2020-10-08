import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x;
        float y;
        float z;
        float result;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter 2 Numbers to add!");
        try {
            x = sc.nextFloat();
            y = sc.nextFloat();
            z=sc.nextFloat();

            result = x + y+z;
            System.out.println("Result: " + result);
        }catch(Exception e) {
            System.out.println("An error got detected");
        }
    }
}
