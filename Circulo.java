public class Circulo extends Figura { 

    private double radio;

    public double getRadio() {
        return this.radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

   public void calcularAreaPerimetro(double radio) {

    area = Math.PI * Math.pow(radio, 2);
    perimetro = 2 * Math.PI * radio;

   }
   public String toString() { 

    return "El Area del Circulo es igual a: " + area + "\nEl perimetro del circulo es igual a: " + perimetro;

   }

}