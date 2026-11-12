package Exercises;

public class Padre {
    String apellido;
    
    public Padre(String apellido){
        this.apellido = apellido;
    }

    public boolean test() {
    Hijo hijo = new Hijo("Juan", this.apellido);
    EspirituSanto espirituSanto =
        new EspirituSanto(hijo.nombre, hijo.apellido, "Lopez");
    return espirituSanto.pruebaParternidad();
    }
}