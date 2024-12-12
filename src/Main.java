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
        System.out.println("Ordre de passage : "+nameJUn+" , puis "+nameJDeux+"");

        char[][] grille ={
                {'1','2','3'},
                {'4','5','6'},
                {'7','8','9',},
        }; // grille à deux dimensions : à 3 unités d'abscisse et 3 d'ordonnées
        /*
        grille[0][0] = 1   grille[0][1] = 2   grille[0][2] = 3
        grille[1][0] = 4   grille[1][1] = 5   grille[1][2] = 6
        grille[2][0] = 7   grille[2][1] = 8   grille[2][2] = 9
         */
        System.out.println(grille);

        int tour = 9;
        public static void partiePrincipale() {
            Scanner clavier = new Scanner(System.in);

            while (tour > 0) {
                System.out.println(nameJUn + " , Saisissez votre case (entre 1 et 9): ");
                char carreauJUn;
                carreauJUn = clavier.nextInt();
                clavier.skip("\n");
                String reponse;
                switch (carreauJUn) {
                    case "1":
                        reponse = "1";
                        grille[0][0] = "X";
                        break;
                    case "2":
                        reponse = "2";
                        grille[0][1] = "X"
                        break;
                    case "3":
                        reponse = "3";
                        grille[0][2] = "X"
                        break;
                    case "4":
                        reponse = "4";
                        grille[1][0] = "X"
                        break;
                    case "5":
                        reponse = "5";
                        grille[1][1] = "X"
                    case "6":
                        reponse = "6";
                        grille[1][2] = "X"
                        break;
                    case "7":
                        reponse = "7";
                        grille[2][0] = "X"
                        break;
                    case "8":
                        reponse = "8";
                        grille[2][1] = "X"
                        break;
                    case "9":
                        reponse = "9";
                        grille[2][2] = "X"
                        break;
                    default:
                        reponse = "Erreur...";
                }
                if (reponse == "Erreur...") {
                    System.out.println("Erreur, la partie recommence...");
                    partiePrincipale;
                } else {
                    System.out.println("Vous avez choisi la case " + reponse);
                }

                // Joueur 2

                System.out.println(nameJDeux + " , Saisissez votre case (entre 1 et 9): ");
                char carreauJDeux;
                carreauJDeux = clavier.nextInt();
                clavier.skip("\n");
                String reponse;
                switch (carreauJDeux) {
                    case "1":
                        reponse = "1";
                        grille[0][0] = "O";
                        break;
                    case "2":
                        reponse = "2";
                        grille[0][1] = "O"
                        break;
                    case "3":
                        reponse = "3";
                        grille[0][2] = "O"
                        break;
                    case "4":
                        reponse = "4";
                        grille[1][0] = "O"
                        break;
                    case "5":
                        reponse = "5";
                        grille[1][1] = "O"
                    case "6":
                        reponse = "6";
                        grille[1][2] = "O"
                        break;
                    case "7":
                        reponse = "7";
                        grille[2][0] = "O"
                        break;
                    case "8":
                        reponse = "8";
                        grille[2][1] = "O"
                        break;
                    case "9":
                        reponse = "9";
                        grille[2][2] = "O"
                        break;
                    default:
                        reponse = "Erreur...";
                }
                if (reponse == "Erreur...") {
                    System.out.println("Erreur, la partie recommence...");
                    partiePrincipale;
                } else {
                    System.out.println("Vous avez choisi la case " + reponse);
                }

            }

        }

    }

}