/**
 * @(#)exercice3.java
 *
 *
 * @author 
 * @version 1.00 2025/4/17
 */

public class exercice3 {

    public static boolean EstInf(String verbe) {
        return verbe.endsWith("er")
            || verbe.endsWith("ir")
            || verbe.endsWith("re")
            || verbe.endsWith("oir");
    }

    public static int Groupe(String verbe) {
        if (verbe.equals("aller")) {
            return 3;
        }

        if (verbe.endsWith("er")) {
            return 1;
        }

        String[] deuxiemeGroupe = {
            "finir", "choisir", "grandir", "rougir", "applaudir", "réussir", "obéir", "punir"
        };
        for (String v : deuxiemeGroupe) {
            if (verbe.equals(v)) {
                return 2;
            }
        }

        return 3;
    }

    public static void main(String[] args) {
        String verbe;

        do {
            System.out.print("Saisissez un verbe à l'infinitif : ");
            verbe = Clavier.lireString().toLowerCase();

            if (!EstInf(verbe)) {
                System.out.println("Erreur : ce n’est pas un infinitif. Réessayez.");
            }
        } while (!EstInf(verbe));

        int g = Groupe(verbe);
        switch (g) {
            case 1:
                System.out.println("Le verbe \"" + verbe + "\" est du 1er groupe.");
                break;
            case 2:
                System.out.println("Le verbe \"" + verbe + "\" est du 2e groupe.");
                break;
            default:
                System.out.println("Le verbe \"" + verbe + "\" est du 3e groupe.");
        }
    }
}
