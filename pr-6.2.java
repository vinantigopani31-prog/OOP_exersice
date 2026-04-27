import java.util.Scanner;

class VotingApp {

    public void checkEligibility(int age) {

        if (age < 18) {
            throw new IllegalArgumentException("Age must be 18 or above to vote");
        } else {
            System.out.println("You are eligible to vote.");
        }
    }
}

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        VotingApp app = new VotingApp();

        try {
            System.out.print("Enter your age: ");
            int age = sc.nextInt();

            app.checkEligibility(age);

        } 
        catch (IllegalArgumentException e) {
            System.out.println("Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Unexpected Error: " + e.getMessage());
        } 
        finally {
            System.out.println("Validation process completed");
            sc.close();
        }
    }
}
/*output:
Enter your age: 21
You are eligible to vote.
Validation process completed
  
Enter your age: 15
Exception: Age must be 18 or above to vote
Validation process completed*/