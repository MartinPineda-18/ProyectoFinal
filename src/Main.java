import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Gimnasio gimnasio = new Gimnasio();
        Scanner teclado = new Scanner(System.in);
        Cliente cliente = new Cliente();
        Entrenador entrenador = new Entrenador();

        int opc;

        do {

        System.out.println("Ingrese la opcion deseada: \n" +
                "1) Agregar persona\n" +
                "2) Eliminar persona\n" +
                "3) Mostrar personas\n" +
                "4) Buscar persona\n" +
                "5) Salir");
        opc = teclado.nextInt();
        teclado.nextLine();

        switch (opc) {

            case 1:
                System.out.println("Ingrese la opcion deseada: \n" +
                        "1) Cliente\n" +
                        "2) Entrenador\n" +
                        "3) Salir\n");
                int opc1 = teclado.nextInt();
                teclado.nextLine();

                if (opc1 == 1){
                    System.out.println("Datos cliente: \n");

                    System.out.println("Ingrese nombre: ");
                    cliente.setNombre(teclado.nextLine());

                    System.out.println("Ingrese edad: ");
                    cliente.setEdad(teclado.nextInt());
                    teclado.nextLine();

                    System.out.println("Ingrese cedula: ");
                    cliente.setId(teclado.nextLine());

                    System.out.println("Ingrese el tipo de membresia: ");
                    cliente.setTipoMembresia(teclado.nextLine());

                    gimnasio.agregarPersona(cliente);

                } else if (opc1 == 2) {

                    System.out.println("Datos entrenador: \n");

                    System.out.println("Ingrese nombre: ");
                    entrenador.setNombre(teclado.nextLine());

                    System.out.println("Ingrese edad: ");
                    entrenador.setEdad(teclado.nextInt());
                    teclado.nextLine();

                    System.out.println("Ingrese cedula: ");
                    entrenador.setId(teclado.nextLine());

                    System.out.println("Ingrese la especialidad del entrenador: ");
                    entrenador.setEspecialidad(teclado.nextLine());

                    gimnasio.agregarPersona(entrenador);

                } else if (opc1 == 3){

                    System.out.println("Volviendo al menu principal...");

                } else {

                    System.out.println("Opcion no valida");

                }
                break;

            case 2:

                System.out.print("Ingrese la cedula de la persona a eliminar: ");
                String idEliminar = teclado.nextLine();
                gimnasio.eliminarPersona(idEliminar);
                break;

            case 3:

                gimnasio.mostrarPersonas();
                break;

            case 4:

                System.out.print("Ingrese la cedula de la persona a buscar: ");
                String idBuscar = teclado.nextLine();
                Persona persona = gimnasio.buscarPersona(idBuscar);
                if (persona != null) {
                    System.out.println(persona.obtenerInformacion());
                } else {
                    System.out.println("Cedula no registrada");
                }
                break;

            case 5:

                System.out.println("Saliendo del menu");
                break;

            default:

                System.out.println("Opción no válida");

            }
        } while (opc != 5);
    }
}