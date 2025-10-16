import java.util.Scanner;

public class GradeCalculator {

    public void demanderScore(Scanner input){

        System.out.println("Entrez votre note (0 à 100 ) : ");
        int score = input.nextInt();

        if ( score >= 90 && score <= 100 ) {
            System.out.println("Mention : A");
        } else if ( score >= 80 && score <= 89) {
            System.out.println("Mention : B");
        } else if ( score >= 70 && score <= 79) {
            System.out.println("Mention : C");
        } else if ( score >=60 && score <= 69) {
            System.out.println("Mention : D");
        } else if ( score >= 0 && score <= 59) {
            System.out.println("Mention : F");
        } else {
            System.out.println("Score Invalid");
        }

        input.close();
    }

}


