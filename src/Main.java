import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);

        System.out.println("Bienvenue sur TicTacToe !");
        System.out.println("Joueur 1, Saisissez votre Pseudo : ");
        String nameJUn = "";
        nameJUn = clavier.nextLine();
        System.out.println("Joueur 2, Saisissez votre Pseudo : ");
        String nameJDeux = "";
        nameJDeux = clavier.nextLine();

        int[][] grille = new int [3][3]; // grille à deux dimensions : à 3 unités d'abscisse et 3 d'ordonnées
        int valeur = 1;

        for(int i = 0; i<3 ; i++){

            for (int j = 0; j<3 ; j++){
                grille[i][j] = valeur++;
            }
        }







    }

}