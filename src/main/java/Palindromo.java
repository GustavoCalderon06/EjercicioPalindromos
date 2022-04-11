import java.util.Scanner;

public class Palindromo {
    public static void main(String[] args) {
        Palindromo();



    }

    public static void Palindromo() {
        Scanner teclado = new Scanner(System.in);
        palindromo2 objclass = new palindromo2();
        System.out.println("Ingresa la palabra");
        String nuevo = teclado.nextLine();
        if (objclass.espalindromo(nuevo)) {
            System.out.println("Es un palindromo");
        } else {
            System.out.println("No es Palindromo");
        }
    }
}
