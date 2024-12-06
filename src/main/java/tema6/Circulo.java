package tema6;

public class Circulo {
    
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para establecer el radio
    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Método para obtener el radio
    public double getRadio() {
        return radio;
    }

    // Método para calcular la circunferencia
    public double calcularCircunferencia() {
        return 2 * Math.PI * radio;
    }

    // Método para calcular la superficie
    public double calcularSuperficie() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el diámetro
    public double calcularDiametro() {
        return 2 * radio;
    }
}