import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Digite el tipo de sala (Dinamix, 3D, 2D): ");
        String Sala = input.nextLine();
        System.out.print("Digite el número de boletas: ");
        int cant = input.nextInt();
        System.out.print("Digite la hora del día (en formato 24 horas): ");
        int hora = input.nextInt();
        System.out.print("Digite el tipo de pago (CinemaCard o Otros): ");
        String Pago = input.next();
        System.out.print("¿Tiene reserva? (Sí o No): ");
        String tieneReserva = input.next();

        
        int precio = 0;
        if (Sala.equalsIgnoreCase("Dinamix")) {
            if (hora >= 17 && hora < 23) {
                precio = 28200; 
            } else {
                precio = 18800;
            }
        } else if (Sala.equalsIgnoreCase("3D")) {
            if (hora >= 17 && hora < 23) {
                precio = 19375;
            } else {
                precio = 15500;
            }
        } else if (Sala.equalsIgnoreCase("2D")) {
            if (hora >= 17 && hora < 23) {
                precio = 14125;
            } else {
                precio = 11300;
            }
        } else {
            System.out.println("Tipo de sala no válido");
            System.exit(0);
        }

        int descuentoBoletas = 0;
        if (cant >= 3) {
            descuentoBoletas = (cant - 3) * 500;
        }

        double descuentoTarjeta = 0;
        if (Pago.equalsIgnoreCase("CinemaCard")) {
            descuentoTarjeta = 0.05;
        }

        int recargoReserva = 0;
        if (tieneReserva.equalsIgnoreCase("Sí")) {
            recargoReserva = 2000 * cant;
        }
        
        double precioFinal=(precio * cant - descuentoBoletas) * (1 - descuentoTarjeta);
        System.out.printf("El precio final es: %,.0f", precioFinal + recargoReserva);
                }
}

