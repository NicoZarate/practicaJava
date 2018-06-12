package practicaJava;

public abstract class Categoria {
    private String descripcion;

    public Categoria(String descripcion) {
        this.descripcion = descripcion;
    }

    public abstract float sueldoTotal(){

    }
}
