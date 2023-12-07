
public class Methode {

    public static void afficherPlateau(char[][] tab)
    {
        for(int i=0;i< tab.length;i++)
            for (int j = 0; j < tab[i].length; j++) {
                System.out.print(tab[i][j] + "\t");
            }
            System.out.println("");
    }
}