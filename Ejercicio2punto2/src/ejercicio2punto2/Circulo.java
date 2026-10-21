
package ejercicio2punto2;

class Circulo extends FiguraCircular {
    public Circulo(int radio) {
        this.radio = radio;
    }

    public double calcularArea() {
        return Math.PI * radio * radio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    public String imprimeFigura() {
        return "Se imprime una FiguraPlana...\n" +
               "Se imprime un Circulo con radio: " + radio + 
               ", area: " + String.format("%.2f", calcularArea()) + 
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}
