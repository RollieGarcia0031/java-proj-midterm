import java.lang.invoke.CallSite;

public class Main {
    public static void main(String[] args) {
        engineer();
        System.out.print("\n\n\n\n");
        // logo2();

        // int number = 2;

        // double guess = number / 2; // Initial guess
        // double epsilon = 0.000001; // Precision threshold

        // // Iterate until the difference between guesses is small
        // while ((guess * guess - number) > epsilon || (number - guess * guess) >
        // epsilon) {
        // guess = (guess + number / guess) / 2;
        // }

        // System.out.println(guess);

    }

    /**
     * Prints SCOPES
     */
    public static void engineer() {
        // the space between logo and left side of screen
        int marginLeft = 40;
        // length of the logo container
        int logoLength = 80 - 41;
        // the string that will be used as vertical border
        String verticalLine = "I";
        int verticalLineStrLength = 1; // string length/amount of char of verticalLine
        int verticalLineHeight = 21 - 6; // height of the verticalLine height
        // the string that will be used as top border
        String topLine = "=";
        // margin between the vertical border and circle inside logo
        int innerMarginX = 3;
        // the radius of the main circle in logo
        int iconRadius = 6;
        // internal length of the icon container
        int innerLength = logoLength - (verticalLineStrLength * 2);

        // top border
        for (int i = 1; i <= marginLeft; i++)
            System.out.print(" ");
        for (int i = 1; i <= logoLength; i++)
            System.out.print(topLine);
        System.out.println();

        // blank layer
        for (int repeat = 1; repeat <= 2; repeat++) {
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");
            System.out.print(verticalLine);
            for (int i = 1; i <= logoLength - (verticalLineStrLength * 2); i++)
                System.out.print(" ");
            System.out.print(verticalLine);
            System.out.println();
        }

        for (int y = 1; y <= verticalLineHeight; y++) {
            // print the margins between the screen and logo
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            // print the vertical border
            System.out.print(verticalLine);

            // print the margin between the logo and the verical border
            for (int i = 1; i <= innerMarginX; i++)
                System.out.print(" ");

            /*
             * this part calculates the square root
             */
            // the x^2 coordinate
            double squishY = y * 1;
            double xSqaured = (iconRadius * iconRadius) - ((squishY - 8) * (squishY - 8));
            /** initial guess */
            double spaceX = xSqaured / 2;
            double epsilon = 0.001; // Precision threshold

            if (xSqaured >= 0) {
                // Iterate until the difference between guesses is small
                while ((spaceX * spaceX - xSqaured) > epsilon || (xSqaured - spaceX * spaceX) > epsilon) {
                    spaceX = (spaceX + xSqaured / spaceX) / 2;
                }
            }
            spaceX -= 7;
            spaceX = -spaceX;
            // END OF SQUARE ROOT

            // the ammount of horizontal space between edges of circle (dx)

            double innerSpace = innerLength - (spaceX * 2) - 9;

            for (double i = 0; i < spaceX; i++)
                System.out.print(" ");

            // print the border of left side of the circle
            System.out.print("@@");

            // this prints the necessarry spaces to fill the circle, before typing the
            // border
            switch (y) {
                case 5:
                    System.out.print("       =%*              @@");
                    break;
                case 6:
                    System.out.print("       #@@@=*            @@");
                    break;
                case 7:
                    System.out.print("       +@@@@@%           @@");
                    break;
                case 8:
                    System.out.print("        -@@@@@%*           @@");
                    break;
                case 9:
                    System.out.print("        #@%#@*           @@");
                    break;
                case 10:
                    System.out.print("        +=..*@*          @@");
                    break;
                case 11:
                    System.out.print("            .*@*        @@");
                    break;
                default:
                    for (int i = 1; i <= innerSpace; i++)
                        System.out.print(" ");

                    System.out.print("@@");
            }

            int rightSpace = 0;
            switch (y) {
                case 1:
                    rightSpace = 15;
                    break;
                case 2:
                    rightSpace = 9;
                    break;
                case 3:
                    rightSpace = 6;
                    break;
                case 4:
                    rightSpace = 5;
                    break;
                case 5:
                    rightSpace = 4;
                    break;
                case 6:
                    rightSpace = 3;
                    break;
                case 7:
                    rightSpace = 3;
                    break;
                case 8:
                    rightSpace = 2;
                    break;
                case 9:
                    rightSpace = 3;
                    break;
                case 10:
                    rightSpace = 3;
                    break;
                case 11:
                    rightSpace = 4;
                    break;
                case 12:
                    rightSpace = 5;
                    break;
                case 13:
                    rightSpace = 6;
                    break;
                case 14:
                    rightSpace = 9;
                    break;
                case 15:
                    rightSpace = 15;
                    break;
            }

            for (int i = 1; i <= rightSpace; i++)
                System.out.print(" ");

            System.out.println(verticalLine);
        }

        int slopeHeight = 8;
        String lowerChars = "@";
        for (int y = 1; y <= slopeHeight; y++) {
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            // slope = (slopeHeight * 2) / innerLength;

            int spaceX = y * innerLength / (slopeHeight * 2);
            for (int i = 1; i <= spaceX; i++)
                System.out.print(" ");
            System.out.print(lowerChars);

            double innerSpace = innerLength - (2 * spaceX);
            for (int i = 1; i <= innerSpace; i++)
                System.out.print(" ");
            System.out.println(lowerChars);
        }
        System.out.print("done");

    }

    public static void logo2() {

        // layer 1
        for (int i = 1; i <= 34; i++)
            System.out.print(" ");
        for (int i = 1; i <= 30; i++)
            System.out.print("_");

        System.out.println();

        // layer 2
        for (int i = 0; i <= 24; i++)
            System.out.print(" ");
        for (int i = 1; i <= 7; i++)
            System.out.print("@");
        System.out.print("  |");
        for (int i = 1; i <= 28; i++)
            System.out.print(' ');

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

        int middleLetterLength = 61 - 36;

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
        for (int i = 1; i <= 13; i++)
            System.out.print("@");
        for (int i = 1; i <= 4; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= bottomLineLength; i++)
            System.out.print(" ");
        System.out.println("|");

        // layer 17
        for (int i = 1; i <= 22; i++)
            System.out.print(" ");
        for (int i = 1; i <= 9; i++)
            System.out.print("@");
        for (int i = 1; i <= 3; i++)
            System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= bottomLineLength; i++)
            System.out.print(" ");
        System.out.println("|");
    }
}

// ....... ...... ........ ....................................................
// . ... . ..
// ............................:.. ............................... ... .
// ......... .
// . .... ................#@@@@@*..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@: . ... . ...
// ..
// ..... ................ *@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@= ... ....
// ................... ..*@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@%. .......... .
// ..... .........:@@@@+@@@@@@@@@-.@@@@@@@@@@******************. ... ........ ..
// .
// .. ............@@@@@@@@@@@@@@@-.@@@@@@@@@# . . .. .............. .
// . ............-@@@@@@@@@@@@-....@@@@@@@@@# ............. .. .
// . ....... ......*@@@@@@@@-... ..@@@@@@@@@# ............ . ..
// . .......... .@@@@@@@@.. .....@@@@@@@@@@###%%%%%%%%%%%%.. ............. .. .
// .. .......+@@@@@@@@@@@: .....@@@@@@@@@@@@@@@@@@@@@@@@@:. ..................
// ..
// . ........ +@@@@@@@@@@@. ....@@@@@@@@@@@@@@@@@@@@@@@@@: . ..................
// . .
// ...........*@@@@@@@@@@@: ...@@@@@@@@@@@@@@@@@@@@@@@@@: .................. . .
// ....... .......=@@@@@@@@. .. . .@@@@@@@@@# ............... ..................
// .. .
// ..... ..........@@@@@@@@%. @@@@@@@@@#. ...... .................. .
// . ..... .-@@@@@@@@@@*. @@@@@@@@@# ... . .......... . .
// .............:@@@@@@@@@@@@@@@*. @@@@@@@@@# .. ........... .
// ..... . ......*@@@@@@@@@@@@@@-.@@@@@@@@@@%@@@@@%%@@%%%%@@@@@@= .......... .
// ..... . ........:=....*@@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@. ....... ..
// ....... .........=@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=. ......... .
// ... . . ... .@@@@@@@..%@@@@@@@@@@@@@@@@@@@@@@@@@@@@. . . ....... .
// ......... .....-@%.................................. . ........ .. .
// .............. . . ...................................... ....... ....... .
// ..
