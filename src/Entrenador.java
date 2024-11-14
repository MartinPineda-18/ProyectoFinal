public class Entrenador extends Persona{

    private String especialidad;

    @Override
    public String obtenerInformacion() {

        return "Informacion del entrenador:\n-Nombre: "+getNombre()+"\n-Edad: "+getEdad()+
                "\n-Identificacion: "+getId()+"\n-Especialidad: "+getEspecialidad()+"\n";
    }

    public Entrenador() {
    }

    public Entrenador(String nombre, int edad, String id, String especialidad) {
        super(nombre, edad, id);
        this.especialidad = especialidad;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }
}
