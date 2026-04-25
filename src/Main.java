import java.util.Scanner;

/**
 * Jeu du nombre à deviner
 * Le joueur a 10 essais pour trouver un nombre aléatoire entre 1 et 100.
 */
class Main {
    public static void main(String[] args) {
        // Génère un nombre aléatoire entre 1 et 100 (inclus)
        int secretNumber = 1 + (int)(Math.random() * 100);
        // Nombre maximum de tentatives autorisées au joueur
        int maxEssais = 10;
        // Drapeau pour vérifier si le joueur a trouvé le nombre
        boolean gagne = false;

        // Initialisation du scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);
        // Affichage du titre et des règles du jeu
        System.out.println("=== Jeu du nombre à deviner ===");
        System.out.println("Trouvez le nombre entre 1 et 100.");
        System.out.println("Vous avez 10 essais.");

        // Boucle principale du jeu: le joueur a maxEssais tentatives
        for (int essai = 1; essai <= maxEssais; essai++) {
            System.out.println("\nEssai " + essai + "/" + maxEssais + " : ");

            // Récupère la proposition du joueur
            int proposition = scanner.nextInt();

            // Vérifie si la proposition est correcte
            if (proposition == secretNumber) {
                System.out.println("Bravo ! Vous avez trouvé en " + essai + " essai(s) !");
                gagne = true;
                break; // Sortir de la boucle immédiatement
            } else if (proposition < secretNumber) {
                // Indique au joueur que le nombre cherché est plus grand
                System.out.println("Trop petit ! Proposez plus grand.");
            } else {
                // Indique au joueur que le nombre cherché est plus petit
                System.out.println("Trop grand ! Proposez plus petit.");
            }
        }

        // Affiche le résultat final si le joueur n'a pas trouvé
        if (!gagne) {
            System.out.println("\nPerdu ! Le nombre était : " + secretNumber);
        }

        // Ferme le scanner pour libérer les ressources
        scanner.close();
    }
}