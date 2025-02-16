import java.util.Scanner;

public class PedirValor {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese un número entero
        System.out.print("Ingresa un número entero: ");
        int numero = scanner.nextInt();
        // Determinar si el número es positivo, negativo o cero
        if (numero > 0) {

            System.out.print("Ingresa otro número entero: ");
            int numero2 = scanner.nextInt();

            int suma = numero + numero2;
            int resta= numero - numero2;
            int multiplicacion = numero * numero2;
            
            
            System.out.println("la suma suma de " + numero +" + "+ numero2 +  " es: " + suma);
            System.out.println("la resta  de " + numero +" + "+ numero2 +  " es: " + resta);
            System.out.println("la multiplicacion  de " + numero +" + "+ numero2 +  " es: "+ multiplicacion);
            
            

        } else if (numero < 0) {
            System.out.println("El número " + numero + " es negativo.");
        } else {
            System.out.println("El número es cero.");
        }

        // Cerrar el escáner
        scanner.close();
    }
}