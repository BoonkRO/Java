package jar;

public class circulo extends figuraGeometrica {
    
    private double radio;

    public circulo(){
        super();
    }

    public circulo(double radio) {
        super();
        this.radio = 0;
    }

    public circulo(String nombre, double radio) {
        super(nombre);
        this.radio = radio;
    }

    public double area() {
        return Math.PI * (this.radio * this.radio);
    }

}