package Login;

import java.util.Scanner;

public class JeissonAndres {
    static void main() {

        Scanner leerTeclado = new Scanner(System.in);

        String colorVerde = "\u001B[32m";

        String correoDigitadoUsuario = "";
        String contrasenaDigitadaUsuario = "";
        String correoGuardadoBaseDatos = "jason@gmail.com";
        String contrasenaGuardadaBaseDatos = "5555";

        Integer intentos = 0 ;

        System.out.println(colorVerde + "**********************");
        System.out.println("Zoologico SURA 🙉");
        System.out.println("**********************");

        while (intentos <3) {

            System.out.print("Ingrese su correo📨: ");
            correoDigitadoUsuario=leerTeclado.nextLine();

            System.out.print("Ingrese su contraseña🔐: ");
            contrasenaDigitadaUsuario=leerTeclado.nextLine();

            if (correoDigitadoUsuario.equals(correoGuardadoBaseDatos) &&
                    contrasenaDigitadaUsuario.equals(contrasenaGuardadaBaseDatos)) {

                System.out.println("Acceso Concedido✅");
                break;

            }else{
                intentos++;
                System.out.println("Acceso denegado, " + intentos + " de 3 ");
            }
            if (intentos.equals(3)) {
                System.out.println("Acceso Denegado Por Maximo De Intentos❌");
            }
        }
    }
}
