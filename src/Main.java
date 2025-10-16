import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        DayGreeting dg = new DayGreeting();
        dg.DemanderHeure(input);

        System.out.println("Challenge 1");
        challenge3 da = new challenge3();
        da.demanderAge(input);

        System.out.println("Challenge 1 without scanner");
        // Challenge 1 : AgeClassifier
        AgeClassifier ac=new AgeClassifier();
        ac.ageClassifier(25);

        System.out.println("Challenge 2");

        GradeCalculator calculator = new GradeCalculator();
        calculator.demanderScore(input);

        input.close();
        }
    }
