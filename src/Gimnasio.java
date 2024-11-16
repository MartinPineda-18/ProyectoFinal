import java.util.HashMap;

public class Gimnasio implements GestionPersona{

    private HashMap<String, Persona> personaHashMap = new HashMap<>();

    @Override
    public void agregarPersona(Persona persona) {
        personaHashMap.put(persona.id, persona);
        System.out.println(persona.nombre + " ha sido agregado al gimnasio");

    }

    @Override
    public void eliminarPersona(String id) {
        personaHashMap.remove(id);
        System.out.println("La persona de identificacion "+id+" ha sido eliminada del gimnasio");

    }

    @Override
    public Persona buscarPersona(String id) {
        return personaHashMap.get(id);
    }

    public HashMap<String, Persona> getPersonaHashMap() {
        return personaHashMap;
    }

    public void setPersonaHashMap(HashMap<String, Persona> personaHashMap) {
        this.personaHashMap = personaHashMap;
    }

    public void mostrarPersonas() {
        for (Persona persona : personaHashMap.values()) {
            System.out.println(persona.obtenerInformacion());
        }
    }

    public void cobroMembresia() {
        System.out.println("Cobro mensualidad:");
        if (personaHashMap.isEmpty()) {
            System.out.println("Aun no hay clientes registrados");
        } else {
            for (Persona persona : personaHashMap.values()) {
                if (persona instanceof Cliente) { //instanceof para verificar que el objeto sea un Cliente, instanceof se utiliza para comprobar si un objeto es una instancia de una clase específica
                    Cliente cliente = (Cliente) persona; // Cast de Persona a Cliente, revisa el tipo de cada Persona antes de tratar de acceder a métodos específicos de Cliente
                    double cantidadPagar = cliente.pagoMembresia();
                    System.out.println("-Cliente: " + cliente.getNombre() + "\n" +
                            "-Membresía: " + cliente.getTipoMembresia() + "\n" +
                            "-Cantidad a pagar: $" + cantidadPagar);
                }
            }
        }
    }
}


