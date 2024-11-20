public class Q5 {
    public static void main(String[] args) {
        // Conversion du paramètre en entier
        int n = Integer.parseInt(args[0]);

        // Affichage du triangle inversé d'étoiles
        for (int i = n; i >= 1; i--) { // La boucle externe commence par la ligne la plus large
            for (int j = 1; j <= i; j++) { // La boucle interne contrôle le nombre d'étoiles
                System.out.print("*");
            }
            System.out.println(); // Passage à la ligne suivante
        }
    }
}
