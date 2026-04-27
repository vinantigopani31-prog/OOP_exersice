class Division {
    public static void main(String args[]) {
        try {
            int numerator = Integer.parseInt(args[0]);
            int denominator = Integer.parseInt(args[1]);

            int result = numerator / denominator;

            System.out.println("Numerator = " + numerator);
            System.out.println("Denominator = " + denominator);
            System.out.println("Result = " + result);
        }

        catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero");
        }

        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Please enter two values");
        }

        catch (NumberFormatException e) {
            System.out.println("Error: Enter only integer values");
        }

        catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
}

/*output :
java Division 20 5

Numerator = 20
Denominator = 5
Result = 4 */