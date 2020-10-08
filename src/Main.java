import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x;
        float y;
        float z;
        float result=-1;
        float mult;
        String s;
        Scanner sc=new Scanner(System.in);

        System.out.println("Please enter 3 Numbers to add!");
        try {
            x = sc.nextFloat();
            y = sc.nextFloat();
            z=sc.nextFloat();

            result = x + y+z;
            System.out.println("Result: " + result);
        }catch(Exception e) {
            System.out.println("An error got detected");
        }

        System.out.println("Do you want to multiply it by anything? (y/n):");
        s=sc.next();

        switch (s){
            case "y":
                System.out.println("PLease type in the number you want " + result + " to be multiplied with:");
                mult=sc.nextFloat();
                result*=mult;
                break;
            case "n":
                break;
                default:
                    System.out.println("Cancelled...");
        }
        System.out.println("final result: " + result);
    }
}
