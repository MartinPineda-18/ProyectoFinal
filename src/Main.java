import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gimnasio gimnasio = new Gimnasio();
        Scanner teclado = new Scanner(System.in);

        Cliente cliente1 = new Cliente("Juan", 18, "1019604513","Premium");
        Cliente cliente2 = new Cliente("Maria", 20,"30908765","Premium");
        Entrenador entrenador1 = new Entrenador("Julian", 30, "2089764127","Tren superior");

        gimnasio.agregarPersona(cliente1);
        gimnasio.agregarPersona(cliente2);
        gimnasio.agregarPersona(entrenador1);
        gimnasio.mostrarPersonas();
        gimnasio.eliminarPersona("30908765");

        System.out.println("\nBuscando cliente con cedula 1019604513:");
        Persona personaBuscada = gimnasio.buscarPersona("1019604513");
        if (personaBuscada != null) {
            System.out.println(personaBuscada.obtenerInformacion());
        } else {
            System.out.println("Cliente no encontrado.");
        }

        /*int opc;

        System.out.println("Ingrese la opcion deseada: \n" +
                "1) Agregar persona\n" +
                "2) Eliminar persona\n" +
                "3) Mostrar personas\n" +
                "4) Buscar persona\n");
        opc = teclado.nextInt();

        switch (opc) {

            case 1:
                System.out.println("Ingrese el nombre de la persona: ");
                teclado.next(new Cliente())
        }*/

    }
}