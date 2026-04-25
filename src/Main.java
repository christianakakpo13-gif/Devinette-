import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // Générer un nombre aléatoire entre 1 et 100
        int secretNumber = 1 + (int)(Math.random() * 100);
        int maxEssais = 10;
        boolean gagne = false;

        Scanner scanner = new Scanner(System.in);
        System.out.println("=== Jeu du nombre à deviner ===");
        System.out.println("Trouvez le nombre entre 1 et 100.");
        System.out.println("Vous avez 10 essais.");

        for (int essai = 1; essai <= maxEssais; essai++) {
            System.out.println("\nEssai " + essai + "/" + maxEssais + " : ");

            int proposition = scanner.nextInt();

            if (proposition == secretNumber) {
                System.out.println("Bravo ! Vous avez trouvé en " + essai + " essai(s) !");
                gagne = true;
                break; // Sortir de la boucle
            } else if (proposition < secretNumber) {
                System.out.println("Trop petit ! Proposez plus grand.");
            } else {
                System.out.println("Trop grand ! Proposez plus petit.");
            }
        }

        // Si la boucle s'est terminée sans gagner
        if (!gagne) {
            System.out.println("\nPerdu ! Le nombre était : " + secretNumber);
        }

        scanner.close();
    }
}