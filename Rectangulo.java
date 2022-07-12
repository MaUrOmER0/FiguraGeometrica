public class Rectangulo extends Figura {
    //--------
    //Atributos
    //--------
    private double base;
    private double altura;

    //---------
    //metodos
    //---------
    public Rectangulo() {

    }

    public double getBase() {
        return this.base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return this.altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void calcularAreaPerimetro(double base, double altura) { 
    
        this.base = base;
        this.altura = altura;

        area = base * altura;
        perimetro = 2 * (base + altura);
        
    }

    public String toString() {
        return "El area del Rectangulo es igual a: " + area + "\nEl perimetro del Rectangulo es igual a " + perimetro;
    }
}