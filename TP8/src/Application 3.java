/**
 * @(#)Application 3.java
 *
 *
 * @author
 * @version 1.00 2025/3/2
 */

public class Application 3 {
        

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Entrez une cha�ne pour v�rifier si c'est un palindrome : ");
        String palindromeCheck = scanner.nextLine();
        String reversed = new StringBuilder(palindromeCheck).reverse().toString();
        if (palindromeCheck.equalsIgnoreCase(reversed)) {
            System.out.println("C'est un palindrome.");
        } else {
            System.out.println("Ce n'est pas un palindrome.");
        }
        scanner.close();
    }
}
