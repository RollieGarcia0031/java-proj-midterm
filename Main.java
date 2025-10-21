public class Main {
    public static void main(String[] args){
        engineer();
        System.out.print("\n\n\n\n");
        // logo2();
    }

    public static void engineer(){        
        System.out.println("          _______");

        int bodyWidth = 6;
        for (int row = 9; row >= 4; row --){
            int space = 1;
            while (space <= row){
                System.out.print(" ");
                space ++;
            }

            if (row >= 6){
                System.out.print("/");
                for (int i = 1; i <= bodyWidth; i ++) System.out.print(" ");
                System.out.print("/");
            }
            if (row == 6) {
                for(int i = 1; i <= bodyWidth/2+1; i ++)System.out.print('_'); 
            }
            if (row <= 5) {
                System.out.print("/");
                for (int i = 1;i <= 6*2-1; i ++)System.out.print(" ");
                System.out.print("/");
            }

            System.out.println();
        }

        System.out.println("   /_____      /");      

        for (int column = 8; column >= 4; column --){
            for (int space = 1; space <= column; space ++) System.out.print(" ");

            if (column > 4) System.out.println("/     /");
            else System.out.println("/_____/");
        }
    }

    public static void logo2(){
        
        //layer 1
        for (int i = 1; i <= 34; i ++)System.out.print(" ");
        for (int i = 1; i <= 30; i ++)System.out.print("_");

        System.out.println();

        //layer 2
        for (int i = 0; i <= 24;i ++) System.out.print(" ");
        for (int i = 1; i<= 7; i ++) System.out.print("@");
        System.out.print("  |");
        for (int i = 1; i <= 28; i ++) System.out.print(' ');

        System.out.println("|");

        //layer 3,4
        for (int k = 1; k <= 2; k ++ ){
            for(int i = 1; i <= 26; i++) System.out.print(" ");
            for(int i = 1; i <= 6; i ++) System.out.print("@");
            System.out.print("  |");
            for(int i = 1; i <= 28; i ++) System.out.print(" ");

            System.out.println("|");
        }

        //layer 5
        for (int i = 1; i <= 18; i ++) System.out.print(" ");
        for (int i = 1; i <= 14; i++) System.out.print("@");
        System.out.print("  |");
        for (int i = 1; i <= (11); i ++) System.out.print(" ");
        for (int i = 1; i <= 17; i++) System.out.print("_");
        System.out.println("|");

        int letterBaseWidth = 10;

        // layer 6,7
        for (int repeat = 1; repeat <= 2; repeat ++){
            for (int i = 1; i <= 16; i++) System.out.print(" ");
            if (repeat == 2) {
                for (int i = 1; i <= 12; i ++) System.out.print("@");
                System.out.print("      |");
            } else {
                for (int i = 1; i <= 34-18; i ++) System.out.print("@");
                System.out.print("  |");
            }
            for (int i = 1; i <= letterBaseWidth; i++) System.out.print(" ");
            System.out.println("|");
        }

        int middleLetterLength = 61-36;

        //layer 8
        for (int i = 1; i <= 19; i ++) System.out.print(" ");
        for (int i = 1; i <= 8; i ++) System.out.print("@");
        System.out.print("       |");
        for (int i = 1; i <= letterBaseWidth; i ++) System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= middleLetterLength - letterBaseWidth; i ++) System.out.print("_");
        System.out.println();

        // layer 9
        for (int i = 1; i <= 18; i ++) System.out.print(" ");
        for (int i = 1; i <= 8; i ++) System.out.print("@");
        System.out.print("        |");
        for (int i = 1; i <= middleLetterLength; i ++) System.out.print(" ");
        System.out.println("|");
        
        // layer 10,11,12
        for (int repeat = 1; repeat <= 3; repeat ++){
            for (int i = 1; i <= 14; i++) System.out.print(" ");
            for (int i = 1; i <= 11; i++) System.out.print("@");
            for (int i = 1; i <= 9; i++) System.out.print(" ");
            System.out.print("|");
            if (repeat == 3){
                for (int i = 1; i <= letterBaseWidth; i ++) System.out.print(" ");
                for (int i = 1; i <= middleLetterLength - letterBaseWidth; i ++) System.out.print("_");
            } else {
                for (int i = 1; i <= middleLetterLength; i ++) System.out.print(" ");
            }
            System.out.println("|");
        }

        // layer 13
        for (int i = 1; i <= 18; i++) System.out.print(" ");
        for (int i = 1; i <= 8; i ++) System.out.print("@");
        for (int i = 1; i <=8; i ++) System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= letterBaseWidth; i ++) System.out.print(" ");
        System.out.println("|");

        //layer 14
        for (int i = 1; i <= 18; i++) System.out.print(" ");
        for (int i = 1; i <= 9; i ++) System.out.print("@");
        for (int i = 1; i <=7; i ++) System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= letterBaseWidth; i ++) System.out.print(" ");
        System.out.println("|");

        int bottomLineLength = 65 - 36; 

        //layer 15
        for (int i = 1; i <= 19; i ++) System.out.print(" ");
        for (int i = 1; i <= 9; i ++) System.out.print("@");
        for (int i = 1; i <= 6; i ++) System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= letterBaseWidth; i ++) System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= bottomLineLength - letterBaseWidth; i ++)System.out.print("_");
        System.out.println();

        //layer 16
        for (int i = 1; i <= 17; i++) System.out.print(" ");
        for (int i = 1; i <= 13; i ++) System.out.print("@");
        for (int i = 1; i <= 4; i++) System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i<= bottomLineLength; i++) System.out.print(" ");
        System.out.println("|"); 

        // layer 17
        for (int i = 1; i <= 22; i ++) System.out.print(" ");
        for (int i = 1; i <= 9; i ++) System.out.print("@");
        for (int i = 1; i <= 3; i ++) System.out.print(" ");
        System.out.print("|");
        for (int i = 1; i <= bottomLineLength; i ++) System.out.print(" ");
        System.out.println("|");
    }
}

// .......  ...... ........       .................................................... . ... .   ..
// ............................:.. ............................... ...  .  ......... .
// . .... ................#@@@@@*..@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@:  .     ...  . ...   ..
// ..... ................ *@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=           ...   ....
// ...................  ..*@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@%.        ..........  .
// ..... .........:@@@@+@@@@@@@@@-.@@@@@@@@@@******************.    ...   ........ ..  .
// .. ............@@@@@@@@@@@@@@@-.@@@@@@@@@#    .       .    ..      ..............   .
// . ............-@@@@@@@@@@@@-....@@@@@@@@@#                           .............  ..  .
// . ....... ......*@@@@@@@@-... ..@@@@@@@@@#                          ............ .  ..
// . ..........   .@@@@@@@@.. .....@@@@@@@@@@###%%%%%%%%%%%%..       ............. ..  .
// ..  .......+@@@@@@@@@@@:   .....@@@@@@@@@@@@@@@@@@@@@@@@@:.    ..................   ..
// . ........ +@@@@@@@@@@@.    ....@@@@@@@@@@@@@@@@@@@@@@@@@:   . .................. . .
// ...........*@@@@@@@@@@@:     ...@@@@@@@@@@@@@@@@@@@@@@@@@:    ..................  . .
// ....... .......=@@@@@@@@. .. . .@@@@@@@@@#    ...............  ..................   ..    .
// ..... ..........@@@@@@@@%.      @@@@@@@@@#.          ......   ..................  .
// .    .....    .-@@@@@@@@@@*.    @@@@@@@@@#                   ... .   ..........  .  .
// .............:@@@@@@@@@@@@@@@*. @@@@@@@@@#                 ..         ...........   .    
// ..... .  ......*@@@@@@@@@@@@@@-.@@@@@@@@@@%@@@@@%%@@%%%%@@@@@@=        ..........   .
// ..... . ........:=....*@@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@@.          ....... ..
// .......       .........=@@@@@@-.@@@@@@@@@@@@@@@@@@@@@@@@@@@@@=.         ......... .
// ... . .          ...  .@@@@@@@..%@@@@@@@@@@@@@@@@@@@@@@@@@@@@.      .  . .......    .
// .........            .....-@%..................................      .   ........   .. .
// ..............      . . ......................................  .......  .......    . ..
