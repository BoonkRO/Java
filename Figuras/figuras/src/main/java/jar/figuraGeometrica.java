package jar;

public abstract class figuraGeometrica {
    private String nombre;

    public figuraGeometrica() {
        this.nombre = "desconocido";
    }

    public figuraGeometrica(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre(){
        return this.nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }


    public abstract double area();

}