import java.util.Arrays;
import java.util.Scanner;

public class Menu {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        String noirPos;
        String blancPos;

        char pos1;
        char pos2;


        char[][] plateau= {{' ','a','b','c','d','e','f','g','h'},
                {'1',' ',' ',' ',' ',' ',' ',' ',' '},
                {'2',' ',' ',' ',' ',' ',' ',' ',' '},
                {'3',' ',' ',' ',' ',' ',' ',' ',' '},
                {'4',' ',' ',' ','⚫','⚪',' ',' ',' '},
                {'5',' ',' ',' ','⚪','⚫',' ',' ',' '},
                {'6',' ',' ',' ',' ',' ',' ',' ',' '},
                {'7',' ',' ',' ',' ',' ',' ',' ',' '},
                {'8',' ',' ',' ',' ',' ',' ',' ',' '}};

        for(int i=0;i< plateau.length;i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                System.out.print(plateau[i][j] + "\t");
            }
            System.out.println("");
        }


        System.out.println("");
        System.out.print("La couleur noir commence. Choississez un placement : ");

        noirPos = scanner.nextLine();

        pos1 = (char)(noirPos.charAt(0) - '`');
        pos2 = (char)(noirPos.charAt(1) - '0');

        plateau[pos2][pos1] = '⚪';

        Methode.afficherPlateau(plateau);

    }
}