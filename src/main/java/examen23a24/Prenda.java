package examen23a24;

import java.util.Random;


/**
 *
 * @author fernando.pargafernan
 */
public class Prenda {
    
    // Atributos
    private static long stockPrendas =0;
    private static String tipo;
    private static int referencia;
    private static double precioConIva;
    private static double precioSinIva;
    private static double iva;
    private static double talla;
    private static char sexo;
  
    // Constantes
    public static final char hombre = 'H';
    public static final char mujer = 'M';
    public static final String falda = "Falda";
    public static final String pantalon = "Pantalon";
    public static final String jersey = "Jersey";
    
    public static int generarReferencia(){
        Random random = new Random();
    int numeroRandom = random.nextInt(99999)+10000;
     return numeroRandom;
    }
    
    private void setPrecioConIva(){
    this.precioConIva = this.precioSinIva + (this.precioSinIva * this.iva / 100);
    }
    
    public Prenda(String tipo, int talla, char sexo, double precioSinIva, double iva) {
        this.referencia = generarReferencia();
        this.setTipo(tipo);
        this.sexo = sexo;
        this.precioSinIva = precioSinIva;
        this.iva = iva;
        stockPrendas++;
        this.setPrecioConIva();
    }
    
    public Prenda (String tipo, double precioSinIva){
    this(tipo, 42, 'H', precioSinIva, 21.0);
    }
    
    private void setTipo(String tipo) {
    if (tipo != null && (tipo.equalsIgnoreCase(pantalon) || tipo.equalsIgnoreCase(jersey) || tipo.equalsIgnoreCase(falda))){
    this.tipo = tipo.toLowerCase();
    }else{
        this.tipo = null;
    }
    }

    public String toString(){
    return "Prenda {"
            +"tipo='" + tipo + '\''
            +", talla= " + talla
            + ", sexo= " + sexo
            + ", precio sin iva= " + precioSinIva
            + ", iva= "
    }

 

    
   
    
    
    
    
}
