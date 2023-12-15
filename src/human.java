import java.util.Scanner;

public class human {

    String email;
    String name;
    String surName;
    int age;



    human(String email, String name, String surName, int age) {
        this.email = email;
        this.name = name;
        this.surName = surName;
        this.age = age;
        System.out.println("We've created a new human");
    }

     public static void email_1(human man) {

        if(man.email.contains("yahoo") && man.email.contains(";")) {
            System.out.println("yahoo");
        } else if (man.email.contains("mail") && man.email.contains(";")){
            System.out.println("mail");
        } else if (man.email.contains("gmail") && man.email.contains(";")) {
            System.out.println("gmail");
        } else {
            System.out.println("Not a valid email");
        }

    }

}

class creationOfMan{


    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Lets create a human");
        human man1 = new human(sc.nextLine(), sc.nextLine(),sc.nextLine(), sc.nextInt());

        human.email_1(man1);














    }

}
