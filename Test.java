public class Test {
    public static void main(String[] args) {

        Rectangulo miRectangulo = new Rectangulo();
        miRectangulo.calcularAreaPerimetro(2, 5);
        System.out.println(miRectangulo);

        Circulo miCirculo = new Circulo();
        miCirculo.calcularAreaPerimetro(4);
        System.out.println(miCirculo);
    }
}
