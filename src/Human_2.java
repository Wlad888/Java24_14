import java.util.Scanner;

public class Human_2 {

    public static void email(String email) {
        if(email.contains("yahoo") && email.contains(";")) {
            System.out.println("yahoo");
        } else if (email.contains("mail") && email.contains(";")){
            System.out.println("mail");
        } else if (email.contains("gmail") && email.contains(";")) {
            System.out.println("gmail");
        } else {
            System.out.println("Not a valid email");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Write the email");
        email(sc.nextLine());
    }


}
