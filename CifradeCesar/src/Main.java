import java.util.Scanner;
import java.lang.String;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        // Informa texto e chave de descriptografia
        System.out.print("Informe o texto a ser descriptografado: ");
        String texto = entrada.nextLine();
        int tamanhoTexto = texto.length();

        System.out.println("\n\n Texto Criptografado: " + texto);

        for (int key = 0; key < 26; key++) {
            StringBuilder textoCifrado = new StringBuilder();
            for (int c = 0; c < tamanhoTexto; c++) {
                int letraDecifradaASCII = ((int) texto.charAt(c) - key);
                textoCifrado.append((char) letraDecifradaASCII);
                System.out.println("\n\nTEXTO DESCRIPTOGRAFADO: " + textoCifrado);
            }
        }
    }
}
