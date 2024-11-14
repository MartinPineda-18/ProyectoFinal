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

    public void mostrarPersonas() {
        for (Persona persona : personaHashMap.values()) {
            System.out.println(persona.obtenerInformacion());
        }
    }
}
