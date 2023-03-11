package Generics.Enum;

public class Enum {

    // enum allows you to define a fixed set of constants.
    enum Numbers {
        ONE,
        TWO,
        THREE,
        FOUR,
        FIVE,
        SIX,
        SEVEN
    }

    public static void main(String[] args) {

        // Declaring and assigning an Enum variable
        Numbers num = Numbers.THREE;
        // use switch to access
        switch (num) {
            case ONE:
                System.out.println("1");
                break;
            case TWO:
                System.out.println("2");
                break;
            case THREE:
                System.out.println("3");
                break;
            case FOUR:
                System.out.println("4");
                break;
            case FIVE:
                System.out.println("5");
                break;
            case SIX:
                System.out.println("6");
                break;
            case SEVEN:
                System.out.println("7");
                break;
            // print invalid if the inputted number is not applicable
            default:
                System.out.println("Invalid");
                break;
        }

    }
}
