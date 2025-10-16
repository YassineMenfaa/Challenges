import java.util.Scanner;

public class challenge3 {

    public void demanderAge(Scanner input){

        System.out.println("Entrer votre age :");
        int age = input.nextInt();

        if ( age > 0 && age < 13 ){
            System.out.println("Child");
        } else if ( age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if ( age >= 20 ) {
            System.out.println("Adult");
        } else {
            System.out.println("Invalid input");
        }
    }
}

//structurs de control
