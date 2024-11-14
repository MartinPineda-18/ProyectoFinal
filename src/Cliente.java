public class Cliente extends Persona {

    private String tipoMembresia;

    @Override
    public String obtenerInformacion() {

        return "Informacion del cliente:\n-Nombre: "+getNombre()+"\n-Edad: "+getEdad()+
                "\n-Identificacion: "+getId()+"\n-Membresia: "+getTipoMembresia()+"\n";
    }

    public Cliente() {
    }

    public Cliente(String nombre, int edad, String id, String tipoMembresia) {
        super(nombre, edad, id);
        this.tipoMembresia = tipoMembresia;
    }

    public String getTipoMembresia() {
        return tipoMembresia;
    }

    public void setTipoMembresia(String tipoMembresia) {
        this.tipoMembresia = tipoMembresia;
    }
}
