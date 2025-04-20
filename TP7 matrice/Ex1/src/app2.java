/**
 * @(#)app2.java
 *
 * A simple Java program to handle matrices.
 *
 * @author 
 * @version 1.00 2025/2/20
 */

public class app2 {
    
    /**
     * Constructor for app2 (not needed, but kept for now).
     */
    public app2() {
    }

    public static void main(String[] args) {  // ? Only one main method
        
        int nl;
        do {
            System.out.print("Entrez le nombre de lignes (nl < 30): ");
            nl = Clavier.lireInt();  // ? Fixed function name
        } while (nl <= 0 || nl >= 30);

        int nc;
        do {
            System.out.print("Entrez le nombre de colonnes (nc < 30): ");
            nc = Clavier.lireInt();  // ? Fixed function name
        } while (nc <= 0 || nc >= 30);

        int[][] M = new int[nl][nc];
        System.out.println("Entrez les éléments de la matrice:");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = Clavier.lireInt();  // ? Fixed function name
            }
        }

        int somme = 0;
        long produit = 1;
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                somme += M[i][j];
                produit *= M[i][j];
            }
        }

        double moyenne = (double) somme / (nl * nc);
        System.out.println("Somme des éléments: " + somme);
        System.out.println("Produit des éléments: " + produit);
        System.out.println("Moyenne des éléments: " + moyenne);
    }
}
