public class AgeClassifier {

    int age;

    public AgeClassifier(){

    }

    public void ageClassifier(int age){
        if (age < 13 && age > 0){
            System.out.println("Child");
        } else if (age >= 13 && age <= 19) {
            System.out.println("Teenager");
        } else if (age > 20){
            System.out.println("Adult");
        }
        else {
            System.out.println("Error");
        }

    }

}
