public class Fonction_Methode {

    public static void AfficherPlateau(char[][] plateau){
        /*
            Cette méthode permet d'afficher la méthode
         */

        for(int i=0;i< plateau.length;i++) {
            for (int j = 0; j < plateau[i].length; j++) {
                System.out.print(plateau[i][j] + "\t");
            }
            System.out.println("");
        }
    }
    public static boolean coordonéeValide(String s){
        if(s.length()==2) {
            if (s.charAt(0) >= '1' && s.charAt(0) <= '8')
                if ((s.charAt(1) >= 'a' && s.charAt(1) <= 'h') || (s.charAt(1) >= 'A' && s.charAt(1) <= 'H'))
                    return true;
            if ((s.charAt(0) >= 'a' && s.charAt(0) <= 'h') || (s.charAt(0)>= 'A' && s.charAt(0) <= 'H'))
                if (s.charAt(1) >= '1' && s.charAt(1) <= '8')
                    return true;
        }
        return false;
    }
    public static int ConvertirChoix(String s){
        int a=0;
        return a;
    }





    public static boolean Placer(char[][] t, int a, int b, char c) {
        for (int i = -1; i <= 1; i++) {
            for (int j = -1; j <= 1; j++)
                if (t[a + i][b + j] == c)
                    return true;

        }
        return false;


    }

    public static void remplacer(char[][] t, int a, int b, char ennemi, char allié) {
        int x=4, y=3;
        boolean present;
        int degres=2;
        for (int i = -1; i <= 1; i++)
            for (int j = -1; j <= 1; j++)
                if (t[a + i][b + j] == ennemi) {
                    y = a + i;
                    x = b + j;
                    if (t[a+(i*degres)][b+(j*degres)] == allié)
                        t[y][x] = allié;
                    t[a][b] = allié;

                }
    }
}
