/**
 * @(#)Application 4.java
 *
 *
 * @author
 * @version 1.00 2025/3/2
 */

public class Application 4 {
        

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une cha�ne � inverser : ");
        String toReverse = scanner.nextLine();
        String inverted = new StringBuilder(toReverse).reverse().toString();
        System.out.println("Cha�ne invers�e : " + inverted);
        scanner.close();
    }
}
