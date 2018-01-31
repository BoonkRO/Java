package jar;

public class rectangulo{

    private double base = 0d;
    private double altura = 0d;

    public rectangulo(){
        super();
    }


    public rectangulo(double base, double altura){
        this.base = base;
        this.altura = altura;
    }

    public double getAltura(){
        return this.altura;
    }

    public void setAltura(double altura){
        this.altura = altura;
    }

    public double getBase(){
        return this.base;
    }

    public void setBase(double base){
        this.base = base;
    }

    public double area(){
        return getBase() * getAltura();
    }
    
    
}