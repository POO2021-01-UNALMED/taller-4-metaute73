package classroom;

public class Asignatura {
	
	String nombre;
    String n = nombre;
    long codigoInterno;
    int codigoExterno;

    Asignatura() {
    	this("sin nombre", 0, 0);
     
    }

    Asignatura(long codigoInterno) {
        this("Sin nombre", codigoInterno, 0);
    }

    Asignatura(int codigoExterno) {
        this("Sin nombre", 0, codigoExterno);
    }

    Asignatura(String nombre) {
        this(nombre, 0, 0);
    }

    Asignatura(String nombre, long codigoInterno, int codigoExterno) {
        this.nombre = nombre;
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(int codigoInterno, int codigoExterno, String nombre) {
        this.codigoInterno = codigoInterno;
        this.codigoExterno = codigoExterno;
        this.nombre = nombre;
    }

    void cambiarDatos(long codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    void cambiarDatos(int codigoExterno) {
        this.codigoExterno = codigoExterno;
    }

    void cambiarDatos(String nombre) {
        this.nombre = nombre;
    }

    public void setCodigoInterno(int codigoInterno) {
        this.codigoInterno = codigoInterno;
    }
    
    public void setCodigoInterno(double codigoInterno) {
        this.codigoInterno = (int) codigoInterno;
    }
}
