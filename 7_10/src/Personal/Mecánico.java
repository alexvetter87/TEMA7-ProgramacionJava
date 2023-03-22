package Personal;

public class Mecánico {
    String nombre;
    String telefono;

    enum Especialidad {
        FRENOS, HIDRAÚLICA, ELECTRICIDAD, MOTOR
    }

    Especialidad especialidad;

    public Mecánico(String nombre, String telefono, String especialidad) {
        this.nombre = nombre;
        this.telefono = telefono;
        this.especialidad = Especialidad.valueOf(especialidad);
    }

}
