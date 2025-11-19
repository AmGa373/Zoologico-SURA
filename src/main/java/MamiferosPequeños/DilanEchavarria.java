package MamiferosPequeños;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class DilanEchavarria {
    public static void main(String[] args) {
        Scanner pedirDato = new Scanner(System.in);
        ArrayList<HashMap<String, Object>> mamiferosPequenhos = new ArrayList<>();
        String desicion = " ";
        while (!desicion.equals("SALIR")) {
            HashMap<String, Object> mamiferoPequenho = new HashMap<>();

            System.out.print("Ingrese el nombre del mamífero pequeño: ");
            mamiferoPequenho.put("nombre", pedirDato.next());

            System.out.print("Ingrese el Id del mamífero pequeño: ");
            mamiferoPequenho.put("Id", pedirDato.nextInt());

            System.out.print("Ingrese la edad del mamífero pequeño: ");
            mamiferoPequenho.put("edad" , pedirDato.nextInt());

            pedirDato.nextLine();

            System.out.print("Ingrese la fecha de entrada del mamífero pequeño: ");
            mamiferoPequenho.put("fechaEntrada" , pedirDato.nextLine());

            System.out.print("Ingrese los alimentos del mamífero pequeño: ");
            mamiferoPequenho.put("alimentos" , pedirDato.nextLine());

            mamiferosPequenhos.add(mamiferoPequenho);
            System.out.println(mamiferosPequenhos);

            System.out.print("Si desea salir ingrese (SALIR), si no ingrese cualquier cosa: ");
            desicion=pedirDato.next();
            if (desicion.equals("SALIR")) {
                System.out.println("Hasta luego, vuelva pronto.");
            }





        }


    }
}
