/**
 * @(#)exercice2.java
 *
 *
 * @author 
 * @version 1.00 2025/4/17
 */


 public class exercice2 {

    public static double addition(double nombre1, double nombre2) {
        return nombre1 + nombre2;
    }

    public static double soustraction(double nombre1, double nombre2) {
        return nombre1 - nombre2;
    }

    public static double multiplication(double nombre1, double nombre2) {
        return nombre1 * nombre2;
    }

    public static double division(double nombre1, double nombre2) {
        return nombre1 / nombre2;
    }

    public static void main(String[] args) {
        String operation;

        System.out.println("Calculatrice Simple");
        System.out.println("------------------");

        do {
            System.out.print("Choisissez une opération (+, -, *, /) : ");
            operation = Clavier.lireString();

            if (!operation.equals("+") && !operation.equals("-") &&
                !operation.equals("*") && !operation.equals("/")) {
                System.out.println("Opération non valide. Veuillez réessayer.");
            }
        } while (!operation.equals("+") && !operation.equals("-") &&
                 !operation.equals("*") && !operation.equals("/"));

        System.out.print("Entrez le premier nombre : ");
        double premierNombre = Clavier.lireDouble();

        System.out.print("Entrez le deuxième nombre : ");
        double deuxiemeNombre = Clavier.lireDouble();

        if (operation.equals("/")) {
            while (deuxiemeNombre == 0) {
                System.out.println("Erreur : Division par zéro impossible.");
                System.out.print("Veuillez entrer un deuxième nombre différent de zéro : ");
                deuxiemeNombre = Clavier.lireDouble();
            }
        }

        double resultat = 0;

        switch (operation) {
            case "+":
                resultat = addition(premierNombre, deuxiemeNombre);
                break;
            case "-":
                resultat = soustraction(premierNombre, deuxiemeNombre);
                break;
            case "*":
                resultat = multiplication(premierNombre, deuxiemeNombre);
                break;
            case "/":
                resultat = division(premierNombre, deuxiemeNombre);
                break;
        }

        System.out.println("Résultat : " + premierNombre + " " + operation + " " +
                           deuxiemeNombre + " = " + resultat);
    }
}
