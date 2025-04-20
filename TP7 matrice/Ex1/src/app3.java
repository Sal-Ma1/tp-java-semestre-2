/**
 * @(#)app3.java
 *
 *
 * @author 
 * @version 1.00 2025/2/23
 */

public class app3 {
        
    /**
     * Creates a new instance of <code>app3</code>.
     */
    public app3() {
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       int nl, nc;
        do {
            System.out.print("Entrez le nombre de lignes (nl = 20) : ");
            nl = Clavier.lireInt();
        } while (nl <= 0 || nl > 20);

        do {
            System.out.print("Entrez le nombre de colonnes (nc = 30) : ");
            nc = Clavier.lireInt();
        } while (nc <= 0 || nc > 30);

        // Déclaration de la matrice et du tableau des sommes
        int[][] M = new int[nl][nc];
        int[] T = new int[nl];

        // Remplissage de la matrice avec des entrées clavier
        System.out.println("Entrez les éléments de la matrice :");
        for (int i = 0; i < nl; i++) {
            for (int j = 0; j < nc; j++) {
                System.out.print("M[" + i + "][" + j + "] = ");
                M[i][j] = Clavier.lireInt();
            }
        }

        // Calcul des sommes des lignes et stockage dans T
        int minSum = Integer.MAX_VALUE;
        int maxSum = Integer.MIN_VALUE;

        for (int i = 0; i < nl; i++) {
            int sum = 0;
            for (int j = 0; j < nc; j++) {
                sum += M[i][j];
            }
            T[i] = sum;
            if (sum < minSum) minSum = sum;
            if (sum > maxSum) maxSum = sum;
        }

        // Affichage des résultats
        System.out.println("Sommes des lignes :");
        for (int i = 0; i < nl; i++) {
            System.out.println("Somme de la ligne " + (i + 1) + " : " + T[i]);
        }

        System.out.println("Somme minimale : " + minSum);
        System.out.println("Somme maximale : " + maxSum);

       
    }
}
