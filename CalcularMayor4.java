import java.util.Scanner;

public class CalcularMayor4 {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingresa un número entero: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingresa otro número entero: ");
        int numero2 = scanner.nextInt();
        System.out.print("Ingresa un número entero: ");
        int numero3 = scanner.nextInt();
        System.out.print("Ingresa un número entero: ");
        int numero4 = scanner.nextInt();

        if (numero1>numero2 && numero1> numero3 && numero1>numero4){
        System.out.println("El número mayor es:"  + numero1);

    } else if (numero2>numero1 && numero2>numero3 && numero2>numero4)
        {
        System.out.println("  El número mayor es  "  + numero2);
        } else if (numero3>numero1 && numero3>numero2 && numero3>numero4) {
        System.out.println("  El número mayor es  "  + numero3);
        } else if (numero4>numero1 && numero4>numero2 && numero4>numero3) {
        System.out.println("  El número mayor es  "  + numero4);
        } else {
        System.out.println(" los numeros son iguales.");
        }
        scanner.close();
        }
        }