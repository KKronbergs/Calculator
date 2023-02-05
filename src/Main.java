import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Ievadi skaitli x: ");
        int user_x = scan.nextInt();

        System.out.println("Ievadi skaitli y: ");
        int user_y = scan.nextInt();

        System.out.println("Ievadiet matemātisko darbību (+,-,/,*): ");
        String user_z = scan.next();

        if(user_z. equals("+")) {
            sum(user_x, user_y);
        } else if(user_z.equals("-")){
            sub(user_x, user_y);
        } else if (user_z. equals("*")){
            mul(user_x, user_y);
        } else if (user_z. equals("/")){
            div(user_x, user_y);
        } else {
            System.out.println("Nepareiza darbība");
        }

    }

    public static void sum(int x, int y) {
        System.out.println("Result: ");
        System.out.println(x + y);
    }
    public static void sub(int x, int y) {
        System.out.println("Result: ");
        System.out.println(x - y);
    }
    public static void mul(int x, int y) {
        System.out.println("Result: ");
        System.out.println(x * y);
    }
    public static void div(int x, int y) {
        System.out.println("Result: ");
        System.out.println(x / y);
    }


}