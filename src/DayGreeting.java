import java.util.Scanner;

public class DayGreeting {

    public void DemanderHeure(Scanner input){
        System.out.println("Entrer current hour :");
        int heure = input.nextInt();

        if ( heure >= 5 && heure <= 11 ){
            System.out.println("Good Morning");
        } else if ( heure >= 12 && heure <= 17 ) {
            System.out.println("Good afternoon");
        } else if ( heure >= 18 && heure <= 23){
            System.out.println("Good evening");
        } else {
            System.out.println("Good night");
        }
    }
}
