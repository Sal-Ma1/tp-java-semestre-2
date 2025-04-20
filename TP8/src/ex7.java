import java.util.Scanner;

import java.util.Scanner;

public class ex7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Donner un verbe r�gulier du premier groupe (termin� par 'er') : ");
        String verbe = scanner.nextLine();

        if (verbe.equalsIgnoreCase("aller")) {
            System.out.println("Le verbe 'aller' est irr�gulier et ne peut pas �tre conjugu� avec ce programme.");
        }
        else if (verbe.equalsIgnoreCase("commencer")) {
            System.out.println("Je commence");
            System.out.println("Tu commences");
            System.out.println("Il/Elle commence");
            System.out.println("Nous commen�ons");
            System.out.println("Vous commencez");
            System.out.println("Ils/Elles commencent");
        }
        else if (verbe.endsWith("er")) {
            String radical = verbe.substring(0, verbe.length() - 2);

            System.out.println("Je " + radical + "e");
            System.out.println("Tu " + radical + "es");
            System.out.println("Il/Elle " + radical + "e");
            System.out.println("Nous " + radical + "ons");
            System.out.println("Vous " + radical + "ez");
            System.out.println("Ils/Elles " + radical + "ent");
        } else {
            System.out.println("Le verbe saisi ne se termine pas par 'er'. Veuillez entrer un verbe du premier groupe.");
        }

        scanner.close();
    }
}
