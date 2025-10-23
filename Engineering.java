public class Engineering {
    public static void main(String[] args) {

        // logic: manually use for loops to print the exact ammount repetition of
        // characters in each of layers

        // layer 1
        for (int i = 1; i <= 34; i++)
            // print the spaces
            System.out.print(" ");
        for (int i = 1; i <= 30; i++)
            // print the top border
            System.out.print("_");

        System.out.println();

        // layer 2
        for (int i = 0; i <= 24; i++)
            // print the spaces
            System.out.print(" ");
        for (int i = 1; i <= 7; i++)
            // print the characters of the gear
            System.out.print("@");
        // print the spaces between letter E and gears
        System.out.print("  |");
        for (int i = 1; i <= 28; i++)
            // print the spaces to fill the letter E
            System.out.print(' ');

        // print the right border of the logo
        System.out.println("|");

        // layer 3,4
        for (int k = 1; k <= 2; k++) {
            for (int i = 1; i <= 26; i++)
                System.out.print(" ");
            for (int i = 1; i <= 6; i++)
                System.out.print("@");
            System.out.print("  |");
            for (int i = 1; i <= 28; i++)
                System.out.print(" ");

            System.out.println("|");
        }

        // layer 5
        for (int i = 1; i <= 18; i++)
            System.out.print(" ");
        for (int i = 1; i <= 14; i++)
            System.out.print("@");
        System.out.print("  |");
        for (int i = 1; i <= (11); i++)
            System.out.print(" ");
        for (int i = 1; i <= 17; i++)
            System.out.print("_");
        System.out.println("|");

        int letterBaseWidth = 10;

        // layer 6,7
        for (int repeat = 1; repeat <= 2; repeat++) {
            for (int i = 1; i <= 16; i++)
                System.out.print(" ");
            if (repeat == 2) {
                for (int i = 1; i <= 12; i++)
                    System.out.print("@");
                System.out.print("      |");
            } else {
                for (int i = 1; i <= 34 - 18; i++)
                    System.out.print("@");
                System.out.print("  |");
            }
            for (int i = 1; i <= letterBaseWidth; i++)
                System.out.print(" ");
            System.out.println("|");
        }

        // this is the length of line inside the letter E
        int middleLetterLength = 25;

        // layer 8
        for (int i = 1; i <= 19; i++)
            System.out.print(" ");
        for (int i = 1; i <= 8; i++)
            System.out.print("@");
        System.out.print("       |");
        for (int i = 1; i <= letterBaseWidth; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= middleLetterLength - letterBaseWidth; i++)
            System.out.print("_");
        System.out.println();

        // layer 9
        for (int i = 1; i <= 18; i++)
            System.out.print(" ");
        for (int i = 1; i <= 8; i++)
            System.out.print("@");
        System.out.print("        |");
        for (int i = 1; i <= middleLetterLength; i++)
            System.out.print(" ");
        System.out.println("|");

        // layer 10,11,12
        for (int repeat = 1; repeat <= 3; repeat++) {
            for (int i = 1; i <= 14; i++)
                System.out.print(" ");
            for (int i = 1; i <= 11; i++)
                System.out.print("@");
            for (int i = 1; i <= 9; i++)
                System.out.print(" ");
            System.out.print("|");
            if (repeat == 3) {
                for (int i = 1; i <= letterBaseWidth; i++)
                    System.out.print(" ");
                for (int i = 1; i <= middleLetterLength - letterBaseWidth; i++)
                    System.out.print("_");
            } else {
                for (int i = 1; i <= middleLetterLength; i++)
                    System.out.print(" ");
            }
            System.out.println("|");
        }

        // layer 13
        for (int i = 1; i <= 18; i++)
            System.out.print(" ");
        for (int i = 1; i <= 8; i++)
            System.out.print("@");
        for (int i = 1; i <= 8; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= letterBaseWidth; i++)
            System.out.print(" ");
        System.out.println("|");

        // layer 14
        for (int i = 1; i <= 18; i++)
            System.out.print(" ");
        for (int i = 1; i <= 9; i++)
            System.out.print("@");
        for (int i = 1; i <= 7; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= letterBaseWidth; i++)
            System.out.print(" ");
        System.out.println("|");

        int bottomLineLength = 65 - 36;

        // layer 15
        for (int i = 1; i <= 19; i++)
            System.out.print(" ");
        for (int i = 1; i <= 9; i++)
            System.out.print("@");
        for (int i = 1; i <= 6; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= letterBaseWidth; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= bottomLineLength - letterBaseWidth; i++)
            System.out.print("_");
        System.out.println();

        // layer 16
        for (int i = 1; i <= 17; i++)
            System.out.print(" ");
        for (int i = 1; i <= 15; i++)
            System.out.print("@");
        for (int i = 1; i <= 2; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= bottomLineLength; i++)
            System.out.print(" ");
        System.out.println("|");

        // layer 17,18
        for (int repeat = 1; repeat <= 2; repeat++) {
            for (int i = 1; i <= 18; i++)
                System.out.print(" ");
            for (int i = 1; i <= 14; i++)
                System.out.print("@");
            for (int i = 1; i <= 2; i++)
                System.out.print(" ");
            System.out.print("|");
            for (int i = 1; i <= bottomLineLength; i++)
                System.out.print(" ");
            System.out.println("|");
        }

        // layer 19
        for (int space = 1; space <= 22; space++)
            System.out.print(" ");
        for (int i = 1; i <= 10; i++)
            System.out.print("@");
        for (int i = 1; i <= 2; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= bottomLineLength; i++)
            System.out.print("_");
        System.out.println("|");
    }
}