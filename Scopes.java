public class Scopes {
    public static void main(String[] args) {
        // the space between logo and left side of screen
        int marginLeft = 40;
        // length of the logo container
        int logoLength = 39;
        // the string that will be used as vertical border
        String verticalLine = "1";
        // string length/amount of char of verticalLine, useful for calculating inner
        // lengths
        int verticalLineStrLength = 1;
        int verticalLineHeight = 15; // height of the vertical line height
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
            // print the margin from left side of screen to left side of logo
            System.out.print(" ");
        for (int i = 1; i <= logoLength; i++)
            // print the top border as alternating 1s & 0s
            if (i % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");
        // break the line to start the next layer
        System.out.println();

        // ------------ blank layer -------------
        // this is the top blank part of the icon
        for (int repeat = 1; repeat <= 2; repeat++) {
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            // print the left border
            if (repeat % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            // fill and print empty spaces
            for (int i = 1; i <= logoLength - (verticalLineStrLength * 2); i++)
                System.out.print(" ");

            // print the remaining side of the logo
            if (repeat % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            System.out.println();
        }

        /*
         * This part of the code is where the circle of the icon is generated, the
         * measurements for margins, and positioning of cursor is based on the
         * general formula of the circle (derived from pythagorean thoerem)
         * (x - h)^2 + (y - k)^2 = r^2
         * which is also a function of x in terms of y
         * x = f(y) = sqrt( r^2 - [y - k]^2 ) + h
         */
        for (int y = verticalLineHeight; y >= 0; y--) {
            // 1. Print the necessary margin spaces from screen to logo
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            // 2. Print the border based on the y value
            // check weather the y-position is in odd or even to print alternating 1s & 0s
            if (y % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            // 3. calulate the x coordinate of circle based on the
            double radius = verticalLineHeight / 2;
            // h & k are the offset values in the x & y axis
            double h = radius - 2;
            double k = radius;

            // formula: (x-h)^2 = r^2 - (y-k)^2
            // store the (x - h)^2 in a variable
            double xMinusHSquared = (radius * radius) - ((y - k) * (y - k));
            // initial guesss (this could be any random number, but half is better guess)
            double xMinusH = xMinusHSquared / 2;
            // Precision threshold, since I cannot copmute the exact square root, this would
            // serve as my limitation for calculating square root
            double epsilon = 0.0001;

            // check if the y coordinate is a valid coordinate of the circle
            // since a negative y value would mean to a non-existent point on the circle
            if (xMinusHSquared >= 0) {
                // Iterate until the difference between guessed number & target number is as
                // small as the defined epsilon
                // this equation in a loop is known as manual square root approximation
                while ((xMinusH * xMinusH - xMinusHSquared) > epsilon
                        || (xMinusHSquared - xMinusH * xMinusH) > epsilon) {
                    // use the Newton's Method
                    xMinusH = (xMinusH + xMinusHSquared / xMinusH) / 2;
                }

                // extend x axis (because my font style is thin, my terminal screen is squished)
                xMinusH *= 1.8;
                // obtain the x coordinate from by adding h to the calculated value
                double x = xMinusH + h;

                // the gap between the vertical border and the circle's left edge
                // space = (IL / 2) - x + gap
                double spaceX = (innerLength / 2) - x + 2;
                double circleInternalSpace = (x * 2) - 9;

                // 4. print the left side of the arc
                for (int i = 1; i <= spaceX; i++)
                    // print the ammount of space between border and circle
                    System.out.print(" ");
                // print the characters as border of circle
                System.out.print("0@@0");

                // 5. print the internal spacing & icon inside the circle
                switch (y) {
                    // manually draw the mouse cursor inside the circle
                    case 10:
                        System.out.print("        *              ");
                        break;
                    case 9:
                        System.out.print("         =%*             ");
                        break;
                    case 8:
                        System.out.print("          #@@@=          ");
                        break;
                    case 7:
                        System.out.print("          +@@@@@          ");
                        break;
                    case 6:
                        System.out.print("          -%@@@@%*       ");
                        break;
                    case 5:
                        System.out.print("           #@%#@*        ");
                        break;
                    case 4:
                        System.out.print("          +=  *@*      ");
                        break;
                    case 3:
                        System.out.print("               *@*   ");
                        break;
                    default:
                        // use a calculation by default to print the empty spaces of internal part of
                        // circle
                        for (int i = 1; i <= circleInternalSpace; i++)
                            System.out.print(" ");
                }
                // print the right side of the arc
                System.out.print("0@@0");

                // print the amount of space needed to fill the right part of icon
                for (int i = 1; i <= (innerLength - circleInternalSpace - 8 - spaceX); i++)
                    System.out.print(" ");

                // since some parts have bad square root approximation, manually add some space
                // to some parts of icon on different heights
                int additionalSpace = 0;
                switch (y) {
                    case 14, 0:
                        additionalSpace = 0;
                        break;
                    case 12, 7, 2:
                        additionalSpace = 1;
                        break;
                    default:
                        additionalSpace = 2;
                }
                for (int i = 1; i <= additionalSpace; i++)
                    System.out.print(" ");
            } else {
                // if the y is not a part of the circle, then print the empty spaces based on
                // the length of the icon container
                for (int i = 1; i <= innerLength; i++)
                    System.out.print(" ");
            }
            // 6. print right side of the vertical border with alternating 1s & 0s
            if (y % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            System.out.println();
        }

        // 7. Print the lower part of the icon
        // the height of the lower diagonal part
        int slopeHeight = 7;
        String lowerChars = "0";
        for (int y = 1; y <= slopeHeight; y++) {
            // print the necesary spaces as margin
            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            // use the slope intercept formula to determine the x value in terms of y
            // y = mx + b
            // slope = m - slope of line, where dx = half of the logo's length, and dy is
            // the height of assigned height of the lower part (slopeHeight)
            // y = mx
            // x = y/m
            // m = y/x
            // m = slopeHeight / [innerLength / 2]
            // m = 2*slopeHeight / innerLength
            // slope = (slopeHeight * 2) / innerLength;
            int spaceX = y * innerLength / (slopeHeight * 2);
            for (int i = 1; i <= spaceX; i++)
                // print the amount of spaces based on the calculated x-coordinate from slope of
                // line
                System.out.print(" ");
            // assigned the border alternatively 10 & 01
            if (y % 2 == 0)
                lowerChars = "01";
            else
                lowerChars = "10";

            // print the left side based on assigned border
            System.out.print(lowerChars);

            // inner space will be the differce between the intenal length and total
            // external space
            double innerSpace = innerLength - (2 * spaceX);
            for (int i = 1; i <= innerSpace; i++)
                System.out.print(" ");
            System.out.println(lowerChars);
        }

        System.out.println("\n");

        // manually print the letters of "SCOPES"
        System.out.println(
                "                                 *@@@@%-  +%@@@@#   #@@@@%*   %@@@@@#- =%@@@@@% -#@@@@%:\n"
                        +
                        "                                =@%:     #@*      =@#    +@%  @@    @%: @#       @*\n"
                        +
                        "                                 =#@@%#  %@:      +@      @@  @@*++#@   @@%%%%    %@@%* \n"
                        +
                        "                                     +@#-#@#:     -%%    *@%  @@*      +@#       -   #@+\n"
                        +
                        "                                -#%@@%*-  =#@@@%*-  *%@@@#=   %%-      =%@@%@@#  #@@@%  \n");

    }
}
