package ejercicio2punto2;

class TrianguloRect extends FiguraRecta {
    public TrianguloRect(int ancho, int alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double calcularArea() {
        return (ancho * alto) / 2.0;
    }

    public double calcularPerimetro() {
        double c = Math.sqrt((ancho * ancho) + (alto * alto));
        return ancho + alto + c;
    }

    public String imprimeFigura() {
        return "Se imprime una FiguraPlana...\n" +
               "Se imprime un Triangulo con alto: " + alto + ", ancho: " + ancho + 
               ", area: " + String.format("%.2f", calcularArea()) + 
               ", perimetro: " + String.format("%.2f", calcularPerimetro());
    }
}