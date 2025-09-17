import java.util.Scanner;

class Input {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int a = sc.nextInt();
        System.out.print("Enter a float: ");
        float b = sc.nextFloat();
        System.out.print("Enter a character: ");
        char c = sc.next().charAt(0);
        System.out.println("You entered integer: " + a);
        System.out.println("You entered float: " + b);
        System.out.println("You entered character: " + c);
    }
}