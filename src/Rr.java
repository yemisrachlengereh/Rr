import java.util.Scanner;
public class Rr {


    public static
    void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How fast was the wind blowing?" );
        int WindSpeed = scan.nextInt();

        // An if statement with only one line of code to run
        // does not require braces
        if (WindSpeed >=74 && WindSpeed <= 95)
            System.out.println("Get over it. That was not a hurricane");
        else if (WindSpeed >=  96 && WindSpeed <= 110 )
            System.out.println("It was a class 1 hurricane");
        else if (WindSpeed >= 111 && WindSpeed <= 130)
            System.out.println("It was a class 2 hurricane");
        else if (WindSpeed >= 131 && WindSpeed <=155)
            System.out.println("It was a class 3 hurricane");
        else if  (WindSpeed > 155 )
            System.out.println("It was a class 4 hurricane");
        else {
            // since the else has multiple lines of code to run
            // we use  braces {} to wrap them in a code block
            System.out.println("It was a class 5 hurricane");
            System.out.println("Class 5 is the most severe hurricane");
            System.out.println("Hurricane Katrina was class 5");
        }
    }
}