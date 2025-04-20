/**
 * @(#)Application 1.java
 *
 *
 * @author
 * @version 1.00 2025/3/2
 */

public class Application 1 {
        
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une cha�ne de caract�res : ");
        String ch = clavier.nextLine();
        System.out.print("Entrez un caract�re � chercher : ");
        char car = scanner.next().charAt(0);
        int count = 0;
        for (int i = 0; i < ch.length(); i++) {
            if (ch.charAt(i) == car) {
                count++;
            }
        }
        System.out.println("Le caract�re '" + car + "' appara�t " + count + " fois.");
        scanner.close();
    }
}
