public class Scopes {
    public static void main(String[] args) {
        // the space between logo and left side of screen
        int marginLeft = 40;
        // length of the logo container
        int logoLength = 80 - 41;
        // the string that will be used as vertical border
        String verticalLine = "1";
        // string length/amount of char of verticalLine, useful for calculating inner
        // lengths
        int verticalLineStrLength = 1;
        int verticalLineHeight = 21 - 6; // height of the vertical line height
        // the string that will be used as top border
        String topLine = "10";
        // margin between the vertical border and circle inside logo
        int innerMarginX = 3;
        // the radius of the main circle in logo
        int iconRadius = 6;
        // internal length of the icon container
        int innerLength = logoLength - (verticalLineStrLength * 2);

        // top border
        for (int i = 1; i <= marginLeft; i++)
            System.out.print(" ");
        for (int i = 1; i <= logoLength / 2; i++)
            System.out.print(topLine);
        System.out.println();

        // blank layer
        // this is the blank part of the icon
        for (int repeat = 1; repeat <= 2; repeat++) {
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");
            System.out.print(verticalLine);
            for (int i = 1; i <= logoLength - (verticalLineStrLength * 2); i++)
                System.out.print(" ");
            System.out.print(verticalLine);
            System.out.println();
        }

        // This part of the code is where the circle of the icon is generated the
        // measurements for margins, and positioning of cursor will be based on the
        // general formula of the circle (derived from pythagorean thoerem)
        // which is also a function of x in terms of y
        for (int y = 1; y <= verticalLineHeight; y++) {
            // print the margins between the screen and logo
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            // print the vertical border
            // this prints the border by alternating 1s & 0s by relying in the y-coordinate
            if (y % 2 == 0)
                System.out.print(1);
            else
                System.out.print(0);

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

            if (y % 2 == 0)
                System.out.println(0);
            else
                System.out.println(1);

        }

        int slopeHeight = 8;
        String lowerChars = "0";
        for (int y = 1; y <= slopeHeight; y++) {
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            // slope = (slopeHeight * 2) / innerLength;

            int spaceX = y * innerLength / (slopeHeight * 2);
            for (int i = 1; i <= spaceX; i++)
                System.out.print(" ");
            if (y % 2 == 0)
                lowerChars = "01";
            else
                lowerChars = "10";
            System.out.print(lowerChars);

            double innerSpace = innerLength - (2 * spaceX);
            for (int i = 1; i <= innerSpace; i++)
                System.out.print(" ");
            System.out.println(lowerChars);
        }
        System.out.println(
                "                                 *@@@@%-..+%@@@@#=.-#@@@@%*...%@@@@@#-.=%@@@@@%.-#@@@@%:\n"
                        +
                        "                                =@%:.....#@*:..:-.=@#-...+@%..@@=..=@%:+@#.....:*@*\n"
                        +
                        "                                 =#@@%#--%@:......+@+.....@@-.@@*++#@*:+@@%%%%-.:+%@@%*:\n"
                        +
                        "                                     +@#-#@#:..-=:-%%=..:*@%..@@*++=-..+@#......:-..:#@+\n"
                        +
                        "                                -#%@@%*-..=#@@@%*-.:*%@@@#=...%%-......=%@@%@@#-=#@@@%*:\n");

    }
}
