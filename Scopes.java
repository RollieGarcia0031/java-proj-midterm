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

            if (repeat % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            for (int i = 1; i <= logoLength - (verticalLineStrLength * 2); i++)
                System.out.print(" ");

            if (repeat % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            System.out.println();
        }

        // This part of the code is where the circle of the icon is generated the
        // measurements for margins, and positioning of cursor will be based on the
        // general formula of the circle (derived from pythagorean thoerem)
        // which is also a function of x in terms of y
        for (int y = verticalLineHeight; y >= 0; y--) {

            for (int i = 1; i <= marginLeft; i++)
                System.out.print(" ");

            if (y % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            // calulates the x coordinate of circle
            double radius = (verticalLineHeight / 2);
            double h = radius - 2;
            double k = radius;

            // formula: (x-h)^2 = r^2 - (y-k)^2
            double xMinusHSquared = (radius * radius) - ((y - k) * (y - k));
            double xMinusH = xMinusHSquared / 2; // initial guess
            double epsilon = 0.0001; // Precision threshold

            // check if the y coordinate is a valid coordiante of the circle
            if (xMinusHSquared >= 0) {
                // Iterate until the difference between guesses is small
                while ((xMinusH * xMinusH - xMinusHSquared) > epsilon
                        || (xMinusHSquared - xMinusH * xMinusH) > epsilon) {
                    xMinusH = (xMinusH + xMinusHSquared / xMinusH) / 2;
                }

                // extend the x axis (because my font style is thin)
                xMinusH *= 1.8;
                // obtain the x coordinate from by adding h to the square root of calculated
                // value
                double x = xMinusH + h;

                // the gap between the vertical border and the circle's left edge
                // space = (IL / 2) - x + gap
                double spaceX = (innerLength / 2) - x + 2;
                double circleInternalSpace = (x * 2) - 9;

                // print the left side of the arc
                for (int i = 1; i <= spaceX; i++)
                    System.out.print(" ");
                System.out.print("0@@0");

                // print the internal spacing
                switch (y) {
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
                        for (int i = 1; i <= circleInternalSpace; i++)
                            System.out.print(" ");
                }
                // print the right side of the arc
                System.out.print("0@@0");

                // print the amount of space needed to fill the right portion of icon
                for (int i = 1; i <= (innerLength - circleInternalSpace - 8 - spaceX); i++)
                    System.out.print(" ");

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
                for (int i = 1; i <= innerLength; i++)
                    System.out.print(" ");
            }
            // print right side of the vertical border
            if (y % 2 == 0)
                System.out.print("0");
            else
                System.out.print("1");

            System.out.println();
        }

        int slopeHeight = 7;
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

        System.out.println("\n");

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
