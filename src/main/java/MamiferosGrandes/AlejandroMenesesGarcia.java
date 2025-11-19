package MamiferosGrandes;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class AlejandroMenesesGarcia {
    static void main(String[] args) {
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> mamiferosGrandes = new ArrayList<>();

        String decision="entrar";

        while (!decision.equals("SALIR")){

            System.out.println("¡Bienvenido! a continuación podras ingresar los datos de un mamifero grande");

            HashMap<String, Object> mamiferoGrande = new HashMap<>();
            System.out.print("Digite el nombre del mamifero");
            mamiferoGrande.put("nombre", pedirDato.nextLine());

            System.out.print("Digite la fecha de ingreso del mamifero");
            mamiferoGrande.put("fecha", pedirDato.nextLine());

            System.out.print("Digite los alimentos del mamifero");
            mamiferoGrande.put("alimentos", pedirDato.nextLine());

            System.out.print("Digite el ID del mamifero");
            mamiferoGrande.put("Id", pedirDato.nextInt());

            System.out.print("Digite la edad del mamifero");
            mamiferoGrande.put("edad", pedirDato.nextInt());

            pedirDato.nextLine();

            mamiferosGrandes.add(mamiferoGrande);
            System.out.println("Los datos de los mamiferos se registrarón con exito");

            System.out.println(mamiferosGrandes);

            System.out.print("Digita SALIR si no quieres ingresar mas datos, si deseas continuar digita" +
                    " lo que desees");
            decision=pedirDato.nextLine();
            System.out.println("Digitaste " + decision);

            if (decision.equals("SALIR")){
                break;
            }
        }
    }
}
