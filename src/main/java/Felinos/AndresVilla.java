package Felinos;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AndresVilla {

    public static void main(String[] args) {

        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> listaFelinos = new ArrayList<>();
        String decision= "entrar";
        while (!decision.equals("SALIR")) {

            HashMap<String, Object> felino = new HashMap<>();


            System.out.println("Digite el nombre del felino");
            felino.put("Nombre Felino: ", pedirDato.nextLine());

            System.out.println("Digite la fecha de ingreso del felino");
            felino.put("Fecha ingreso: ", pedirDato.nextLine());


            System.out.println("Digite el alimento del felino");
            felino.put("Alimento felino: ", pedirDato.nextLine());

            System.out.print("Digita el id del felino: ");
            felino.put("Id felino", pedirDato.nextInt());

            System.out.print("Digita la edad del felino: ");
            felino.put("Edad felino: ", pedirDato.nextInt());

            pedirDato.nextLine();
            System.out.println(listaFelinos);

            listaFelinos.add(felino);
            System.out.println("\nFelinos registrados:");
            System.out.println(listaFelinos);


            System.out.print("¿Desea agregar otro felino? (s/n): ");
            decision= pedirDato.nextLine();

            if (decision.equals("SALIR")) {
                break;
            }
        }



    }
}
