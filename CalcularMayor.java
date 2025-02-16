import java.util.Scanner;

public class CalcularMayor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        // Determinar si el número es positivo, negativo o cero
        System.out.print("Ingresa otro número entero: ");
        int numero2 = scanner.nextInt();

        if (numero>numero2) {
        System.out.println("El número mayor es:"  + numero);
        } else if (numero2>numero) {
        System.out.println("    El número mayor es"  + numero2);
        } else {
        System.out.println(" ambos numeros son iguales.");
        

        }scanner.close();
    }
}